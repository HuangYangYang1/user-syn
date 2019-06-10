package com.oce.testsync.toservice;

import com.oce.testsync.client.WsClient;
import com.oce.testsync.domain.DepartmentBean;
import com.oce.testsync.domain.DeptRelation;
import com.oce.testsync.domain.JobTitleBean;
import com.oce.testsync.domain.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/*
* 同步到数据库的操作service类
*
* */
@Component
public class SyncToService {
    @Autowired
    WsClient wsClient;


    //    获取岗位的信息,
    public void getPositionInfo() {
        List<JobTitleBean> jobTitleBeans = wsClient.getHrmJobTitleInfoXMLRespose();
        for (JobTitleBean jobTitleBean : jobTitleBeans) {

        }
    }
    //   获取部门的信息
    public void getDepartmentInfo() {
        List<DepartmentBean> departmentBeans = wsClient.getHrmDepartmentInfoXMLResponse();
        for (DepartmentBean departmentBean : departmentBeans) {

        }
    }

    //    获取用户信息并处理t_user_department、t_user_manager、t_user_post关系表
    public void getUserInfo() {
        List<UserBean> userBeans = wsClient.getHrmUserInfoXMLResponse();
        for (UserBean userBean : userBeans) {
            String userId = userBean.getUserid();
//            获取岗位的id和当前的userid并..
            userBean.getJobtitle();


//            获取部门id并....
            userBean.getJobtitle();


//            获取上级id并...
            userBean.getManagerid();


//            存当前的user


        }

    }

    //    获取全部部门的关系信息并存入List<DeptRelation>
    public void getDepartmentRelation() {
        List<DepartmentBean> departmentBeans = wsClient.getHrmDepartmentInfoXMLResponse();
        List<DeptRelation> result = new ArrayList<>();
        for (DepartmentBean departmentBean : departmentBeans) {
            //result.add(new DeptRelation(departmentBean.getDepartmentid(), departmentBean.getSupdepartmentid(), 1));
            getDepartmentRelation(departmentBean.getDepartmentid(), departmentBean.getDepartmentid(), departmentBeans, result);
        }
        for (DeptRelation deptRelation : result) {
//           传递存入同步数据

            System.out.println(deptRelation);
        }
    }
    //    获取部门之间关系的递归方法
    public void getDepartmentRelation(String departmentid, String supdepartmentid, List<DepartmentBean> departmentBeans, List<DeptRelation> result) {

        for (DepartmentBean departmentBean : departmentBeans) {
//            if (departmentBean.getDepartmentid().equals(supdepartmentid)) {
//                if (departmentid.equals(departmentBean.getDepartmentid())) {
//                    result.add(new DeptRelation(departmentid, departmentBean.getSupdepartmentid(), 1));
//                }else{
//                    result.add(new DeptRelation(departmentid, departmentBean.getSupdepartmentid(), 0));
//                }
//                getDepartmentRelation(departmentid, departmentBean.getSupdepartmentid(), departmentBeans, result);
//            }
            if (departmentBean.getDepartmentid().equals(supdepartmentid)) {
                if (departmentid.equals(supdepartmentid)) {
//                   如果是直属子类则设is_sub为1
                    result.add(new DeptRelation(departmentid, departmentBean.getSupdepartmentid(), 1));
                }else{
//                   如果不是直属子类则设is_sub为0
                    result.add(new DeptRelation(departmentid, departmentBean.getSupdepartmentid(), 0));
                }
                getDepartmentRelation(departmentid, departmentBean.getSupdepartmentid(), departmentBeans, result);
            }

        }
    }


}

package com.oce.testsync.toservice;

import com.oce.base.bean.*;
import com.oce.base.service.*;
import com.oce.testsync.client.WsClient;
import com.oce.testsync.domain.DepartmentBean;
import com.oce.testsync.domain.DeptRelation;
import com.oce.testsync.domain.JobTitleBean;
import com.oce.testsync.domain.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * 同步到数据库的操作service类
 *
 * @author yang.huang
 * @since 2019/6/12 12:00
 */
@Component
public class SyncAllService {
    @Autowired
    WsClient wsClient;
    @Autowired
    DepartmentService departmentService;
    @Autowired
    UserDepartmentService userDepartmentService;
    @Autowired
    DoubleDepartmentService doubleDepartmentService;
    @Autowired
    UserPostService userPostService;
    @Autowired
    UserService userService;
    @Autowired
    PostService postService;
    @Autowired
    UserManagerService userManagerService;
    /**
     * 获取岗位信息调用Service存入数据库
     *
     * @param []
     * @return void
     */
    public void getPositionInfo() {
        List<JobTitleBean> jobTitleBeans = wsClient.getHrmJobTitleInfoXMLRespose();
        for (JobTitleBean jobTitleBean : jobTitleBeans) {
            TPost tPost = new TPost();
            tPost.setId(Long.parseLong(jobTitleBean.getJobtitleid()));
            tPost.setFull_name(jobTitleBean.getFullname());
            tPost.setShort_name(jobTitleBean.getFullname());
            tPost.setRemark(jobTitleBean.getJobtitleremark());
            postService.insertPost(tPost);
        }
    }
    /**
     *  获取部门的信息调用Service存入数据库
     *
     * @param []
     * @return void
     */
    public void getDepartmentInfo() {
        List<DepartmentBean> departmentBeans = wsClient.getHrmDepartmentInfoXMLResponse();
        for (DepartmentBean departmentBean : departmentBeans) {

            TDepartment tDepartment = new TDepartment();
            tDepartment.setId(Long.parseLong(departmentBean.getDepartmentid()));
            tDepartment.setFull_name(departmentBean.getFullname());
            tDepartment.setShort_name(departmentBean.getShortname());
            tDepartment.setCanceled(departmentBean.getCanceled());
            tDepartment.setShow_order(departmentBean.getShoworder());
//            调用service方法村存入数据库
            departmentService.isnertDepartment(tDepartment);

        }
    }

    /**
     * 获取用户信息并处理t_user_department、t_user_manager、t_user_post关系表调用对应service存入数据库
     *
     * @param []
     * @return void
     */
    public void getUserInfo() {
        List<UserBean> userBeans = wsClient.getHrmUserInfoXMLResponse();
        for (UserBean userBean : userBeans) {
            String userId = userBean.getUserid();
//            获取岗位的id和当前的userid并..
            TUserPost tUserPost = new TUserPost();
            tUserPost.setUser_id(Long.parseLong(userId));
            tUserPost.setPost_id(Long.parseLong(userBean.getJobtitle()));
            userPostService.insert(tUserPost);

//            获取部门id并....
            TUserDepartment tUserDepartment = new TUserDepartment();
            tUserDepartment.setUser_id(Long.parseLong(userId));
            tUserDepartment.setDepartment_id(Long.parseLong(userBean.getDepartmentid()));
            userDepartmentService.insert(tUserDepartment);
//            获取上级id并...
            TUserManager tUserManager = new TUserManager();
            tUserManager.setUser_id(Long.parseLong(userId));
            if (!"".equals(userBean.getManagerid())){
                tUserManager.setManager_id(Long.parseLong(userBean.getManagerid()));
            }
            userManagerService.insert(tUserManager);

//            存当前的user
            TUser tUser = new TUser();
            tUser.setId(Long.parseLong(userId));
            tUser.setEmail(userBean.getEmail());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                if (!"".equals(userBean.getBirthday())){
                    tUser.setBirthday(simpleDateFormat.parse(userBean.getBirthday()));
                }
                if (!"".equals(userBean.getEnddate())){

                    tUser.setEnd_date(simpleDateFormat.parse(userBean.getEnddate()));
                }
                if (!"".equals(userBean.getStartdate())){
                    tUser.setStart_date(simpleDateFormat.parse(userBean.getStartdate()));
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
            tUser.setFolk(userBean.getFolk());
            tUser.setId_card(userBean.getCertificatenum());
            tUser.setLocation_place(userBean.getLocationid());
            tUser.setLast_name(userBean.getLastname());
            tUser.setLogin_id(userBean.getLoginid());
            tUser.setMarital_status(userBean.getMaritalstatus());
            tUser.setMobile(userBean.getMobile());
            tUser.setNative_place(userBean.getNativeplace());
            tUser.setRegresident_place(userBean.getRegresidentplace());
            String sex = userBean.getSex();
            if ("女".equals(sex)){
                tUser.setSex(1);
            }else{
                tUser.setSex(0);
            }
            tUser.setState(Long.parseLong(userBean.getStatus()));
            tUser.setSystem_language(userBean.getSystemlanguage());
            tUser.setTelephone(userBean.getTelephone());
            userService.insertUser(tUser);
        }
    }

    /**
     * 获取部门的关系信息并调用service存入数据库
     *
     * @param []
     * @return void
     */
    public void getDepartmentRelation() {
        List<DepartmentBean> departmentBeans = wsClient.getHrmDepartmentInfoXMLResponse();
        List<DeptRelation> result = new ArrayList<>();
        for (DepartmentBean departmentBean : departmentBeans) {
            //result.add(new DeptRelation(departmentBean.getDepartmentid(), departmentBean.getSupdepartmentid(), 1));
            getDepartmentRelation(departmentBean.getDepartmentid(), departmentBean.getDepartmentid(), departmentBeans, result);
        }
        for (DeptRelation deptRelation : result) {
//           传递存入同步数据
            TDepartmentDepartment tDepartmentDepartment = new TDepartmentDepartment();
            tDepartmentDepartment.setChile_dpartment_id(Long.parseLong(deptRelation.getChild()));
            tDepartmentDepartment.setFather_departmet_id(Long.parseLong(deptRelation.getParent()));
            tDepartmentDepartment.setIs_sub( deptRelation.getIs_sub());

//            调用service方法村存入数据库
            doubleDepartmentService.insert(tDepartmentDepartment);
            System.out.println(deptRelation);
        }
    }
    /**
     * 获取部门之间关系的递归方法
     *
     * @param [departmentid, supdepartmentid, departmentBeans, result]
     * @return void
     */
    public void getDepartmentRelation(String departmentid, String supdepartmentid, List<DepartmentBean> departmentBeans, List<DeptRelation> result) {

        for (DepartmentBean departmentBean : departmentBeans) {
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

package com.oce.testsync.client;


import com.oce.testsync.domain.DepartmentBean;
import com.oce.testsync.domain.JobTitleBean;
import com.oce.testsync.domain.UserBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@SpringBootTest
@RunWith(SpringRunner.class)
public class WsClientTest {
    @Autowired
    WsClient wsClient;

    private static final Logger logger = LoggerFactory.getLogger(WsClientTest.class);

    @Test
    public void getHrmUserInfoXMLResponse(){

        List<UserBean> userBeanList = wsClient.getHrmUserInfoXMLResponse();
        if (userBeanList == null){
            return ;
        }
        int i = 0;
        for (UserBean userBean : userBeanList){
            i++;
            logger.info(i + ":" + userBean.toString());
        }
    }
    @Test
    public void getHrmDepartmentInfoXMLResponse(){

        List<DepartmentBean> departmentBeans = wsClient.getHrmDepartmentInfoXMLResponse();
        if (departmentBeans == null){
            return ;
        }
        int i = 0;
        int j = 0;
        for (DepartmentBean departmentBean : departmentBeans){
            i++;
            logger.info(i + ":" + departmentBean.toString());
        }
    }
    @Test
    public void getHrmJobTitleInfoXMLRespose(){

        List<JobTitleBean> jobTitleBeans = wsClient.getHrmJobTitleInfoXMLRespose();
        if (jobTitleBeans == null){
            return ;
        }
        int i = 0;
        int j = 0;
        for (JobTitleBean jobTitleBean : jobTitleBeans){
            i++;
            if (jobTitleBean.getFullname().equals(jobTitleBean.getShortname())){
                j++;
                logger.info(j + "fullname-shortname:" + jobTitleBean.getShortname());
            }
            logger.info(i + ":" + jobTitleBean.toString());
        }
    }



}

package com.oce.testsync.client;

import com.dexcoder.ws.*;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.oce.testsync.domain.*;
import com.oce.testsync.domain.DepartmentBean;
import com.oce.testsync.domain.JobTitleBean;
import com.oce.testsync.domain.UserBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.io.IOException;
import java.util.List;

public class WsClient extends WebServiceGatewaySupport {
//    private static final String uri = "http://10.0.10.227/services/HrmService";
    private static final String IP = "10.0.50.179";
    private static final Logger logger = LoggerFactory.getLogger(WsClient.class);
//   xml转bean，bean转xml
    private static XmlMapper xmlMapper = new XmlMapper();

    /* 对接获取全部用户信息的接口
    * 获取信息并返回list
    */
    public List<UserBean> getHrmUserInfoXMLResponse(){
        GetHrmUserInfoXML request = new GetHrmUserInfoXML();
        request.setIn0(IP);
        GetHrmUserInfoXMLResponse res = (GetHrmUserInfoXMLResponse) getWebServiceTemplate().marshalSendAndReceive(request);
        String resXml = res.getOut();
        List<UserBean> userBeanList = null;
        try {
            userBeanList = xmlMapper.readValue(resXml, UserBeanList.class).getUserBeans();
            return userBeanList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userBeanList;
    }

    /* 获取全部部门的信息
    * 返回部门的list集合
    */
    public List<DepartmentBean> getHrmDepartmentInfoXMLResponse(){
        GetHrmDepartmentInfoXML req = new GetHrmDepartmentInfoXML();
        req.setIn0(IP);
        GetHrmDepartmentInfoXMLResponse res = (GetHrmDepartmentInfoXMLResponse)getWebServiceTemplate().marshalSendAndReceive(req);
        String resxml = res.getOut();

        List<DepartmentBean> departmentBeans = null;
        try {
            departmentBeans = xmlMapper.readValue(resxml,DepartmentBeanList.class).getDepartmentBeans();
            logger.info("departmentBeans:" + departmentBeans);
            return departmentBeans;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return departmentBeans;
    }

    /* 获取全部岗位的信息
    * 返回岗位信息的集合
    */
    public List<JobTitleBean> getHrmJobTitleInfoXMLRespose(){
        GetHrmJobTitleInfoXML req = new GetHrmJobTitleInfoXML();
        req.setIn0(IP);
        GetHrmJobTitleInfoXMLResponse res = (GetHrmJobTitleInfoXMLResponse) getWebServiceTemplate().marshalSendAndReceive(req);
        String resxml = res.getOut();
        logger.info("getHrmJobTitleInfoXMLRespose:" + resxml);
        List<JobTitleBean> jobTitleBeans = null;
        try {
            jobTitleBeans = xmlMapper.readValue(resxml, JobTitleBeanList.class).getJobTitleBeans();
            return jobTitleBeans;
        } catch (IOException e) {
            e.printStackTrace();
        }


        return jobTitleBeans;
    }
}

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

/**
 * ws客户端使用类 ，用于获取数据并处理成List<Bean>后返回
 *
 * @author yang.huang
 * @since 2019/6/12 11:32
 */
public class WsClient extends WebServiceGatewaySupport {
    /**
     * 调用接口IP参数
     */
    private static final String IP = "10.0.50.179";
    /**
     * Logger
     */
    private static final Logger logger = LoggerFactory.getLogger(WsClient.class);
    /**
     * xmlMapper处理
     */
    private static XmlMapper xmlMapper = new XmlMapper();

   /** 
    * 对接获取全部用户信息的接口
    *
    * @param [] 
    * @return java.util.List<com.oce.testsync.domain.UserBean> 用户list列表
    */
    public List<UserBean> getHrmUserInfoXMLResponse() {
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

    /**
     * 获取全部部门的信息
     *
     * @param []
     * @return java.util.List<com.oce.testsync.domain.DepartmentBean>  部门列表
     */
    public List<DepartmentBean> getHrmDepartmentInfoXMLResponse() {
        GetHrmDepartmentInfoXML req = new GetHrmDepartmentInfoXML();
        req.setIn0(IP);
        GetHrmDepartmentInfoXMLResponse res = (GetHrmDepartmentInfoXMLResponse) getWebServiceTemplate().marshalSendAndReceive(req);
        String resxml = res.getOut();

        List<DepartmentBean> departmentBeans = null;
        try {
            departmentBeans = xmlMapper.readValue(resxml, DepartmentBeanList.class).getDepartmentBeans();
            logger.info("departmentBeans:" + departmentBeans);
            return departmentBeans;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return departmentBeans;
    }

    /**
     * 获取全部岗位的信息
     *
     * @param []
     * @return java.util.List<com.oce.testsync.domain.JobTitleBean> 岗位列表
     */
    public List<JobTitleBean> getHrmJobTitleInfoXMLRespose() {
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

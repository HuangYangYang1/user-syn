package com.oce.testsync.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

/**
 *  岗位list
 *
 * @author yang.huang
 * @since 2019/6/12 11:49
 */
@JacksonXmlRootElement(localName = "JobTitleBean-array")
public class JobTitleBeanList {

    /**
     * 岗位list
     */
    List<JobTitleBean> jobTitleBeans;

    /**
     * 获取岗位list
     *
     * @param []
     * @return java.util.List<com.oce.testsync.domain.JobTitleBean>
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "JobTitleBean")
    public List<JobTitleBean> getJobTitleBeans() {
        return jobTitleBeans;
    }
    /**
     * 设置岗位list
     *
     * @param [jobTitleBeans]
     * @return void
     */
    public void setJobTitleBeans(List<JobTitleBean> jobTitleBeans) {
        this.jobTitleBeans = jobTitleBeans;
    }
}

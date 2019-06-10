package com.oce.testsync.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "JobTitleBean-array")
public class JobTitleBeanList {


    List<JobTitleBean> jobTitleBeans;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "JobTitleBean")
    public List<JobTitleBean> getJobTitleBeans() {
        return jobTitleBeans;
    }

    public void setJobTitleBeans(List<JobTitleBean> jobTitleBeans) {
        this.jobTitleBeans = jobTitleBeans;
    }
}

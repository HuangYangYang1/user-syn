package com.oce.testsync.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;
/*
* 处理xml返回的list进行处理
* */
@JacksonXmlRootElement(localName = "DepartmentBean-array")
public class DepartmentBeanList {

    List<DepartmentBean> departmentBeans;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "DepartmentBean")
    public List<DepartmentBean> getDepartmentBeans() {
        return departmentBeans;
    }

    public void setDepartmentBeans(List<DepartmentBean> departmentBeans) {
        this.departmentBeans = departmentBeans;
    }
}

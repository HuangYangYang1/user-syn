package com.oce.testsync.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

/**
 *  部门list
 *
 * @author yang.huang
 * @since 2019/6/12 11:41
 */
@JacksonXmlRootElement(localName = "DepartmentBean-array")
public class DepartmentBeanList {
    /**
     * 部门list
     */
    List<DepartmentBean> departmentBeans;

    /**
     * 获取部门list
     *
     * @param []
     * @return java.util.List<com.oce.testsync.domain.DepartmentBean> 部门列表
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "DepartmentBean")
    public List<DepartmentBean> getDepartmentBeans() {
        return departmentBeans;
    }
    /**
     * 设置部门list
     *
     * @param [departmentBeans]
     * @return void
     */
    public void setDepartmentBeans(List<DepartmentBean> departmentBeans) {
        this.departmentBeans = departmentBeans;
    }
}

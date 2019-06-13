package com.oce.testsync.domain;

/**
 * 用于处理即时触发的部门bean
 *
 * @author yang.huang
 * @since 2019/6/13 9:35
 */
public class DeptInstant {
    /**
     * 部门id
     */
    private String departmentid;
    /**
     * 简称
     */
    private String shortname;
    /**
     * 全称
     */
    private String fullname;
    /**
     * 子公司id
     */
    private String subcompanyid;
    /**
     * 上级部门id
     */
    private String supdepartmentid;
    /**
     * 展示顺序
     */
    private String showorder;
    /**
     * 无用code
     */
    private String code;
    /**
     * 无用code
     */
    private String parent_code;
    /**
     * 无用code
     */
    private String subcompany_code;
    /**
     * 操作类型
     */
    private String action ;
    /**
     * 上次修改时间，无用
     */
    private String lastChangdate;
    /**
     * 是否取消？无用数据
     */
    private String canceled;

    @Override
    public String toString() {
        return "Dept{" +
                "departmentid='" + departmentid + '\'' +
                ", shortname='" + shortname + '\'' +
                ", fullname='" + fullname + '\'' +
                ", subcompanyid='" + subcompanyid + '\'' +
                ", supdepartmentid='" + supdepartmentid + '\'' +
                ", showorder='" + showorder + '\'' +
                ", code='" + code + '\'' +
                ", parent_code='" + parent_code + '\'' +
                ", subcompany_code='" + subcompany_code + '\'' +
                ", action='" + action + '\'' +
                ", lastChangdate='" + lastChangdate + '\'' +
                ", canceled='" + canceled + '\'' +
                '}';
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getSubcompanyid() {
        return subcompanyid;
    }

    public void setSubcompanyid(String subcompanyid) {
        this.subcompanyid = subcompanyid;
    }

    public String getSupdepartmentid() {
        return supdepartmentid;
    }

    public void setSupdepartmentid(String supdepartmentid) {
        this.supdepartmentid = supdepartmentid;
    }

    public String getShoworder() {
        return showorder;
    }

    public void setShoworder(String showorder) {
        this.showorder = showorder;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParent_code() {
        return parent_code;
    }

    public void setParent_code(String parent_code) {
        this.parent_code = parent_code;
    }

    public String getSubcompany_code() {
        return subcompany_code;
    }

    public void setSubcompany_code(String subcompany_code) {
        this.subcompany_code = subcompany_code;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getLastChangdate() {
        return lastChangdate;
    }

    public void setLastChangdate(String lastChangdate) {
        this.lastChangdate = lastChangdate;
    }

    public String getCanceled() {
        return canceled;
    }

    public void setCanceled(String canceled) {
        this.canceled = canceled;
    }
}
package com.oce.testsync.domain;

public class DepartmentBean {

    private java.lang.String departmentid;// 部门id

    private java.lang.String shortname;//简称

    private java.lang.String fullname;//全称

    private java.lang.String subcompanyid;//所属分部id

    private java.lang.String supdepartmentid;//上级部门id

    private java.lang.String showorder;//显示顺序

    /**
     * 部门编码
     * 仅一个有值为10，建议delete
     */
    private java.lang.String code;
    /**
     * 是否封存
     * 有null有0、1
     */
    private java.lang.String canceled;
    /*
    * 最近修改的时间
    * 返回值为两位数字 各接口得来数据均为21，建议delete
    * */
    private String lastChangdate;
    /*
     * 其他接口同步进去oa时的操作
     * null，建议delete
     * */
    private String action;

    public DepartmentBean(String departmentid,  String supdepartmentid) {
        this.departmentid = departmentid;
        this.supdepartmentid = supdepartmentid;
    }

    @Override
    public String toString() {
        return "DepartmentBean{" +
                "departmentid='" + departmentid + '\'' +
                ", shortname='" + shortname + '\'' +
                ", supdepartmentid='" + supdepartmentid + '\'' +
                '}';
    }

    public DepartmentBean() {
    }

    public String getLastChangdate() {
        return lastChangdate;
    }

    public void setLastChangdate(String lastChangdate) {
        this.lastChangdate = lastChangdate;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
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

    public String getCanceled() {
        return canceled;
    }

    public void setCanceled(String canceled) {
        this.canceled = canceled;
    }
}

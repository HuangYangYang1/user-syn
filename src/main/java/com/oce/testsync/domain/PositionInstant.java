package com.oce.testsync.domain;

/**
 *  用于处理即时触发的岗位bean
 *
 * @author yang.huang
 * @since 2019/6/13 13:52
 */
public class PositionInstant {
    /**
     * 操作类型
     */
    private String action;
    /**
     * 无用code
     */
    private String code;
    /**
     * 岗位id
     */
    private String jobtitleid;

    /**
     * 简称
     */
    private String shortname;
    /**
     * 全称
     */
    private String fullname;
    /**
     * 部门id
     */
    private String departmentid;
    /**
     *无用code
     */
    private String departmentcode;
    /**
     * 岗位备注
     */
    private String jobtitleremark;
    /**
     * 最近修改时间
     */
    private String lastChangdate;

    @Override
    public String toString() {
        return "Position{" +
                "action='" + action + '\'' +
                ", code='" + code + '\'' +
                ", jobtitleid='" + jobtitleid + '\'' +
                ", shortname='" + shortname + '\'' +
                ", fullname='" + fullname + '\'' +
                ", departmentid='" + departmentid + '\'' +
                ", departmentcode='" + departmentcode + '\'' +
                ", jobtitleremark='" + jobtitleremark + '\'' +
                ", lastChangdate='" + lastChangdate + '\'' +
                '}';
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getJobtitleid() {
        return jobtitleid;
    }

    public void setJobtitleid(String jobtitleid) {
        this.jobtitleid = jobtitleid;
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

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentcode() {
        return departmentcode;
    }

    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

    public String getJobtitleremark() {
        return jobtitleremark;
    }

    public void setJobtitleremark(String jobtitleremark) {
        this.jobtitleremark = jobtitleremark;
    }

    public String getLastChangdate() {
        return lastChangdate;
    }

    public void setLastChangdate(String lastChangdate) {
        this.lastChangdate = lastChangdate;
    }
}

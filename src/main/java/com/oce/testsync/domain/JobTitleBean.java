package com.oce.testsync.domain;

public class JobTitleBean {

    /**
     * 岗位id
     */
    private  String jobtitleid;
    /** 需要确认同以下的fullname是否全部相同
     * 简称
     */
    private String shortname;
    /**
     * 全称
     */
    private String fullname;


    /**
     * 所属部门id
     * null，建议delete
     */
    private String departmentid;
    /**
     * 岗位职责
     * null，建议delete
     */
    private String jobresponsibility;
    /**
     * 任职资格
     * null，建议delete
     */
    private String jobcompetency;
    /**
     * 相关文档
     * null，建议delete
     */
    private String jobdoc;
    /**
     * 备注
     * null，建议delete
     */
    private String jobtitleremark;
    /*
    * 最近修改的时间
    * 值为两位数字,delete
    * */
    private String lastChangdate;

    @Override
    public String toString() {
        return "JobTitleBean{" +
                "jobtitleid='" + jobtitleid + '\'' +
                ", shortname='" + shortname + '\'' +
                ", fullname='" + fullname + '\'' +
                ", departmentid='" + departmentid + '\'' +
                ", jobresponsibility='" + jobresponsibility + '\'' +
                ", jobcompetency='" + jobcompetency + '\'' +
                ", jobdoc='" + jobdoc + '\'' +
                ", jobtitleremark='" + jobtitleremark + '\'' +
                ", lastChangdate='" + lastChangdate + '\'' +
                '}';
    }

    public String getLastChangdate() {
        return lastChangdate;
    }

    public void setLastChangdate(String lastChangdate) {
        this.lastChangdate = lastChangdate;
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

    public String getJobresponsibility() {
        return jobresponsibility;
    }

    public void setJobresponsibility(String jobresponsibility) {
        this.jobresponsibility = jobresponsibility;
    }

    public String getJobcompetency() {
        return jobcompetency;
    }

    public void setJobcompetency(String jobcompetency) {
        this.jobcompetency = jobcompetency;
    }

    public String getJobdoc() {
        return jobdoc;
    }

    public void setJobdoc(String jobdoc) {
        this.jobdoc = jobdoc;
    }

    public String getJobtitleremark() {
        return jobtitleremark;
    }

    public void setJobtitleremark(String jobtitleremark) {
        this.jobtitleremark = jobtitleremark;
    }
}

package com.oce.testsync.domain;

/**
 *  用于即时处理user的bean
 *
 * @author yang.huang
 * @since 2019/6/13 13:53
 */
public class UserInstant {
    /**
     * userid
     */
    private int userid;
    /**
     * 子部门id
     */
    private String subcompanyid1;
    /**
     * 部门id
     */
    private String departmentid;
    /**
     * 子公司名字
     */
    private String subcompanyname;
    /**
     * 部门名字
     */
    private String departmentname;
    /**
     *  无用code
     */
    private String subcompanycode;
    /**
     *  无用code
     */
    private String departmentcode;
    /**
     *  无用code
     */
    private String jobtitlecode;
    /**
     * 工作code
     */
    private String workcode;
    /**
     * 中文名字
     */
    private String lastname;
    /**
     * 登陆id
     */
    private String loginid;
    /**
     * 无用密码
     */
    private String password;
    /**
     * 阶级
     */
    private String seclevel;
    /**
     * 性别
     */
    private String sex;
    /**
     * 岗位名字
     */
    private String jobtitle;
    /**
     * 上级id
     */
    private String managerid;
    /**
     * 上级无用code
     */
    private String managercode;
    /**
     * 状态
     */
    private String status;
    /**
     * 电话
     */
    private String telephone;
    /**
     *移动电话
     */
    private String mobile;
    /**
     * 传真无用
     */
    private String fax;
    /**
     * 身份证号码
     */
    private String certificatenum;
    /**
     * 电子邮箱
     */
    private String email;
    /**
     * 系统语言
     */
    private String systemlanguage;
    /**
     * 生日
     */
    private String birthday;
    /**
     * 合同启动时间
     */
    private String startdate = "";
    /**
     * 合同结束时间
     */
    private String enddate = "";
    /**
     * 新增时间
     */
    private String createdate = "";
    /**
     * 上次修改得时间
     */
    private String lastChangdate = "";
    /**
     * 操作类型
     */
    private String action = "";

    @Override
    public String toString() {
        return "UserInstant{" +
                "userid=" + userid +
                ", subcompanyid1='" + subcompanyid1 + '\'' +
                ", departmentid='" + departmentid + '\'' +
                ", subcompanyname='" + subcompanyname + '\'' +
                ", departmentname='" + departmentname + '\'' +
                ", subcompanycode='" + subcompanycode + '\'' +
                ", departmentcode='" + departmentcode + '\'' +
                ", jobtitlecode='" + jobtitlecode + '\'' +
                ", workcode='" + workcode + '\'' +
                ", lastname='" + lastname + '\'' +
                ", loginid='" + loginid + '\'' +
                ", password='" + password + '\'' +
                ", seclevel='" + seclevel + '\'' +
                ", sex='" + sex + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", managerid='" + managerid + '\'' +
                ", managercode='" + managercode + '\'' +
                ", status='" + status + '\'' +
                ", telephone='" + telephone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", fax='" + fax + '\'' +
                ", certificatenum='" + certificatenum + '\'' +
                ", email='" + email + '\'' +
                ", systemlanguage='" + systemlanguage + '\'' +
                ", birthday='" + birthday + '\'' +
                ", startdate='" + startdate + '\'' +
                ", enddate='" + enddate + '\'' +
                ", createdate='" + createdate + '\'' +
                ", lastChangdate='" + lastChangdate + '\'' +
                ", action='" + action + '\'' +
                '}';
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getSubcompanyid1() {
        return subcompanyid1;
    }

    public void setSubcompanyid1(String subcompanyid1) {
        this.subcompanyid1 = subcompanyid1;
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }

    public String getSubcompanyname() {
        return subcompanyname;
    }

    public void setSubcompanyname(String subcompanyname) {
        this.subcompanyname = subcompanyname;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getSubcompanycode() {
        return subcompanycode;
    }

    public void setSubcompanycode(String subcompanycode) {
        this.subcompanycode = subcompanycode;
    }

    public String getDepartmentcode() {
        return departmentcode;
    }

    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

    public String getJobtitlecode() {
        return jobtitlecode;
    }

    public void setJobtitlecode(String jobtitlecode) {
        this.jobtitlecode = jobtitlecode;
    }

    public String getWorkcode() {
        return workcode;
    }

    public void setWorkcode(String workcode) {
        this.workcode = workcode;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSeclevel() {
        return seclevel;
    }

    public void setSeclevel(String seclevel) {
        this.seclevel = seclevel;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getManagerid() {
        return managerid;
    }

    public void setManagerid(String managerid) {
        this.managerid = managerid;
    }

    public String getManagercode() {
        return managercode;
    }

    public void setManagercode(String managercode) {
        this.managercode = managercode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCertificatenum() {
        return certificatenum;
    }

    public void setCertificatenum(String certificatenum) {
        this.certificatenum = certificatenum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSystemlanguage() {
        return systemlanguage;
    }

    public void setSystemlanguage(String systemlanguage) {
        this.systemlanguage = systemlanguage;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
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
}
package com.oce.testsync.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserBean{

    private String userid ;               //用户id
    private String subcompanyid1;  //分部
    private String departmentid;   //部门id
    private String departmentname; //部门的名字     多余，建议delete
    private String subcompanyname; //子公司的名字   多余，建议delete
    private String workcode;       //编号
    private String lastname;       //姓名
    private String loginid;        //系统账号       有空值，有的带后缀@...，有的无
    private String password;       //密码           部分空
    private String seclevel;        //安全级别
    private String sex;            //性别
    private String jobtitle;       //岗位id
    private String jobactivityid;  //职务           极大多数为空，建议delete
    private String jobgroupid;     //职务类型       极大多数为空，建议delete
    private String jobcall;        //职称           极大多数为空，建议delete
    private String joblevel;        //职级          多为0，建议delete
    private String jobactivitydesc;//职责描述       极大多数为空，建议delete
    private String managerid;      //直接上级id（userid）   有空值和0
    private String assistantid;    //助理            多为空值和0，建议delete
    private String status;         //状态eg:正式、试用等
    private String locationid;     //办公地点id      需要办公地点表，建议delete
    private String workroom;       //办公室          空值，建议delete
    private String telephone;      //办公电话        多为空，建议delete
    private String mobile;         //移动电话        多为空
    private String mobilecall;     //其他电话        空，建议delete
    private String fax;            //传真            建议delete
    private String email;          //电子邮件        有qq，@oce.cn
    private String systemlanguage;//系统语言  默认7  建议delete
    private String birthday;       //生日            多为空
    private String folk;           //名族
    private String nativeplace;     //籍贯
    private String regresidentplace; //户口地址
    private String certificatenum;  //身份证号
    private String maritalstatus;   //婚姻状况
    private String policy;          //政治面貌       空，建议delete
    private String bememberdate;    //入团日期       空，建议delete
    private String bepartydate;     //入党日期       空，建议delete
    private String islabouunion;    //是否是工会会员 空，建议delete
    private String educationlevel;  //学历           数字表示，建议delete
    private String degree;           //学位          空，建议delete
    private String healthinfo;       //健康状况      0，空，建议delete
    private String height;           //身高          建议delete
    private String weight;          //体重           建议delete
    private String residentplace;    //居住地
    private String homeaddress;      //家庭住址      空，建议delete
    private String tempresidentnumber; //暂住证号码  空，建议delete
    private String accounttype;        //账号类型    0
    private String dsporder;           //显示顺序
    private String startdate = "" ;   //合同开始日期
    private String enddate = "" ;     //合同结束日期
    private String createdate="";     //创建日期
    private String lastChangdate="";  //最后修改日期，正确的时间格式yyyy-mm-dd


    @Override
    public String toString() {
        return "UserBean{" +
                "userid='" + userid + '\'' +
                ", subcompanyid1='" + subcompanyid1 + '\'' +
                ", departmentid='" + departmentid + '\'' +
                ", departmentname='" + departmentname + '\'' +
                ", subcompanyname='" + subcompanyname + '\'' +
                ", workcode='" + workcode + '\'' +
                ", lastname='" + lastname + '\'' +
                ", loginid='" + loginid + '\'' +
                ", password='" + password + '\'' +
                ", seclevel='" + seclevel + '\'' +
                ", sex='" + sex + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", jobactivityid='" + jobactivityid + '\'' +
                ", jobgroupid='" + jobgroupid + '\'' +
                ", jobcall='" + jobcall + '\'' +
                ", joblevel='" + joblevel + '\'' +
                ", jobactivitydesc='" + jobactivitydesc + '\'' +
                ", managerid='" + managerid + '\'' +
                ", assistantid='" + assistantid + '\'' +
                ", status='" + status + '\'' +
                ", locationid='" + locationid + '\'' +
                ", workroom='" + workroom + '\'' +
                ", telephone='" + telephone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", mobilecall='" + mobilecall + '\'' +
                ", fax='" + fax + '\'' +
                ", email='" + email + '\'' +
                ", systemlanguage='" + systemlanguage + '\'' +
                ", birthday='" + birthday + '\'' +
                ", folk='" + folk + '\'' +
                ", nativeplace='" + nativeplace + '\'' +
                ", regresidentplace='" + regresidentplace + '\'' +
                ", certificatenum='" + certificatenum + '\'' +
                ", maritalstatus='" + maritalstatus + '\'' +
                ", policy='" + policy + '\'' +
                ", bememberdate='" + bememberdate + '\'' +
                ", bepartydate='" + bepartydate + '\'' +
                ", islabouunion='" + islabouunion + '\'' +
                ", educationlevel='" + educationlevel + '\'' +
                ", degree='" + degree + '\'' +
                ", healthinfo='" + healthinfo + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", residentplace='" + residentplace + '\'' +
                ", homeaddress='" + homeaddress + '\'' +
                ", tempresidentnumber='" + tempresidentnumber + '\'' +
                ", accounttype='" + accounttype + '\'' +
                ", dsporder='" + dsporder + '\'' +
                ", startdate='" + startdate + '\'' +
                ", enddate='" + enddate + '\'' +
                ", createdate='" + createdate + '\'' +
                ", lastChangdate='" + lastChangdate + '\'' +
                '}';
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }
    public String getSubcompanyname() {
        return subcompanyname;
    }

    public void setSubcompanyname(String subcompanyname) {
        this.subcompanyname = subcompanyname;
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

    public String getJobactivityid() {
        return jobactivityid;
    }

    public void setJobactivityid(String jobactivityid) {
        this.jobactivityid = jobactivityid;
    }

    public String getJobgroupid() {
        return jobgroupid;
    }

    public void setJobgroupid(String jobgroupid) {
        this.jobgroupid = jobgroupid;
    }

    public String getJobcall() {
        return jobcall;
    }

    public void setJobcall(String jobcall) {
        this.jobcall = jobcall;
    }

    public String getJoblevel() {
        return joblevel;
    }

    public void setJoblevel(String joblevel) {
        this.joblevel = joblevel;
    }

    public String getJobactivitydesc() {
        return jobactivitydesc;
    }

    public void setJobactivitydesc(String jobactivitydesc) {
        this.jobactivitydesc = jobactivitydesc;
    }

    public String getManagerid() {
        return managerid;
    }

    public void setManagerid(String managerid) {
        this.managerid = managerid;
    }

    public String getAssistantid() {
        return assistantid;
    }

    public void setAssistantid(String assistantid) {
        this.assistantid = assistantid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocationid() {
        return locationid;
    }

    public void setLocationid(String locationid) {
        this.locationid = locationid;
    }

    public String getWorkroom() {
        return workroom;
    }

    public void setWorkroom(String workroom) {
        this.workroom = workroom;
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

    public String getMobilecall() {
        return mobilecall;
    }

    public void setMobilecall(String mobilecall) {
        this.mobilecall = mobilecall;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
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

    public String getFolk() {
        return folk;
    }

    public void setFolk(String folk) {
        this.folk = folk;
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace;
    }

    public String getRegresidentplace() {
        return regresidentplace;
    }

    public void setRegresidentplace(String regresidentplace) {
        this.regresidentplace = regresidentplace;
    }

    public String getCertificatenum() {
        return certificatenum;
    }

    public void setCertificatenum(String certificatenum) {
        this.certificatenum = certificatenum;
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getBememberdate() {
        return bememberdate;
    }

    public void setBememberdate(String bememberdate) {
        this.bememberdate = bememberdate;
    }

    public String getBepartydate() {
        return bepartydate;
    }

    public void setBepartydate(String bepartydate) {
        this.bepartydate = bepartydate;
    }

    public String getIslabouunion() {
        return islabouunion;
    }

    public void setIslabouunion(String islabouunion) {
        this.islabouunion = islabouunion;
    }

    public String getEducationlevel() {
        return educationlevel;
    }

    public void setEducationlevel(String educationlevel) {
        this.educationlevel = educationlevel;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getHealthinfo() {
        return healthinfo;
    }

    public void setHealthinfo(String healthinfo) {
        this.healthinfo = healthinfo;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getResidentplace() {
        return residentplace;
    }

    public void setResidentplace(String residentplace) {
        this.residentplace = residentplace;
    }

    public String getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress;
    }

    public String getTempresidentnumber() {
        return tempresidentnumber;
    }

    public void setTempresidentnumber(String tempresidentnumber) {
        this.tempresidentnumber = tempresidentnumber;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }

    public String getDsporder() {
        return dsporder;
    }

    public void setDsporder(String dsporder) {
        this.dsporder = dsporder;
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
}

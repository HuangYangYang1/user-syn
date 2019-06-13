package com.oce.base.bean;


import java.sql.Timestamp;
import java.util.Date;

public class TUser {

  private long id;
  private long state;
  private String last_name;
  private String login_id;
  private long sex;
  private String telephone;
  private String mobile;
  private String email;
  private String system_language;
  private Date birthday;
  private String folk;
  private String native_place;
  private String regresident_place;
  private String id_card;
  private String marital_status;
  private String location_place;
  private Date start_date;
  private Date end_date;
  private Timestamp create_time;
  private Timestamp update_time;

  public String getLast_name() {
    return last_name;
  }

  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }


  public String getLogin_id() {
    return login_id;
  }

  public void setLogin_id(String login_id) {
    this.login_id = login_id;
  }

  public long getSex() {
    return sex;
  }

  public void setSex(long sex) {
    this.sex = sex;
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSystem_language() {
    return system_language;
  }

  public void setSystem_language(String system_language) {
    this.system_language = system_language;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public String getFolk() {
    return folk;
  }

  public void setFolk(String folk) {
    this.folk = folk;
  }

  public String getNative_place() {
    return native_place;
  }

  public void setNative_place(String native_place) {
    this.native_place = native_place;
  }

  public String getRegresident_place() {
    return regresident_place;
  }

  public void setRegresident_place(String regresident_place) {
    this.regresident_place = regresident_place;
  }

  public String getId_card() {
    return id_card;
  }

  public void setId_card(String id_card) {
    this.id_card = id_card;
  }

  public String getMarital_status() {
    return marital_status;
  }

  public void setMarital_status(String marital_status) {
    this.marital_status = marital_status;
  }

  public String getLocation_place() {
    return location_place;
  }

  public void setLocation_place(String location_place) {
    this.location_place = location_place;
  }

  public Date getStart_date() {
    return start_date;
  }

  public void setStart_date(Date start_date) {
    this.start_date = start_date;
  }

  public Date getEnd_date() {
    return end_date;
  }

  public void setEnd_date(Date end_date) {
    this.end_date = end_date;
  }

  public Timestamp getCreate_time() {
    return create_time;
  }

  public void setCreate_time(Timestamp create_time) {
    this.create_time = create_time;
  }

  public Timestamp getUpdate_time() {
    return update_time;
  }

  public void setUpdate_time(Timestamp update_time) {
    this.update_time = update_time;
  }
}

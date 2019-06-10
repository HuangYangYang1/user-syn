package com.oce.base.bean;


import java.sql.Timestamp;

public class TDepartment {

  private long id;
  private String short_name;
  private String full_name;
  private String show_order;
  private String canceled;
  private Timestamp create_time;
  private Timestamp update_time;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getShort_name() {
    return short_name;
  }

  public void setShort_name(String short_name) {
    this.short_name = short_name;
  }

  public String getFull_name() {
    return full_name;
  }

  public void setFull_name(String full_name) {
    this.full_name = full_name;
  }

  public String getShow_order() {
    return show_order;
  }

  public void setShow_order(String show_order) {
    this.show_order = show_order;
  }

  public String getCanceled() {
    return canceled;
  }

  public void setCanceled(String canceled) {
    this.canceled = canceled;
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

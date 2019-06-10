package com.oce.base.bean;


import java.sql.Timestamp;

public class TUserManager {

  private long id;
  private long user_id;
  private long manager_id;
  private Timestamp create_time;
  private Timestamp update_time;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getUser_id() {
    return user_id;
  }

  public void setUser_id(long user_id) {
    this.user_id = user_id;
  }

  public long getManager_id() {
    return manager_id;
  }

  public void setManager_id(long manager_id) {
    this.manager_id = manager_id;
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

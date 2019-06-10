package com.oce.base.bean;


import java.sql.Timestamp;

public class TUserJob {

  private long id;
  private long user_id;
  private long job_id;
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

  public long getJob_id() {
    return job_id;
  }

  public void setJob_id(long job_id) {
    this.job_id = job_id;
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

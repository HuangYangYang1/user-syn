package com.oce.base.bean;


import java.sql.Date;
import java.sql.Timestamp;

/**
 * @Auther: Jiacheng.xu
 * @Date: 2019/6/12 11:33
 * @Description: 用户与职务关系实体
 */

public class TUserJob {

  /**
   *  列表id
   */
  private long id;
  /**
   *  用户id
   */
  private long user_id;
  /**
   *  职务id
   */
  private long job_id;
  /**
   *  表创建时间
   */
  private Date create_time;
  /**
   *  表更新时间
   */
  private Date update_time;

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

  public Date getCreate_time() {
    return create_time;
  }

  public void setCreate_time(Date create_time) {
    this.create_time = create_time;
  }

  public Date getUpdate_time() {
    return update_time;
  }

  public void setUpdate_time(Date update_time) {
    this.update_time = update_time;
  }
}

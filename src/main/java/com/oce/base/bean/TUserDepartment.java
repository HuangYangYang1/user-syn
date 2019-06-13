package com.oce.base.bean;


import java.sql.Date;
import java.sql.Timestamp;

/**
 * @Auther: Jiacheng.xu
 * @Date: 2019/6/12 11:33
 * @Description: 用户与部门关系实体
 */

public class TUserDepartment {

  /**
   *  列表id
   */
  private long id;
  /**
   *  用户id
   */
  private long user_id;
  /**
   *  部门id
   */
  private long department_id;
  /**
   *  表创建时间
   */
  private Date create_time;
  /**
   * 表更新时间
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

  public long getDepartment_id() {
    return department_id;
  }

  public void setDepartment_id(long department_id) {
    this.department_id = department_id;
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

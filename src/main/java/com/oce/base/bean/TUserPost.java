package com.oce.base.bean;


import java.sql.Timestamp;
import java.util.Date;

/**
 * @Auther: Jiacheng.xu
 * @Date: 2019/6/12 11:33
 * @Description: 用户与岗位关系实体
 */

public class TUserPost {

  /**
   *  列表id
   */
  private long id;
  /**
   *  用户id
   */
  private long user_id;
  /**
   *  岗位id
   */
  private long post_id;
  /**
   *  表创建时间
   */
  private Date create_time;
  /**
   *  更新时间
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

  public long getPost_id() {
    return post_id;
  }

  public void setPost_id(long post_id) {
    this.post_id = post_id;
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

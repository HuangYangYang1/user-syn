package com.oce.base.bean;


import java.sql.Date;
import java.sql.Timestamp;
/**
 * @Auther: Jiacheng.xu
 * @Date: 2019/6/12 11:33
 * @Description: 部门与部门关系表实体
 */

public class TDepartmentDepartment {
  /**
   *  列表id
   */
  private long id;
  /**
   *  子部门id
   */
  private long chile_department_id;
  /**
   *  上级部门id
   */
  private long father_department_id;
  /**
   *  是否是子部门 1代表是0代表否
   */
  private long is_sub;
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

  public long getChile_dpartment_id() {
    return chile_department_id;
  }

  public void setChile_dpartment_id(long chile_dpartment_id) {
    this.chile_department_id = chile_dpartment_id;
  }

  public long getFather_departmet_id() {
    return father_department_id;
  }

  public void setFather_departmet_id(long father_departmet_id) {
    this.father_department_id = father_departmet_id;
  }

  public long getIs_sub() {
    return is_sub;
  }

  public void setIs_sub(long is_sub) {
    this.is_sub = is_sub;
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

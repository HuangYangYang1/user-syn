package com.oce.base.mapper;

import com.oce.base.bean.TUser;
import com.oce.base.bean.TUserDepartment;
import org.apache.ibatis.annotations.*;

import java.util.List;


//指定这是一个操作数据库的mapper
@Mapper
public interface UserDepartmentMapper {

    //查找所有用户信息
    @Select("select * from t_user_department")
    List<TUserDepartment> findAll();
    
    //根据用户id查看信息
    @Select("select * from t_user_department where user_id=#{id}")
    public TUserDepartment selectByid(@Param("id") int id);

    //查询一个部门的员工数量
    @Select("select count(*) as '总数' from t_user_department where department_id=#{id}")
    int selectUserNumByDepartmentid(@Param("id") int id);

    //根据部门Id查询用户id列表
    @Select("select user_id from t_user_department where department_id=#{id}")
    List<Integer> selectListUserid(@Param("id") int id);

    //根据部门Id查询用户列表
    @Select("select * from t_user u,t_user_department ud where u.id=ud.user_id and ud.department_id=#{id}")
    List<TUser> selectListUser(@Param("id") int id);

    //根据用户id查询部门id
    @Select("select department_id from t_user_department where user_id=#{id}")
    Integer selectDepartmentId(@Param("id") int id);

    //根据用户id删除用户
    @Delete("delete from t_user_department where user_id=#{id}")
    int deleteByUserid(Integer id);

    //添加数据
    @Insert("insert into t_user_department values(#{id},#{user_id},#{department_id}" +
            ",CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)")
    int insert(TUserDepartment userDepartment);


    @Update("update t_user_department set sname=#{sname} where sno=#{sno}")
    int update(String sname, String sno);

}
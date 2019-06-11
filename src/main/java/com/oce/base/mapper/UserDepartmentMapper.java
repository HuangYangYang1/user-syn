package com.oce.base.mapper;

import com.oce.base.bean.TDepartment;
import com.oce.base.bean.TUser;
import com.oce.base.bean.TUserDepartment;
import org.apache.ibatis.annotations.*;

import java.util.List;


//指定这是一个操作数据库的mapper
@Mapper
public interface UserDepartmentMapper {

    //查找所有用户信息
    @Select({"select * from t_user_department"})
    List<TUserDepartment> findAll();
    
    //根据用户id查看信息
    @Select("select * from t_user_department where user_id=#{id}")
    TUserDepartment selectByid(@Param("id") int id);

    //查询一个部门的员工数量
    @Select("select count(*) as '总数' from t_user_department where department_id=#{id}")
    int selectUserNumByDepartmentid(@Param("id") int id);

    //根据部门Id查询用户id列表
    @Select("select user_id from t_user_department where department_id=#{id}")
    List<Integer> selectListUserid(@Param("id") int id);

    //根据部门Id查询用户列表
    @Select("select * from t_user u,t_user_department ud where u.id=ud.user_id and ud.department_id=#{id}")
    List<TUser> selectListUser(@Param("id") int id);

    //根据用户id查询部门信息
    @Select("select t_department from t_department d,t_user_department ud where d.id=ud.department_id and ud.user_id=#{id}")
    TDepartment selectDepartment(@Param("id") int id);

    //根据用户id删除信息
    @Delete("delete from t_user_department where user_id=#{id}")
    boolean deleteByUserid(@Param("id")Integer id);

    //根据部门id删除信息
    @Delete("delete from t_user_department where department_id=#{id}")
    boolean deleteByDepartmentid(@Param("id")Integer id);

    //删除某部门下的某个人
    @Delete("delete from t_user_department where department_id=#{d_id} and user_id=@{u_id} ")
    boolean deleteByDepartmentidUserid(@Param("d_id")Integer d_id,@Param("u_id") Integer u_id);

    //添加数据
    @Insert("insert into t_user_department values(#{id},#{user_id},#{department_id}" +
            ",CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)")
    boolean insert(TUserDepartment userDepartment);


    @Update("update t_user_department set sname=#{sname} where sno=#{sno}")
    int update(String sname, String sno);

}

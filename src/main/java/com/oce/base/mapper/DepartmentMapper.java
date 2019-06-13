package com.oce.base.mapper;


import com.oce.base.bean.TDepartment;
import org.apache.ibatis.annotations.*;

import java.util.List;


//指定这是一个操作数据库的mapper
/**
 * @Auther: Jiacheng.xu
 * @Date: 2019/6/12 11:33
 * @Description: 部门数据库映射
 */
@Mapper
public interface DepartmentMapper {

    @Select("select * from t_department where id=#{id}")
    TDepartment selectDepartmentByid(@Param("id") int id);

    @Select("select * from t_department where short_name=#{short_name}")
     TDepartment selectDepartmentByShortname(@Param("short_name") String short_name);

    @Select("select * from t_department where full_name=#{full_name}")
     TDepartment selectDepartmentByFull_name(@Param("full_name") String full_name);

    @Select("select count(*) as '总数' from t_department")
    int selectTotalDepartment();

    @Select("select * from t_department")
    List<TDepartment> findAll();

    @Delete("delete from t_department where id=#{id}")
     boolean deleteByid(@Param("id") int id);

    @Delete("delete from t_department where short_name=#{short_name}")
     boolean deleteBySN(@Param("short_name") String short_name);

    @Delete("delete from t_department where full_name=#{full_name}")
     boolean deleteByFN(@Param("full_name") String full_name);

    @Insert("insert into t_department values(#{id},#{short_name},#{full_name}" +
            ",#{show_order},#{canceled},CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)")
     boolean insertDepartment(TDepartment department);


    @Update("update t_department set sname=#{sname} where sno=#{sno}")
    int update(String sname, String sno);

    @Update("update t_department set full_name = #{full_name},short_name = #{short_name}," +
            "show_order = #{show_order},canceled = #{canceled} where id = #{id}")
    int updateAllInfoById(TDepartment tDepartment);
}

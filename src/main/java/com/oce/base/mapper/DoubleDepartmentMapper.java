package com.oce.base.mapper;

import com.oce.base.bean.TDepartmentDepartment;
import org.apache.ibatis.annotations.*;

import java.util.List;


//指定这是一个操作数据库的mapper
@Mapper
public interface DoubleDepartmentMapper {

    @Select("select * from t_department_department where id=#{id}")
    public TDepartmentDepartment selectByid(@Param("id") int id);

    @Select("select chile_department_id from t_department_department where is_sub=1 and father_department_id={id}")
    public int selectChileByid(@Param("id") int id);

    @Select("select count(*) as '总数'from t_department_department where father_department_id ={id}")
    int selectTotalnumByid(@Param("id") int id);

    @Select("select chile_department_id from t_user_department where father_department_id={id}")
    List<Integer> selectListDepartment_id(@Param("id") int id);

    @Delete("delete from t_department_department where id=#{id}")
    public int deleteByid(int id);



    @Insert("insert into t_department_department values(#{id},#{chile_department_id},#{father_department_id}" +
            ",#{is_sub},CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)")
    public int insert(TDepartmentDepartment department);




    @Update("update t_department_department set sname=#{sname} where sno=#{sno}")
    int update(String sname, String sno);


    @Select("select * from t_department_department")
    List<TDepartmentDepartment> findAll();
}

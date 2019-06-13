package com.oce.base.mapper;

import com.oce.base.bean.TDepartment;
import com.oce.base.bean.TDepartmentDepartment;
import org.apache.ibatis.annotations.*;

import java.util.List;


//指定这是一个操作数据库的mapper
/**
 * @Auther: Jiacheng.xu
 * @Date: 2019/6/12 11:33
 * @Description: 部门与部门关系映射
 */
@Mapper
public interface DoubleDepartmentMapper {


    //根据部门id查询子部门id
    @Select("select chile_department_id from t_department_department where is_sub=1 and father_department_id=#{id}")
    List<Integer> selectChileidByid(@Param("id") int id);

    //根据部门id查询子部门信息
    @Select("select * from t_department d,t_department_department dd where is_sub=1 and dd.father_department_id=#{id} and d.id=dd.chile_department_id")
    List<TDepartment> selectChileByid(@Param("id") int id);

    //查询部门下的所有部门id
    @Select("select chile_department_id from t_department_department where father_department_id=#{id}")
    List<Integer> selectAllDepartmentidByid(@Param("id") int id);

    //根据部门id查询所有部门信息
    @Select("select * from t_department d,t_department_department dd where dd.father_department_id=#{id} and d.id=dd.chile_department_id")
    List<TDepartment> selectAllDepartmentByid(@Param("id") int id);

    //根据部门id查询上级部门id
    @Select("select father_department_id from t_department_department where is_sub=1 and chile_department_id=#{id}")
    Integer selectFatherByid(@Param("id") int id);

    //查询部门的子部门数量
    @Select("select count(*) as '总数'from t_department_department where is_sub=1 and father_department_id =#{id}")
    int selectTotaChilenumByid(@Param("id") int id);

    //查询部门下所有部门数量
    @Select("select count(*) as '总数'from t_department_department where father_department_id =#{id}")
    int selectTotalnumByFid(@Param("id") int id);

    //根据部门id删除部门
    @Delete("delete from t_department_department where chile_department_id=#{id} and father_department_id=#{id}")
    boolean deleteByid(int id);



    @Insert("insert into t_department_department values(#{id},#{chile_department_id},#{father_department_id}" +
            ",#{is_sub},CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)")
    boolean insert(TDepartmentDepartment department);




    @Update("update t_department_department set sname=#{sname} where sno=#{sno}")
    int update(String sname, String sno);


    @Select("select * from t_department_department")
    List<TDepartmentDepartment> findAll();
}

package com.oce.base.mapper;


import com.oce.base.bean.TUser;
import org.apache.ibatis.annotations.*;

import java.util.List;


//指定这是一个操作数据库的mapper
/**
 * @Auther: Jiacheng.xu
 * @Date: 2019/6/12 11:33
 * @Description: 用户数据库映射
 */
@Mapper
public interface UserMapper {

    //查找所有用户信息
    @Select("select * from t_user")
    List<TUser> findAll();

    //查询总人数
    @Select("select count(*) as '总数' from t_user;")
    public int selectTotalUser();

    //根据用户id查看用户信息
    @Select("select * from t_user where id=#{id}")
    public TUser selectUserByid(@Param("id") Long id);

    //根据用户名查看用户信息
    @Select("select * from t_user where last_name=#{last_name}")
    public TUser selectStudentByname(@Param("last_name") String last_name);

    //根据用户名删除用户
    @Delete("delete from t_user where last_name=#{last_name}")
    public boolean deleteByname(@Param("last_name") String last_name);

    //根据用户id删除用户
    @Delete("delete from t_user where id=#{id}")
    public boolean deleteByid(@Param("id") Long id);

    //添加用户
    @Insert("insert into t_user values(#{id},#{state},#{name},#{login_id}" +
            ",#{sex},#{telephone},#{mobile},#{email}" +
            ",#{system_language},#{birthday},#{folk},#{native_place}" +
            ",#{regresident_place},#{id_card},#{marital_status},#{location_place}" +
            ",#{start_date},#{end_date},CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)")
    public boolean insertUser(TUser user);


    @Update("update t_user set sname=#{sname} where sno=#{sno}")
    boolean update(String sname, String sno);

    /**
     * 通过id更新全部信息
     *
     * @param []
     * @return void
     */
    @Update("update t_user set state = #{state},last_name = #{last_name},login_id = #{login_id},sex = #{sex}," +
            "telephone = #{telephone},mobile = #{mobile},email = #{email},system_language = #{system_language}," +
            "birthday = #{birthday},id_card = #{id_card},location_place = #{location_place},start_date = #{start_date}," +
            "end_date = #{end_date} where id = #{id}")
    void updateAllInfoByid(TUser tUser);
    /**
     * mapper/ 通过id更新state（status）
     *
     * @param [id, login_id, state]
     * @return void
     */
    @Update("update t_user set login_id = #{login_id},state = #{state} where id = #{id}")
    void updateStatusById(@Param("id") long id, @Param("login_id") String login_id, @Param("state") long state);
}

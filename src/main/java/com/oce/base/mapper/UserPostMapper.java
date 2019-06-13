package com.oce.base.mapper;

import com.oce.base.bean.TUser;
import com.oce.base.bean.TUserPost;
import org.apache.ibatis.annotations.*;

import java.util.List;


//指定这是一个操作数据库的mapper
/**
 * @Auther: Jiacheng.xu
 * @Date: 2019/6/12 11:33
 * @Description: 用户与岗位关系数据库映射
 */
@Mapper
public interface UserPostMapper {

    //根据岗位id查看用户列表
    @Select("select * from t_user_post up,t_user u where  up.post_id=#{id} and u.id=up.user_id")
    List<TUser> selectStudentByid(@Param("id") int id);

    //查询岗位下的用户数量
    @Select("select count(*) from t_user_post where post_id=#{id}")
    int selectUserNumByPid(@Param("id") int id);

    //查询用户的岗位
    @Select("select p.full_name from t_user_post up,t_post p where up.user_id=#{id} and p.id=up.post_id")
    String selectPostByUserid(@Param("id") int id);

    //根据用户id删除用户
    @Delete("delete from t_user_post where user_id=#{id}")
    boolean deleteByUserid(Integer id);

    //根据岗位id删除用户
    @Delete("delete from t_user_post where post_id=#{id}")
    boolean deleteByPostid(Integer id);

    //添加用户
    @Insert("insert into t_user_post values(#{id},#{user_id},#{post_id}" +
            ",CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)")
    boolean insertUserPost(TUserPost userPost);


    @Update("update t_user_post set sname=#{sname} where sno=#{sno}")
    int update(String sname, String sno);

    //查找所有用户信息
    @Select("select * from t_user_post")
    List<TUserPost> findAll();
}

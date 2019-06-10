package com.oce.base.mapper;

import com.oce.base.bean.TUser;
import com.oce.base.bean.TUserPost;
import org.apache.ibatis.annotations.*;

import java.util.List;


//指定这是一个操作数据库的mapper
@Mapper
public interface UserPostMapper {

    //根据用户id查看用户信息
    @Select("select * from t_user_post where id=#{id}")
    public TUser selectStudentByid(@Param("id") int id);

    //根据用户id删除用户
    @Delete("delete from t_user_post where id=#{id}")
    public int deleteByid(Integer id);

    //添加用户
    @Insert("insert into t_user_post values(#{id},#{user_id},#{post_id}" +
            ",CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)")
    public int insertUserPost(TUserPost userPost);


    @Update("update t_user_post set sname=#{sname} where sno=#{sno}")
    int update(String sname, String sno);

    //查找所有用户信息
    @Select("select * from t_user_post")
    List<TUserPost> findAll();
}

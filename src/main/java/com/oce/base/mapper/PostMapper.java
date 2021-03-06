package com.oce.base.mapper;

import com.oce.base.bean.TPost;
import org.apache.ibatis.annotations.*;

import java.util.List;


//指定这是一个操作数据库的mapper
/**
 * @Auther: Jiacheng.xu
 * @Date: 2019/6/12 11:33
 * @Description: 岗位数据库映射
 */
@Mapper
public interface PostMapper {

    @Select("select * from t_post")
    List<TPost> findAll();

    @Select("select * from t_post where id=#{id}")
    TPost selectPostByid(@Param("id") Long id);

    @Select("select * from t_post where short_name=#{short_name}")
    TPost selectPostBySN(@Param("short_name") String short_name);

    @Select("select * from t_post where full_name=#{full_name}")
    TPost selectPostByFN(@Param("full_name") String full_name);

    @Select("select count(*) from t_post")
    int selectTotal();

    @Delete("delete from t_post where id=#{id}")
    boolean deleteByid(@Param("id") Long id);

    @Delete("delete from t_post where short_name=#{short_name}")
    boolean deleteBySN(@Param("short_name") String short_name);

    @Delete("delete from t_post where full_name=#{full_name}")
    boolean deleteByFN(@Param("full_name") String full_name);


    @Insert("insert into t_post values(#{id},#{short_name},#{full_name},#{remark}" +
            ",CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)")
    boolean insertPost(TPost post);


    @Update("update t_post set sname=#{sname} where sno=#{sno}")
    int update(String sname, String sno);

    /**
     * Mapper通过id更新TPost的所有数据
     *
     * @param [tPost]
     * @return int
     */
    @Update("update t_post set short_name = #{short_name},full_name=#{full_name},remark=#{remark}" +
            "where id = #{id}")
    int updateAllInfoById(TPost tPost);

}

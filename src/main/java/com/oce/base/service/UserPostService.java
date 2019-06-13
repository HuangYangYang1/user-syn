package com.oce.base.service;


import com.oce.base.bean.TUserPost;
import com.oce.base.mapper.UserPostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @Auther: Jiacheng.xu
 * @Date: 2019/6/12 11:33
 * @Description: 用户与岗位关系服务
 */
@Service
public class UserPostService {
    @Autowired
    UserPostMapper userPostMapper;

    /**
     * @param: [user] 用户与岗位实体
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:10
     */
    public boolean insert(TUserPost user){
        
        boolean flag=false;
        try{
            userPostMapper.insertUserPost(user);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
    /**
     * @param: [id] 岗位id
     * @return: int 同一个岗位的用户数量
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:13
     */
    public int selectUserNumByPid(Integer id){

          return   userPostMapper.selectUserNumByPid(id);
    }
    /**
     * @param: [id] 用户id
     * @return: int 岗位id
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:13
     */
    public String selectPostByUserid(Integer id){
        return  userPostMapper.selectPostByUserid(id);
    }
    /**
     * @param:
     * @return: List<TUserPost> 用户与岗位关系列表
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:15
     */
    public List<TUserPost> findAll(){

        return  userPostMapper.findAll();

    }
    /**
     * @param: [id] 岗位id
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:16
     */
    public boolean deleteByPostid(Integer id){

       return userPostMapper.deleteByPostid(id);

    }
    /**
     * @param: [id] 用户id
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:16
     */
    public boolean deleteByUserid(Integer id){

        return userPostMapper.deleteByUserid(id);

    }
}

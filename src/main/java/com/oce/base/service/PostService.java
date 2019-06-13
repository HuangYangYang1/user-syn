package com.oce.base.service;


import com.oce.base.bean.TPost;
import com.oce.base.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @Auther: Jiacheng.xu
 * @Date: 2019/6/12 11:33
 * @Description: 岗位服务
 */
@Service
public class PostService {
    @Autowired
    PostMapper postMapper;


    /**
     * @param: [post] 岗位实体
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:53
     */
    public  boolean insertPost(TPost post){

        boolean flag=false;
        try{
            postMapper.insertPost(post);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
    /**
     * @param: [id] 岗位id
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:54
     */
    public boolean deletePostByid(Integer id){

        boolean flag=false;
        try{
            postMapper.deleteByid(id);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
    /**
     * @param: [short_name] 岗位简称
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:54
     */
    public boolean deletePostBySN(String short_name){

        boolean flag=false;
        try{
            postMapper.deleteBySN(short_name);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
    /**
     * @param: [full_name] 岗位全称
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:55
     */
    public boolean deletePostByFN(String full_name){

        boolean flag=false;
        try{
            postMapper.deleteByFN(full_name);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
    /**
     * @param:
     * @return: List<TPost> 岗位列表
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:55
     */
    public List<TPost> findAll(){

        return  postMapper.findAll();
    }
    /**
     * @param: [id] 岗位id
     * @return: TPost  岗位实体信息
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:56
     */
    public TPost selectByid(Integer id){

        return postMapper.selectPostByid(id);
    }
    /**
     * @param: [short_ame] 岗位简称
     * @return: TPost  岗位实体信息
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:56
     */
    public TPost selectBySN(String short_ame){

        return postMapper.selectPostBySN(short_ame);
    }
    /**
     * @param: [full_ame] 岗位全称
     * @return: TPost  岗位实体信息
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:56
     */
    public TPost selectByFN(String full_ame){
        return postMapper.selectPostByFN(full_ame);
    }
    /**
     * @param:
     * @return: int  岗位数量
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:57
     */
    public int selectCount(){

       return postMapper.selectTotal();
    }
}

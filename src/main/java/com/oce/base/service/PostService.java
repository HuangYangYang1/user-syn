package com.oce.base.service;


import com.oce.base.bean.TPost;
import com.oce.base.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    PostMapper postMapper;



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

    public List<TPost> findAll(){
        return  postMapper.findAll();
    }
    public TPost selectByid(Integer id){
        return postMapper.selectPostByid(id);
    }
    public TPost selectBySN(String short_ame){
        return postMapper.selectPostBySN(short_ame);
    }
    public TPost selectByFN(String full_ame){
        return postMapper.selectPostByFN(full_ame);
    }
    public int selectCount(){
       return postMapper.selectTotal();
    }

    /**
     * 通过id更新TPost的所有数据
     *
     * @param []
     * @return void
     */
    public int  updateAllInfoById(TPost tPost){
        return postMapper.updateAllInfoById(tPost);
    }



}

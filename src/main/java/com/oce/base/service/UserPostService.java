package com.oce.base.service;


import com.oce.base.bean.TUserPost;
import com.oce.base.mapper.UserPostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPostService {
    @Autowired
    UserPostMapper userPostMapper;


    public String insert(TUserPost user){
        userPostMapper.insertUserPost(user);
        return "user add ok";
    }

    public List<TUserPost> findAll(){
        return  userPostMapper.findAll();

    }

    public String deleteUser(Integer id){
        userPostMapper.deleteByid(id);
        return "delete ok";
    }
}

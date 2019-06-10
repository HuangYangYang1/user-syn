package com.oce.base.service;


import com.oce.base.bean.TUserManager;
import com.oce.base.mapper.UserManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManagerService {
    @Autowired
    UserManagerMapper userManagerMapper;


    public String insert(TUserManager user){
        userManagerMapper.insert(user);
        return "user add ok";
    }

    public List<TUserManager> findAll(){
        return  userManagerMapper.findAll();

    }

    public String deleteUser(Integer id){
        userManagerMapper.deleteByid(id);
        return "delete ok";
    }
}

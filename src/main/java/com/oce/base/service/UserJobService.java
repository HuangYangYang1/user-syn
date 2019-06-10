package com.oce.base.service;


import com.oce.base.bean.TUserJob;
import com.oce.base.mapper.UserJobMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserJobService {
    @Autowired
    UserJobMapper userJobMapper;


    public String insert(TUserJob userJob){
        userJobMapper.insert(userJob);
        return "add ok";
    }

    public List<TUserJob> findAll(){
        return  userJobMapper.findAll();

    }

    public String deleteUser(Integer id){
        userJobMapper.deleteByid(id);
        return "delete ok";
    }
}

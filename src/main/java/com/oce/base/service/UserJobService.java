package com.oce.base.service;


import com.oce.base.bean.TUserJob;
import com.oce.base.mapper.UserJobMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Jiacheng.xu
 * @Date: 2019/6/12 11:33
 * @Description: 用户与职务关系服务
 */
@Service
public class UserJobService {
    @Autowired
    UserJobMapper userJobMapper;

    /**
     * @param: [userJob] 用户与职务实体
     * @return: java.lang.String
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:06
     */
    public boolean insert(TUserJob userJob){

        return userJobMapper.insert(userJob);

    }
    /**
     * @param:
     * @return: List<TUserJob> 用户与职务关系列表
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:08
     */
    public List<TUserJob> findAll(){

        return  userJobMapper.findAll();

    }

    public String deleteUser(Long id){
        userJobMapper.deleteByid(id);
        return "delete ok";
    }
}

package com.oce.base.service;


import com.oce.base.bean.TUser;
import com.oce.base.bean.TUserDepartment;
import com.oce.base.mapper.UserDepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDepartmentService {
    @Autowired
    UserDepartmentMapper userDepartmentMapper;

    //根据部门id查询用户id列表
    public Integer selectUseridFromDepartment(int i,int id){
        List<Integer> integers = userDepartmentMapper.selectListUserid(id);
        return integers.get(i);
    }
    //根据用户id获取部门id
    public Integer getDepartmentid(int id){
        Integer integer = userDepartmentMapper.selectDepartmentId(id);
        return integer;
    }
    public String insert(TUserDepartment department){
        userDepartmentMapper.insert(department);
        return "user add ok";
    }
    public List<TUser> selectListUser(int id){
       return userDepartmentMapper.selectListUser(id);
    }
    public List<TUserDepartment> findAll(){
        return  userDepartmentMapper.findAll();

    }

    public String deleteUser(Integer id){
//        userDepartmentMapper.deleteByid(id);
        return "delete ok";
    }
}

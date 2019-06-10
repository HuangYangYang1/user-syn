package com.oce.base.service;


import com.oce.base.bean.TUser;
import com.oce.base.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper usermapper;
    @Autowired
    UserDepartmentService userDepartmentService;



    public boolean insertUser(TUser user){
        boolean flag=false;
        try{
            usermapper.insertUser(user);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
    //查询部门下某个员工信息
    public TUser selectUserByidFromDepart(int i,int id){
        Integer integer = userDepartmentService.selectUseridFromDepartment(i,id);
        return usermapper.selectStudentByid(integer);
    }


    public List<TUser> findAll(){
        return  usermapper.findAll();

    }
    public  TUser selectUserByid(int id){
        return usermapper.selectStudentByid(id);
    }
    public  TUser selectByname(String lastName){
        return usermapper.selectStudentByname(lastName);
    }
    public int selectTotalCount(){
        return usermapper.selectTotalStudent();
    }
    public boolean deleteUserByid(Integer id){
        boolean flag=false;
        try{
            usermapper.deleteByid(id);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public boolean deleteUserByname(String name){
        boolean flag=false;
        try{
            usermapper.deleteByname(name);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
    public boolean addUser(TUser tUser){
        boolean flag=false;
        try{
            usermapper.insertUser(tUser);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
}

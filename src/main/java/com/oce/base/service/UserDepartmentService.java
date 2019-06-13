package com.oce.base.service;


import com.oce.base.bean.TDepartment;
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


    //根据用户id获取部门信息
    public TDepartment selectDepartment(int id){
        return userDepartmentMapper.selectDepartment(id);
    }
    public List<Integer> selectListUserid(Integer departmentid){
        return userDepartmentMapper.selectListUserid(departmentid);
    }
    public int selectTotalUser(Integer departmentid){
        return userDepartmentMapper.selectUserNumByDepartmentid(departmentid);
    }
    public List<TUser> selectListUser(int id){
        return userDepartmentMapper.selectListUser(id);
    }
    public List<TUserDepartment> findAll(){
        return  userDepartmentMapper.findAll();

    }
    public boolean insert(TUserDepartment department){
        boolean flag=false;
        try{
            userDepartmentMapper.insert(department);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public boolean deleteByUserid(Integer id){
        boolean flag=false;
        try{
            userDepartmentMapper.deleteByUserid(id);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;

    }
    public boolean deleteByDepartmentid(Integer id){
        boolean flag=false;
        try{
            userDepartmentMapper.deleteByDepartmentid(id);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;

    }
    public boolean deleteByDepartmentidUserid(Integer d_id,Integer u_id){
        boolean flag=false;
        try{
            userDepartmentMapper.deleteByDepartmentidUserid(d_id,u_id);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

}

package com.oce.base.service;

import com.oce.base.bean.TDepartmentDepartment;
import com.oce.base.mapper.DoubleDepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoubleDepartmentService {
    @Autowired
    DoubleDepartmentMapper departmentMapper;
    @Autowired
    UserDepartmentService userDepartmentService;


    public Integer selectDepartmentidFromDepartment(int i,int id){
        List<Integer> integers = departmentMapper.selectListDepartment_id(id);
        return integers.get(i);
    }
    //查询员工所在部门的子部门id
    public int selectDepartmentidByid(int id){

        return departmentMapper.selectChileByid( userDepartmentService.getDepartmentid(id));
    }

    public String insert(TDepartmentDepartment departmentDepartment){
        departmentMapper.insert(departmentDepartment);
        return "add ok";
    }

    public List<TDepartmentDepartment> findAll(){
        return  departmentMapper.findAll();

    }

    public String delete(Integer id){
        departmentMapper.deleteByid(id);
        return "delete ok";
    }
}

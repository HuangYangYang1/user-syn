package com.oce.base.controller;


import com.oce.base.bean.TDepartment;
import com.oce.base.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @RequestMapping(value = "/department/add",method = RequestMethod.POST)
    public  boolean addDepartment(TDepartment department){
        return departmentService.isnertDepartment(department);
    }

    @RequestMapping(value = "/dpartment/deleteByid/{id}",method = RequestMethod.DELETE)
    public boolean deleteByid(@PathVariable("id") Integer id){
        return departmentService.deleteDepartmentByid(id);
    }
    @RequestMapping(value = "/dpartment/deleteByFN/{full_name}",method = RequestMethod.DELETE)
    public boolean deleteByFN(@PathVariable("full_name") String full_name){
        return departmentService.deleteDepartmentByFN(full_name);
    }
    @RequestMapping(value = "/dpartment/deleteBySN/{short_name}",method = RequestMethod.DELETE)
    public boolean deleteBySN(@PathVariable("short_name") String short_name){
        return departmentService.deleteDepartmentBySN(short_name);
    }

    @RequestMapping(value = "/department/selectAll",method = RequestMethod.GET)
    public List<TDepartment> selectAllDepartment(){
        return departmentService.findAll();
    }
    @RequestMapping(value = "/department/selectByid/{id}",method = RequestMethod.GET)
    public TDepartment selectAllDepartment(@PathVariable("id")Integer id){
        return departmentService.selectByid(id);
    }
    @RequestMapping(value = "/department/selectBySN/{short_name}",method = RequestMethod.GET)
    public TDepartment selectDepartmentBySN(@PathVariable("short_name")String short_name){
        return departmentService.selectBySN(short_name);
    }
    @RequestMapping(value = "/department/selectByFN/{full_name}",method = RequestMethod.GET)
    public TDepartment selectDepartmentByFN(@PathVariable("full_name")String full_name){
        return departmentService.selectFN(full_name);
    }
    @RequestMapping(value = "/department/selectTotalCount",method = RequestMethod.GET)
    public int selectCount(){
        return departmentService.selectCount();
    }
}

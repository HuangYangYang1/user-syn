package com.oce.base.controller;

import com.oce.base.bean.TDepartment;
import com.oce.base.bean.TDepartmentDepartment;
import com.oce.base.service.DoubleDepartmentService;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoubleDepartmentController {

    @Autowired
    DoubleDepartmentService doubleDepartmentService;


    //根据部门id查询子部门信息
    @RequestMapping(value = "/doubledepartment/selectChileDepartment/{id}",method= RequestMethod.GET)
    public List<TDepartment> selectChileDepartmentByFid(@Param("id") Integer id){
        return doubleDepartmentService.selectChileDepartment(id);
    }
    //根据部门id查询所有部门信息
    @RequestMapping(value = "/doubledepartment/selectAllDepartmentByFid/{id}",method= RequestMethod.GET)
    public List<TDepartment> selectAllDepartmentByFid(@Param("id") Integer id){
        return doubleDepartmentService.selectAllDepartmentByid(id);
    }
    //根据部门id查询子部门id
    @RequestMapping(value = "/doubledepartment/selectChileDepartmentidByFid/{id}",method= RequestMethod.GET)
    public List<Integer> selectChileDepartmentidByFid(@Param("id") Integer id){
        return doubleDepartmentService.selectChileDepartmentidByid(id);
    }
    //查询部门下的所有部门id
    @RequestMapping(value = "/doubledepartment/selectAllDepartmentidByFid/{id}",method= RequestMethod.GET)
    public List<Integer> selectAllDepartmentidByFid(@Param("id") Integer id){
        return doubleDepartmentService.selectAllDepartmentidByid(id);
    }
    //查询部门的子部门数量
    @RequestMapping(value = "/doubledepartment/selectTotaChilenumByFid/{id}",method= RequestMethod.GET)
    public Integer selectTotaChilenumByFid(@Param("id") Integer id){
        return doubleDepartmentService.selectTotaChilenumByid(id);
    }
    //根据部门id查询上级部门id
    @RequestMapping(value = "/doubledepartment/selectFatheridByCid/{id}",method= RequestMethod.GET)
    public Integer selectFatheridByCid(@Param("id") Integer id){
        return doubleDepartmentService.selectFatheridByid(id);
    }
    //查询部门下所有部门数量
    @RequestMapping(value = "/doubledepartment/selectTotalnumByFid/{id}",method= RequestMethod.GET)
    public Integer selectTotalnumByFid(@Param("id") Integer id){
        return doubleDepartmentService.selectTotalnumByFid(id);
    }

    @RequestMapping(value = "/doubledepartment/add",method= RequestMethod.POST)
    public  boolean insertDoubleDepartment(TDepartmentDepartment departmentDepartment){
        return doubleDepartmentService.insert(departmentDepartment);
    }
    @RequestMapping(value = "/doubledepartment/delete/{id}",method= RequestMethod.DELETE)
    public  boolean deleteDoubleDepartment(@Param("id")Integer id){
        return doubleDepartmentService.delete(id);
    }

}

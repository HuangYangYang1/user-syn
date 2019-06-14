package com.oce.base.controller;


import com.github.pagehelper.PageHelper;
import com.oce.base.bean.TDepartment;
import com.oce.base.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 * @Auther: Jiacheng.xu
 * @Date: 2019/6/12 11:33
 * @Description: 部门控制器
 */
@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;
    /**
     * @param: [department] 部门实体
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 16:43
     */
    @RequestMapping(value = "/department/add",method = RequestMethod.POST)
    public  boolean addDepartment(TDepartment department){
        return departmentService.isnertDepartment(department);
    }

    /**
     * @param: [id] 部门id
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:06
     */
    @RequestMapping(value = "/dpartment/deleteByid/{id}",method = RequestMethod.DELETE)
    public boolean deleteByid(@PathVariable("id") Long id){
        return departmentService.deleteDepartmentByid(id);
    }
    /**
     * @param: [full_name] 部门全称
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:07
     */
    @RequestMapping(value = "/dpartment/deleteByFN/{full_name}",method = RequestMethod.DELETE)
    public boolean deleteByFN(@PathVariable("full_name") String full_name){
        return departmentService.deleteDepartmentByFN(full_name);
    }
    /**
     * @param: [short_name] 部门简称
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:07
     */
    @RequestMapping(value = "/dpartment/deleteBySN/{short_name}",method = RequestMethod.DELETE)
    public boolean deleteBySN(@PathVariable("short_name") String short_name){
        return departmentService.deleteDepartmentBySN(short_name);
    }
    /**
     * @param:
     * @return: 部门列表信息
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:00
     */
    @RequestMapping(value = "/department/selectAll",method = RequestMethod.GET)
    public List<TDepartment> selectAllDepartment(){
        PageHelper.startPage(1,20);
        List<TDepartment> list=departmentService.findAll();
        return list;
    }
    /**
     * @param: [id] 部门id
     * @return: com.oce.base.bean.TDepartment 部门实体信息
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:01
     */
    @RequestMapping(value = "/department/selectByid/{id}",method = RequestMethod.GET)
    public TDepartment selectAllDepartment(@PathVariable("id")Long id){
        return departmentService.selectByid(id);
    }
    /**
     * @param: [short_name] 部门简称
     * @return: com.oce.base.bean.TDepartment 部门实体信息
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:06
     */
    @RequestMapping(value = "/department/selectBySN/{short_name}",method = RequestMethod.GET)
    public TDepartment selectDepartmentBySN(@PathVariable("short_name")String short_name){
        return departmentService.selectBySN(short_name);
    }
    /**
     * @param: [full_name] 部门全称
     * @return: com.oce.base.bean.TDepartment 部门实体信息
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:06
     */
    @RequestMapping(value = "/department/selectByFN/{full_name}",method = RequestMethod.GET)
    public TDepartment selectDepartmentByFN(@PathVariable("full_name")String full_name){
        return departmentService.selectFN(full_name);
    }
    /**
     * @param:
     * @return: 部门数量
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:00
     */
    @RequestMapping(value = "/department/selectTotalCount",method = RequestMethod.GET)
    public int selectCount(){
        return departmentService.selectCount();
    }
}

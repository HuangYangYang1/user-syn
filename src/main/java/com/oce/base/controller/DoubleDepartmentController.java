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
/**
 * @Auther: Jiacheng.xu
 * @Date: 2019/6/12 11:33
 * @Description: 部门关系表控制器
 */
@RestController
public class DoubleDepartmentController {

    @Autowired
    DoubleDepartmentService doubleDepartmentService;


    /**
     * @param: [f_id] 上级部门id
     * @return: List<TDepartment> 子部门信息
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:30
     */
    @RequestMapping(value = "/doubledepartment/selectChileDepartment/{id}",method= RequestMethod.GET)
    public List<TDepartment> selectChileDepartmentByFid(@Param("id") Long id){
        return doubleDepartmentService.selectChileDepartment(id);
    }
    /**
     * @param: [f_id] 上级部门id
     * @return: List<TDepartment>  子部门信息列表
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:37
     */
    @RequestMapping(value = "/doubledepartment/selectAllDepartmentByFid/{id}",method= RequestMethod.GET)
    public List<TDepartment> selectAllDepartmentByFid(@Param("id") Long id){
        return doubleDepartmentService.selectAllDepartmentByid(id);
    }
    /**
     * @param: [f_id] 上级部门id
     * @return: List<Integer> 子部门id列表
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:39
     */
    @RequestMapping(value = "/doubledepartment/selectChileDepartmentidByFid/{id}",method= RequestMethod.GET)
    public List<Integer> selectChileDepartmentidByFid(@Param("id") Long id){
        return doubleDepartmentService.selectChileDepartmentidByid(id);
    }
    /**
     * @param: [f_id] 上级部门id
     * @return: List<Integer> 所有子部门id列表
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:40
     */
    //查询部门下的所有部门id
    @RequestMapping(value = "/doubledepartment/selectAllDepartmentidByFid/{id}",method= RequestMethod.GET)
    public List<Integer> selectAllDepartmentidByFid(@Param("id") Long id){
        return doubleDepartmentService.selectAllDepartmentidByid(id);
    }
    /**
     * @param: [f_id] 上级部门id
     * @return: int  子部门数量
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:48
     */
    //查询部门的子部门数量
    @RequestMapping(value = "/doubledepartment/selectTotaChilenumByFid/{id}",method= RequestMethod.GET)
    public Integer selectTotaChilenumByFid(@Param("id") Long id){
        return doubleDepartmentService.selectTotaChilenumByid(id);
    }
    /**
     * @param: [c_id] 子部门id
     * @return: Integer 上级部门id
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:46
     */
    //根据部门id查询上级部门id
    @RequestMapping(value = "/doubledepartment/selectFatheridByCid/{id}",method= RequestMethod.GET)
    public Integer selectFatheridByCid(@Param("id") Long id){
        return doubleDepartmentService.selectFatheridByid(id);
    }
    /**
     * @param: [f_id] 上级部门id
     * @return: int 所有子部门数量
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:48
     */
    //查询部门下所有部门数量
    @RequestMapping(value = "/doubledepartment/selectTotalnumByFid/{id}",method= RequestMethod.GET)
    public Integer selectTotalnumByFid(@Param("id") Long id){
        return doubleDepartmentService.selectTotalnumByFid(id);
    }
    /**
     * @param: [departmentDepartment] 部门与部门关系实体
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:08
     */
    @RequestMapping(value = "/doubledepartment/add",method= RequestMethod.POST)
    public  boolean insertDoubleDepartment(TDepartmentDepartment departmentDepartment){
        return doubleDepartmentService.insert(departmentDepartment);
    }
    /**
     * @param: [id] 部门id
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:50
     */
    @RequestMapping(value = "/doubledepartment/delete/{id}",method= RequestMethod.DELETE)
    public  boolean deleteDoubleDepartment(@Param("id")Long id){
        return doubleDepartmentService.delete(id);
    }

}

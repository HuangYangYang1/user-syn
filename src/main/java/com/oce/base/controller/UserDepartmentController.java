package com.oce.base.controller;

import com.oce.base.bean.TDepartment;
import com.oce.base.bean.TUser;
import com.oce.base.bean.TUserDepartment;
import com.oce.base.service.UserDepartmentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: Jiacheng.xu
 * @Date: 2019/6/12 11:33
 * @Description: 用户与部门关系控制器
 */
@RestController
public class UserDepartmentController {

    @Autowired
    UserDepartmentService userDepartmentService;

    @RequestMapping(value = "/userdepartment/add",method = RequestMethod.POST)
    public boolean insertDepartment(TUserDepartment userDepartment){
        return userDepartmentService.insert(userDepartment);
    }

    @RequestMapping(value = "/userdepartment/findAll",method = RequestMethod.GET)
    public List<TUserDepartment> selectAll(){
        return userDepartmentService.findAll();
    }

    @RequestMapping(value = "/userdepartment/selectDepartmentByUserid/{id}",method = RequestMethod.GET)
    public TDepartment selectDepartmentByUserid(@Param("id") Integer id){
        return userDepartmentService.selectDepartment(id);
    }
    @RequestMapping(value = "/userdepartment/selectUserTotalNum/{id}",method = RequestMethod.GET)
    public int selectUserTotalnumByDepartmentid(@Param("id") Integer id){
        return userDepartmentService.selectTotalUser(id);
    }
    @RequestMapping(value = "/userdepartment/selectListUsers/{id}",method = RequestMethod.GET)
    public List<TUser> selectListUsersByDepartmentid(@Param("id") Integer id){
        return userDepartmentService.selectListUser(id);
    }
    @RequestMapping(value = "/userdepartment/selectListUserid/{id}",method = RequestMethod.GET)
    public List<Integer> selectListUseridByDepartmentid(@Param("id") Integer id){
        return userDepartmentService.selectListUserid(id);
    }

    @RequestMapping(value = "/userdepartment/deleteByUserid/{id}",method = RequestMethod.GET)
    public boolean deleteByUserid(@Param("id") Integer id){
        return userDepartmentService.deleteByUserid(id);
    }
    @RequestMapping(value = "/userdepartment/deleteByDeoartmentid/{id}",method = RequestMethod.GET)
    public boolean deleteByDeoartmentid(@Param("id") Integer id){
        return userDepartmentService.deleteByDepartmentid(id);
    }
    @RequestMapping(value = "/userdepartment/deleteByDeoartmentidUserid/{d_id}/{u_id}",method = RequestMethod.DELETE)
    public boolean deleteByDepartmentidUserid(@Param("d_id")Integer d_id,@Param("u_id")Integer u_id){
        return userDepartmentService.deleteByDepartmentidUserid(d_id,u_id);
    }
}

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

    /**
     * @param: [department] 用户与部门关系实体
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:04
     */
    @RequestMapping(value = "/userdepartment/add",method = RequestMethod.POST)
    public boolean insertDepartment(TUserDepartment userDepartment){
        return userDepartmentService.insert(userDepartment);
    }
    /**
     * @param:
     * @return: List<TUserDepartment> 用户与部门关系列表
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:02
     */
    @RequestMapping(value = "/userdepartment/findAll",method = RequestMethod.GET)
    public List<TUserDepartment> selectAll(){
        return userDepartmentService.findAll();
    }
    /**
     * @param: [id] 用户id
     * @return: TDepartment  部门实体信息
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:57
     */
    @RequestMapping(value = "/userdepartment/selectDepartmentByUserid/{id}",method = RequestMethod.GET)
    public TDepartment selectDepartmentByUserid(@Param("id") Long id){
        return userDepartmentService.selectDepartment(id);
    }
    /**
     * @param: [departmentid] 部门id
     * @return: int 一个部门的用户数量
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:00
     */
    @RequestMapping(value = "/userdepartment/selectUserTotalNum/{id}",method = RequestMethod.GET)
    public int selectUserTotalnumByDepartmentid(@Param("id") Long id){
        return userDepartmentService.selectTotalUser(id);
    }
    /**
     * @param: [id] 部门id
     * @return: List<TUser>  用户信息列表
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:02
     */
    @RequestMapping(value = "/userdepartment/selectListUsers/{id}",method = RequestMethod.GET)
    public List<TUser> selectListUsersByDepartmentid(@Param("id") Long id){
        return userDepartmentService.selectListUser(id);
    }
    /**
     * @param: [departmentid] 部门id
     * @return: List<Integer>  部门id列表
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:59
     */
    @RequestMapping(value = "/userdepartment/selectListUserid/{id}",method = RequestMethod.GET)
    public List<Integer> selectListUseridByDepartmentid(@Param("id") Long id){
        return userDepartmentService.selectListUserid(id);
    }
    /**
     * @param: [id] 用户id
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:05
     */
    @RequestMapping(value = "/userdepartment/deleteByUserid/{id}",method = RequestMethod.GET)
    public boolean deleteByUserid(@Param("id") Long id){
        return userDepartmentService.deleteByUserid(id);
    }
    /**
     * @param: [id] 部门id
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:05
     */
    @RequestMapping(value = "/userdepartment/deleteByDeoartmentid/{id}",method = RequestMethod.GET)
    public boolean deleteByDeoartmentid(@Param("id") Long id){
        return userDepartmentService.deleteByDepartmentid(id);
    }
    /**
     * @param: [d_id, u_id] 部门id，用户id
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:05
     */
    @RequestMapping(value = "/userdepartment/deleteByDeoartmentidUserid/{d_id}/{u_id}",method = RequestMethod.DELETE)
    public boolean deleteByDepartmentidUserid(@Param("d_id")Long d_id,@Param("u_id")Long u_id){
        return userDepartmentService.deleteByDepartmentidUserid(d_id,u_id);
    }
}

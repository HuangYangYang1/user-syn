package com.oce.base.controller;

import com.oce.base.bean.TUser;
import com.oce.base.service.UserDepartmentService;
import com.oce.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: Jiacheng.xu
 * @Date: 2019/6/12 11:33
 * @Description: 用户控制器
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    UserDepartmentService userDepartmentService;
    /**
     * @param:
     * @return: List<TUser> 用户实体信息列表
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:19
     */
    @RequestMapping(value = "/user/queryAll",method = RequestMethod.GET)
    public List<TUser> getUserAll(){
        return userService.findAll();
    }
    /**
     * @param: [id] 用户id
     * @return: TUser  用户实体信息
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:20
     */
    @RequestMapping(value = "/user/queryByid/{id}",method = RequestMethod.GET)
    public TUser queryByid(@PathVariable("id") long id){
        return userService.selectUserByid(id);
    }
    /**
     * @param: [lastName] 用户姓名
     * @return: TUser 用户实体信息
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:22
     */
    @RequestMapping(value = "/user/queryByname/{lastName}",method = RequestMethod.GET)
    public TUser queryByname(@PathVariable("lastName") String lastName ){
        return userService.selectByname(lastName);
    }
    /**
     * @param:
     * @return: int 总用户数量
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:22
     */
    @RequestMapping(value = "/user/queryCount",method = RequestMethod.GET)
    public int queryCount(){
        return userService.selectTotalCount();
    }
    /**
     * @param: [id] 用户id
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:23
     */
    @RequestMapping(value = "/user/delete/{id}",method = RequestMethod.DELETE)
    public boolean deleteUserByid(@PathVariable("id") Long id){
        return userService.deleteUserByid(id);
    }
    /**
     * @param: [name] 用户姓名
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:23
     */
    @RequestMapping(value = "/user/delete/{name}",method = RequestMethod.DELETE)
    public boolean deleteUserByname(@PathVariable("name") String name){
        return userService.deleteUserByname(name);
    }
    /**
     * @param: [tUser] 用户实体信息
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:24
     */
    @RequestMapping(value = "/user/addUser",method = RequestMethod.POST)
    public boolean addUser( TUser tUser){
        return userService.addUser(tUser);
    }
    /**
     * @param: [id] 部门id
     * @return: List<TUser>  用户信息列表
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:02
     */
    @RequestMapping(value = "/user/queryAllFromUserDepartment/{id}",method = RequestMethod.GET)
    public List<TUser> getUserDeparmentAll(@PathVariable("id") Long id){
        return userDepartmentService.selectListUser(id);
    }

}

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

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    UserDepartmentService userDepartmentService;

    @RequestMapping(value = "/user/queryAll",method = RequestMethod.GET)
    public List<TUser> getUserAll(){
        return userService.findAll();
    }
    @RequestMapping(value = "/user/queryByid/{id}",method = RequestMethod.GET)
    public TUser queryByid(@PathVariable("id") int id){
        return userService.selectUserByid(id);
    }
    @RequestMapping(value = "/user/queryByname/{lastName}",method = RequestMethod.GET)
    public TUser queryByname(@PathVariable("lastName") String lastName ){
        return userService.selectByname(lastName);
    }
    @RequestMapping(value = "/user/queryCount",method = RequestMethod.GET)
    public int queryCount(){
        return userService.selectTotalCount();
    }
    @RequestMapping(value = "/user/delete/{id}",method = RequestMethod.DELETE)
    public boolean deleteUserByid(@PathVariable("id") Integer id){
        return userService.deleteUserByid(id);
    }
    @RequestMapping(value = "/user/delete/{name}",method = RequestMethod.DELETE)
    public boolean deleteUserByname(@PathVariable("name") String name){
        return userService.deleteUserByname(name);
    }
    @RequestMapping(value = "/user/addUser",method = RequestMethod.POST)
    public boolean addUser( TUser tUser){
        return userService.addUser(tUser);
    }

    @RequestMapping(value = "/user/queryAllFromUserDepartment/{id}",method = RequestMethod.GET)
    public List<TUser> getUserDeparmentAll(@PathVariable("id") int id){
        return userDepartmentService.selectListUser(id);
    }

}

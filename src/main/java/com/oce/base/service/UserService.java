package com.oce.base.service;


import com.oce.base.bean.TUser;
import com.oce.base.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @Auther: Jiacheng.xu
 * @Date: 2019/6/12 11:33
 * @Description: 用户服务
 */
@Service
public class UserService {
    @Autowired
    UserMapper usermapper;
    @Autowired
    UserDepartmentService userDepartmentService;

    /**
     * @param: [user] 用户实体
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:19
     */
    public boolean insertUser(TUser user){

        boolean flag=false;
        try{
            usermapper.insertUser(user);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * @param:
     * @return: List<TUser> 用户实体信息列表
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:19
     */
    public List<TUser> findAll(){

        return  usermapper.findAll();

    }
    /**
     * @param: [id] 用户id
     * @return: TUser  用户实体信息
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:20
     */
    public  TUser selectUserByid(int id){

        return usermapper.selectUserByid(id);
    }
    /**
     * @param: [lastName] 用户姓名
     * @return: TUser 用户实体信息
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:22
     */
    public  TUser selectByname(String lastName){

        return usermapper.selectStudentByname(lastName);
    }
    /**
     * @param:
     * @return: int 总用户数量
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:22
     */
    public int selectTotalCount(){

        return usermapper.selectTotalUser();
    }
    /**
     * @param: [id] 用户id
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:23
     */
    public boolean deleteUserByid(Integer id){

        boolean flag=false;
        try{
            usermapper.deleteByid(id);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
    /**
     * @param: [name] 用户姓名
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:23
     */
    public boolean deleteUserByname(String name){
        boolean flag=false;
        try{
            usermapper.deleteByname(name);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
    /**
     * @param: [tUser] 用户实体信息
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:24
     */
    public boolean addUser(TUser tUser){

        boolean flag=false;
        try{
            usermapper.insertUser(tUser);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
}

package com.oce.base.service;


import com.oce.base.bean.TDepartment;
import com.oce.base.bean.TUser;
import com.oce.base.bean.TUserDepartment;
import com.oce.base.mapper.UserDepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @Auther: Jiacheng.xu
 * @Date: 2019/6/12 11:33
 * @Description: 用户与部门关系服务
 */
@Service
public class UserDepartmentService {
    @Autowired
    UserDepartmentMapper userDepartmentMapper;


    /**
     * @param: [id] 用户id
     * @return: TDepartment  部门实体信息
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:57
     */
    public TDepartment selectDepartment(int id){

        return userDepartmentMapper.selectDepartment(id);
    }
    /**
     * @param: [departmentid] 部门id
     * @return: List<Integer>  部门id列表
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:59
     */
    public List<Integer> selectListUserid(Integer departmentid){

        return userDepartmentMapper.selectListUserid(departmentid);
    }
    /**
     * @param: [departmentid] 部门id
     * @return: int 一个部门的用户数量
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:00
     */
    public int selectTotalUser(Integer departmentid){

        return userDepartmentMapper.selectUserNumByDepartmentid(departmentid);
    }
    /**
     * @param: [id] 部门id
     * @return: List<TUser>  用户信息列表
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:02
     */
    public List<TUser> selectListUser(int id){

        return userDepartmentMapper.selectListUser(id);
    }
    /**
     * @param:
     * @return: List<TUserDepartment> 用户与部门关系列表
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:02
     */
    public List<TUserDepartment> findAll(){

        return  userDepartmentMapper.findAll();

    }
    /**
     * @param: [department] 用户与部门关系实体
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:04
     */
    public boolean insert(TUserDepartment department){

        boolean flag=false;
        try{
            userDepartmentMapper.insert(department);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
    /**
     * @param: [id] 用户id
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:05
     */
    public boolean deleteByUserid(Integer id){

        boolean flag=false;
        try{
            userDepartmentMapper.deleteByUserid(id);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;

    }
    /**
     * @param: [id] 部门id
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:05
     */
    public boolean deleteByDepartmentid(Integer id){
        boolean flag=false;
        try{
            userDepartmentMapper.deleteByDepartmentid(id);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;

    }
    /**
     * @param: [d_id, u_id] 部门id，用户id
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 18:05
     */
    public boolean deleteByDepartmentidUserid(Integer d_id,Integer u_id){

        boolean flag=false;
        try{
            userDepartmentMapper.deleteByDepartmentidUserid(d_id,u_id);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

}

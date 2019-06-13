package com.oce.base.service;

import com.oce.base.bean.TDepartment;
import com.oce.base.mapper.DepartmentMapper;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Jiacheng.xu
 * @Date: 2019/6/12 11:33
 * @Description: 部门服务
 */
@Service
public class DepartmentService {
    /**
     *  部门映射
     */
    @Autowired
    DepartmentMapper departmentMapper;

    //插入
    /**
     * @param: [department] 部门实体
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 16:58
     */
    public  boolean isnertDepartment(TDepartment department){
        boolean flag=false;
        try{
            departmentMapper.insertDepartment(department);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
    //查询
    /**
      * @param:
      * @return: 部门列表信息
      * @author: Jiacheng.xu
      * @date: 2019/6/12 17:00
     */
    public List<TDepartment> findAll(){
        return  departmentMapper.findAll();
    }
    /**
     * @param:
     * @return: 部门数量
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:00
     */
    public int selectCount(){
        return  departmentMapper.selectTotalDepartment();
    }
    /**
     * @param: [id] 部门id
     * @return: com.oce.base.bean.TDepartment 部门实体信息
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:01
     */
    public TDepartment selectByid(Integer id){
       return departmentMapper.selectDepartmentByid(id);
    }
    /**
     * @param: [short_name] 部门简称
     * @return: com.oce.base.bean.TDepartment 部门实体信息
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:06
     */
    public TDepartment selectBySN(String short_name){

        return departmentMapper.selectDepartmentByShortname(short_name);
    }
    /**
     * @param: [full_name] 部门全称
     * @return: com.oce.base.bean.TDepartment 部门实体信息
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:06
     */
    public TDepartment selectFN(String full_name){

        return departmentMapper.selectDepartmentByFull_name(full_name);
    }
    //删除
    /**
     * @param: [id] 部门id
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:06
     */
    public boolean deleteDepartmentByid(Integer id){

        boolean flag=false;
        try{
            departmentMapper.deleteByid(id);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;

    }
    /**
     * @param: [short_name] 部门简称
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:07
     */
    public boolean deleteDepartmentBySN(String short_name){

        boolean flag=false;
        try{
            departmentMapper.deleteBySN(short_name);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;

    }
    /**
     * @param: [full_name] 部门全称
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:07
     */
    public boolean deleteDepartmentByFN(String full_name){
        boolean flag=false;
        try{
            departmentMapper.deleteByFN(full_name);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;

    }

}

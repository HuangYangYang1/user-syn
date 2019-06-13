package com.oce.base.service;

import com.oce.base.bean.TDepartment;
import com.oce.base.mapper.DepartmentMapper;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;
    @Autowired
    DoubleDepartmentService doubleDepartmentService;
    @Autowired
    UserDepartmentService userDepartmentService;

    //查询部门下的子部门信息
    public TDepartment selectDepartmentById(int i, int id){
        Integer departmentId = doubleDepartmentService.selectDepartmentidFromDepartment(i,id);
        return  departmentMapper.selectDepartmentByid(departmentId);
    }
    //查询员工所在部门信息
    public TDepartment selectDepartmentByid(int id){
        Integer departmentid = userDepartmentService.getDepartmentid(id);
        return departmentMapper.selectDepartmentByid(departmentid);
    }
    //插入
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
    public List<TDepartment> findAll(){
        return  departmentMapper.findAll();
    }
    public int selectCount(){
        return  departmentMapper.selectTotalDepartment();
    }
    public TDepartment selectByid(Integer id){
       return departmentMapper.selectDepartmentByid(id);
    }
    public TDepartment selectBySN(String short_name){
        return departmentMapper.selectDepartmentByShortname(short_name);
    }
    public TDepartment selectFN(String full_name){
        return departmentMapper.selectDepartmentByFull_name(full_name);
    }
    //删除
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

    /**
     * 通过id更新所有的信息
     *
     * @param []
     * @return void
     */
    public void updateAllInfoById(TDepartment tDepartment){
        departmentMapper.updateAllInfoById(tDepartment);

    }

}

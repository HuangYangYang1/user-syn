package com.oce.base.service;

import com.oce.base.bean.TDepartment;
import com.oce.base.bean.TDepartmentDepartment;
import com.oce.base.mapper.DoubleDepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoubleDepartmentService {
    @Autowired
    DoubleDepartmentMapper departmentMapper;


    public boolean insert(TDepartmentDepartment departmentDepartment){
        boolean flag=false;
        try{
            departmentMapper.insert(departmentDepartment);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public List<TDepartmentDepartment> findAll(){
        return  departmentMapper.findAll();
    }

    public  List<TDepartment> selectChileDepartment(Integer f_id){
        return departmentMapper.selectChileByid(f_id);
    }

    public  List<TDepartment> selectAllDepartmentByid(Integer f_id){
        return departmentMapper.selectAllDepartmentByid(f_id);
    }
    public  List<Integer> selectChileDepartmentidByid(Integer f_id){
        return departmentMapper.selectChileidByid(f_id);
    }
    public  List<Integer> selectAllDepartmentidByid(Integer f_id){
        return departmentMapper.selectAllDepartmentidByid(f_id);
    }
    public  Integer selectFatheridByid(Integer c_id){
        return departmentMapper.selectFatherByid(c_id);
    }
    public  int selectTotaChilenumByid(Integer f_id){
        return departmentMapper.selectTotaChilenumByid(f_id);
    }
    public  int selectTotalnumByFid(Integer f_id){
        return departmentMapper.selectTotalnumByFid(f_id);
    }


    public boolean delete(Integer id){
        boolean flag=false;
        try{
            departmentMapper.deleteByid(id);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }


}

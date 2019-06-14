package com.oce.base.service;

import com.oce.base.bean.TDepartment;
import com.oce.base.bean.TDepartmentDepartment;
import com.oce.base.mapper.DoubleDepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @Auther: Jiacheng.xu
 * @Date: 2019/6/12 11:33
 * @Description: 部门与部门关系服务
 */
@Service
public class DoubleDepartmentService {
    @Autowired
    DoubleDepartmentMapper departmentMapper;

    /**
     * @param: [departmentDepartment] 部门与部门关系实体
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:08
     */
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
    /**
     * @param:
     * @return: List<TDepartmentDepartment>  部门与部门关系列表
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:30
     */
    public List<TDepartmentDepartment> findAll(){

        return  departmentMapper.findAll();
    }
    /**
     * @param: [f_id] 上级部门id
     * @return: List<TDepartment> 子部门信息
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:30
     */
    public  List<TDepartment> selectChileDepartment(Long f_id){

        return departmentMapper.selectChileByid(f_id);
    }
    /**
     * @param: [f_id] 上级部门id
     * @return: List<TDepartment>  子部门信息列表
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:37
     */
    public  List<TDepartment> selectAllDepartmentByid(Long f_id){

        return departmentMapper.selectAllDepartmentByid(f_id);
    }
    /**
     * @param: [f_id] 上级部门id
     * @return: List<Integer> 子部门id列表
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:39
     */
    public  List<Integer> selectChileDepartmentidByid(Long f_id){

        return departmentMapper.selectChileidByid(f_id);
    }
    /**
     * @param: [f_id] 上级部门id
     * @return: List<Integer> 所有子部门id列表
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:40
     */
    public  List<Integer> selectAllDepartmentidByid(Long f_id){

        return departmentMapper.selectAllDepartmentidByid(f_id);
    }
    /**
     * @param: [c_id] 子部门id
     * @return: Integer 上级部门id
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:46
     */
    public  Integer selectFatheridByid(Long c_id){

        return departmentMapper.selectFatherByid(c_id);
    }
    /**
     * @param: [f_id] 上级部门id
     * @return: int  子部门数量
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:48
     */
    public  int selectTotaChilenumByid(Long f_id){

        return departmentMapper.selectTotaChilenumByid(f_id);
    }
    /**
     * @param: [f_id] 上级部门id
     * @return: int 所有子部门数量
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:48
     */
    public  int selectTotalnumByFid(Long f_id){

        return departmentMapper.selectTotalnumByFid(f_id);
    }

    /**
     * @param: [id] 部门id
     * @return: boolean
     * @author: Jiacheng.xu
     * @date: 2019/6/12 17:50
     */
    public boolean delete(Long id){

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

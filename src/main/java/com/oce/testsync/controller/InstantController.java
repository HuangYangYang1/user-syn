package com.oce.testsync.controller;

import com.oce.base.bean.TDepartment;
import com.oce.base.bean.TPost;
import com.oce.base.bean.TUser;
import com.oce.testsync.domain.DeptInstant;
import com.oce.testsync.domain.PositionInstant;
import com.oce.testsync.domain.UserInstant;
import com.oce.testsync.toservice.InstantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  获取即时更新的数据controller
 *
 * @author yang.huang
 * @since 2019/6/12 14:28
 */
@RestController
@RequestMapping("instant")
public class InstantController {
    @Autowired
    InstantService instantService;

    /**
     * 传入TPost调用service
     *
     * @param [tPost]
     * @return void
     */
    @PostMapping("/onepost")
    public PositionInstant instantOnePost(PositionInstant positionInstant){
        System.out.println("PositionInstant:" + positionInstant);
        return instantService.instantOnePost(positionInstant);
    }
    /**
     * 传入TDepartment调用servic处理
     *
     * @param [tDepartment]
     * @return void
     */
    @PostMapping("/onedept")
    public void instantOneDept(DeptInstant deptInstant){
        System.out.println("DeptInstant:" + deptInstant);
        instantService.instantOneDept(deptInstant);
    }
    /**
     * 传入TUser调用servic处理
     *
     * @param [tUser]
     * @return void
     */
    @PostMapping("/oneuser")
    public void instantOneUser(UserInstant userInstant){
        System.out.println("UserInstant:" + userInstant);
        instantService.instantOneUser(userInstant);
    }
}

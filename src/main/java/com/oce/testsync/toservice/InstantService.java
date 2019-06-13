package com.oce.testsync.toservice;

import com.oce.base.bean.TDepartment;
import com.oce.base.bean.TPost;
import com.oce.base.bean.TUser;
import com.oce.base.service.DepartmentService;
import com.oce.base.service.PostService;
import com.oce.base.service.UserService;
import com.oce.testsync.domain.DeptInstant;
import com.oce.testsync.domain.PositionInstant;
import com.oce.testsync.domain.UserInstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *  即时更新的service处理
 *
 * @author yang.huang
 * @since 2019/6/12 15:13
 */
@Service
public class InstantService {
    private static final  Logger logger = LoggerFactory.getLogger(InstantService.class);
    @Autowired
    PostService postService;
    @Autowired
    DepartmentService departmentService;
    @Autowired
    UserService userService;

    /**
     * 处理传入的Post并更新数据库
     *
     * @param [positionInstant]
     * @return com.oce.testsync.domain.PositionInstant
     */
    public PositionInstant instantOnePost(PositionInstant positionInstant) {
//        如果传入是空值
        if ("null".equals(positionInstant.getJobtitleid())){
            logger.info("instantOnePost : id is null ");
            return null;
        }else{
            TPost tPost = new TPost();
            tPost.setId(Long.parseLong(positionInstant.getJobtitleid()));
            tPost.setShort_name(positionInstant.getShortname());
            tPost.setFull_name(positionInstant.getFullname());
            tPost.setRemark(positionInstant.getJobtitleremark());
//           判断是1新增还是2保存
            if ("1".equals(positionInstant.getAction())){
                postService.insertPost(tPost);
            }else if ("2".equals(positionInstant.getAction())){
                postService.updateAllInfoById(tPost);
            }
        }
        return positionInstant;
    }

    /**
     * 处理传入的部门并更新数据库
     *
     * @param [deptInstant]
     * @return void
     */
    public void instantOneDept(DeptInstant deptInstant) {

        if ("null".equals(deptInstant.getDepartmentid())){
            logger.info("instantOneDept : id = null");
        }else{
            TDepartment tDepartment = new TDepartment();
            tDepartment.setShort_name(deptInstant.getShortname());
            tDepartment.setFull_name(deptInstant.getFullname());
            tDepartment.setShow_order(deptInstant.getShoworder());
            tDepartment.setCanceled(deptInstant.getCanceled());
            tDepartment.setId(Long.parseLong(deptInstant.getDepartmentid()));
//            判断是新增还是编辑的维护
            if ("1".equals(deptInstant.getAction())){
                departmentService.isnertDepartment(tDepartment);
            }else if ("2".equals(deptInstant.getAction())){
                departmentService.updateAllInfoById(tDepartment);
            }

        }

    }

    /**
     * 处理传入的user并更新数据库
     *
     * @param [userInstant]
     * @return void
     */
    public void instantOneUser(UserInstant userInstant) {
        TUser tUser = new TUser();
        tUser.setId(userInstant.getUserid());
        tUser.setEmail(userInstant.getEmail());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            if (!"".equals(userInstant.getBirthday())){
                tUser.setBirthday(simpleDateFormat.parse(userInstant.getBirthday()));
            }
            if (!"".equals(userInstant.getEnddate())){

                tUser.setEnd_date(simpleDateFormat.parse(userInstant.getEnddate()));
            }
            if (!"".equals(userInstant.getStartdate())){
                tUser.setStart_date(simpleDateFormat.parse(userInstant.getStartdate()));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        tUser.setId_card(userInstant.getCertificatenum());
        tUser.setLast_name(userInstant.getLastname());
        tUser.setLogin_id(userInstant.getLoginid());
        tUser.setMobile(userInstant.getMobile());
        String sex = userInstant.getSex();
        if ("女".equals(sex)){
            tUser.setSex(1);
        }else{
            tUser.setSex(0);
        }
        tUser.setState(Long.parseLong(userInstant.getStatus()));
        tUser.setSystem_language(userInstant.getSystemlanguage());
        tUser.setTelephone(userInstant.getTelephone());


//        判断是新入职员工、编辑员工信息、员工离职
        if ("1".equals(userInstant.getAction())){
//            神奇oa，明明是修改却有时action也为1
            TUser returnUser = userService.selectUserByid(tUser.getId());
            if (returnUser == null){
                userService.insertUser(tUser);
            }else {
                    userService.updateAllInfoByid(tUser);
            }
        }else if("2".equals(userInstant.getAction())){
            userService.updateAllInfoByid(tUser);
        }else if ("3".equals(userInstant.getAction())){
            userService.updateStatusById(tUser.getId(),tUser.getLogin_id(),tUser.getState());
        }


    }



}

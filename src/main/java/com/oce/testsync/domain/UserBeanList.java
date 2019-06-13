package com.oce.testsync.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

/**
 *  用户list
 *
 * @author yang.huang
 * @since 2019/6/12 11:51
 */
@JacksonXmlRootElement(localName = "UserBean-array")
public class UserBeanList {
    /**
     * 用户list
     */
    List<UserBean> userBeans;

    /**
     * 获取用户lisr
     *
     * @param []
     * @return java.util.List<com.oce.testsync.domain.UserBean>
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "UserBean")
    public List<UserBean> getUserBeans() {
        return userBeans;
    }
    /**
     * 设置用户lisr
     *
     * @param [userBeans]
     * @return void
     */
    public void setUserBeans(List<UserBean> userBeans) {
        this.userBeans = userBeans;
    }
}

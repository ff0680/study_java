/**
 * Bestpay.com.cn Inc.
 * Copyright (c) 2011-2020 All Rights Reserved.
 */
package cn.test.demo.web.convert;

import cn.test.demo.service.model.UserRegisterBO;
import cn.test.demo.web.model.request.UserLoginRequest;

/**
 * @author Lcy
 * @version Id: UserLoginConvert.java, v 0.1 2020/5/3 02:27  Exp $$
 */
public class UserLoginConvert {

    public static UserRegisterBO convertRequest2BO(UserLoginRequest userLoginRequest) {
        UserRegisterBO userRegisterBO = new UserRegisterBO();
        userRegisterBO.setLoginNo(userLoginRequest.getLoginNo());
        userRegisterBO.setPassword(userLoginRequest.getPassword());
        return userRegisterBO;
    }
}
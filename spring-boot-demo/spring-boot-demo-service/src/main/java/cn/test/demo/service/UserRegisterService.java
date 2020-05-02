/**
 * Bestpay.com.cn Inc.
 * Copyright (c) 2011-2020 All Rights Reserved.
 */
package cn.test.demo.service;

import cn.test.demo.service.model.UserRegisterBO;

/**
 * 注册
 *
 * @author Lcy
 * @version Id: UserRegisterService.java, v 0.1 2020/5/3 02:21  Exp $$
 */
public interface UserRegisterService {

    Boolean doBusiness(UserRegisterBO request);

    Boolean validator(UserRegisterBO request);

}
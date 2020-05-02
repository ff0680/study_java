/**
 * Bestpay.com.cn Inc.
 * Copyright (c) 2011-2020 All Rights Reserved.
 */
package cn.test.demo.service.impl;

import cn.test.demo.service.UserRegisterService;
import cn.test.demo.service.model.UserRegisterBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Lcy
 * @version Id: UserRegisterServiceImpl.java, v 0.1 2020/5/3 02:22  Exp $$
 */
@Service
@Slf4j
public class UserRegisterServiceImpl implements UserRegisterService {

    @Override
    public Boolean doBusiness(UserRegisterBO request) {

        return null;
    }

    @Override
    public Boolean validator(UserRegisterBO request) throws IllegalArgumentException {
        //todo
        return Boolean.TRUE;
    }
}
/**
 * Bestpay.com.cn Inc.
 * Copyright (c) 2011-2020 All Rights Reserved.
 */
package cn.test.demo.service.impl;

import cn.test.common.exception.BizException;
import cn.test.common.exception.enums.BizExceptionEnum;

import cn.test.dal.demo.model.RegisterDO;
import cn.test.demo.manager.IUserRegisterManagerService;
import cn.test.demo.service.IUserRegisterService;
import cn.test.demo.service.model.UserRegisterBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Lcy
 * @version Id: UserRegisterServiceImpl.java, v 0.1 2020/5/3 02:22  Exp $$
 */
@Service
@Slf4j
public class IUserRegisterServiceImpl implements IUserRegisterService {

    @Autowired
    private IUserRegisterManagerService userRegisterManagerService;

    @Override
    public Boolean doBusiness(UserRegisterBO request) {
        RegisterDO request1 = new RegisterDO();
        request1.setLoginNumber(request.getLoginNo());
        request1.setPassword(request.getPassword());

        RegisterDO registerDO = userRegisterManagerService.queryByLoginName(request.getLoginNo());

        if (registerDO != null) {
            throw new BizException(BizExceptionEnum.Error_Code_000003);
        }

        return userRegisterManagerService.addUser(request1);
    }

    @Override
    public Boolean validator(UserRegisterBO request) throws IllegalArgumentException {
        //todo
        return Boolean.TRUE;
    }
}
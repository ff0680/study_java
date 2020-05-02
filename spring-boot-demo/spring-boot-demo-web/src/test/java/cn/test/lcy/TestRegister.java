/**
 * Bestpay.com.cn Inc.
 * Copyright (c) 2011-2020 All Rights Reserved.
 */
package cn.test.lcy;

import cn.test.demo.web.controller.RegisterController;
import cn.test.demo.web.model.request.UserLoginRequest;
import cn.test.demo.web.model.response.Response2OpenApi;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Lcy
 * @version Id: TestRegister.java, v 0.1 2020/5/3 04:12  Exp $$
 */
@Slf4j
public class TestRegister extends TestEnv {

    @Autowired
    private RegisterController registerController;

    @Test
    public void testRegister() {
        UserLoginRequest request = new UserLoginRequest();
        request.setLoginNo("123");
        request.setPassword("456");

        Response2OpenApi<String> register = registerController.register(request);
        log.info("{}", register);
    }

}
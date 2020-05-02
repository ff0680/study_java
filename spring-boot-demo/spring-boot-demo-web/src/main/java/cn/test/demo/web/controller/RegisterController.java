/**
 * Bestpay.com.cn Inc.
 * Copyright (c) 2011-2020 All Rights Reserved.
 */
package cn.test.demo.web.controller;

import cn.test.common.exception.BizException;
import cn.test.common.exception.enums.BizExceptionEnum;
import cn.test.demo.service.UserRegisterService;
import cn.test.demo.service.model.UserRegisterBO;
import cn.test.demo.web.convert.UserLoginConvert;
import cn.test.demo.web.model.request.UserLoginRequest;
import cn.test.demo.web.model.response.Response2OpenApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lcy
 * @version Id: LoginController.java, v 0.1 2020/5/3 02:01  Exp $$
 */
@RestController
@Slf4j
public class RegisterController {

    @Autowired
    private UserRegisterService userRegisterService;

//    @GetMapping("/login")
//    public Response2OpenApi<String> login(UserLoginRequest request) {
//
//        long currentTime = System.currentTimeMillis();
//        Response2OpenApi<String> response = new Response2OpenApi<>();
//
//        try {
//
//            log.info("call[LoginController][login]PARAMS:{}", request);
//            UserRegisterBO userRegisterBO = UserLoginConvert.convertRequest2BO(request);
//            userRegisterService.validator(userRegisterBO);
//            Boolean result = userRegisterService.doBusiness(userRegisterBO);
//            response.setSuccess(true);
//            response.setResult(result.toString());
//
//        } catch (BizException e) {
//
//            response.setSuccess(false);
//            response.setErrorCode(e.getErrorCode().getErrorCode());
//            response.setErrorMsg(e.getErrorCode().getErrorDesc());
//            log.error("用户注册失败，异常信息是:{},response:{}", e.getMessage(), response);
//
//        } catch (Exception e) {
//
//            response.setSuccess(false);
//            response.setErrorCode(BizExceptionEnum.Error_Code_999999.getErrorCode());
//            response.setErrorMsg(BizExceptionEnum.Error_Code_999999.getErrorDesc());
//            log.error("用户注册失败发生异常，异常信息是:{},response:{}", e.getMessage(), response);
//
//        }
//
//        log.info("call[LoginController][login][{}ms]RESPONSE:{}", System.currentTimeMillis() - currentTime, response);
//
//        return response;
//
//    }

    @GetMapping("/register")
    public Response2OpenApi<String> register(UserLoginRequest request) {

        long currentTime = System.currentTimeMillis();
        Response2OpenApi<String> response = new Response2OpenApi<>();

        try {

            log.info("call[RegisterController][register]PARAMS:{}", request);
            UserRegisterBO userRegisterBO = UserLoginConvert.convertRequest2BO(request);
            userRegisterService.validator(userRegisterBO);
            Boolean result = userRegisterService.doBusiness(userRegisterBO);
            response.setSuccess(true);
            response.setResult(result.toString());

        } catch (BizException e) {

            response.setSuccess(false);
            response.setErrorCode(e.getErrorCode().getErrorCode());
            response.setErrorMsg(e.getErrorCode().getErrorDesc());
            log.error("用户注册失败，异常信息是:{},response:{}", e.getMessage(), response);

        } catch (Exception e) {

            response.setSuccess(false);
            response.setErrorCode(BizExceptionEnum.Error_Code_999999.getErrorCode());
            response.setErrorMsg(BizExceptionEnum.Error_Code_999999.getErrorDesc());
            log.error("用户注册失败发生异常，异常信息是:{},response:{}", e.getMessage(), response);

        }

        log.info("call[LoginController][register][{}ms]RESPONSE:{}", System.currentTimeMillis() - currentTime, response);

        return response;

    }
}
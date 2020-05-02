/**
 * Bestpay.com.cn Inc.
 * Copyright (c) 2011-2020 All Rights Reserved.
 */
package cn.test.demo.web.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Lcy
 * @version Id: UserLoginRequest.java, v 0.1 2020/5/3 02:04  Exp $$
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = -1L;

    private String loginNo;
    private String password;

}
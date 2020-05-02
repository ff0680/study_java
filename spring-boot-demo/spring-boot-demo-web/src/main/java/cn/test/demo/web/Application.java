/**
 * Bestpay.com.cn Inc.
 * Copyright (c) 2011-2020 All Rights Reserved.
 */
package cn.test.demo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Lcy
 * @version Id: Application.java, v 0.1 2020/5/2 21:20  Exp $$
 */
@SpringBootApplication
@ComponentScan(basePackages = "cn.test")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
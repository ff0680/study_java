/**
 * Bestpay.com.cn Inc.
 * Copyright (c) 2011-2020 All Rights Reserved.
 */
package cn.test.lcy;

import cn.test.demo.web.Application;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Lcy
 * @version Id: TestEnv.java, v 0.1 2020/5/3 01:43  Exp $$
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
//@Transactional
@Slf4j
public class TestEnv {

    @Test
    public void testEnv() {
        System.out.println("a");
    }

}
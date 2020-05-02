package cn.test.xff;

import cn.test.dal.demo.mapper.RegisterDOMapper;
import cn.test.dal.demo.model.RegisterDO;

import cn.test.demo.web.Application;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Slf4j
public class TestLoginMapper {

    @Autowired
    private RegisterDOMapper registerDOMapper;

    @Test
    public void testMapper(){
        RegisterDO registerDO = new RegisterDO();
        registerDO.setId(1);
        registerDO.setLoginNumber("small_ff");
        registerDO.setPassword("123456");
        registerDO.setCreateAt(new Date());
        registerDO.setCreateBy("small_ff");
        registerDO.setUpdateAt(new Date());
        registerDO.setUpdateBy("small_ff");
        registerDOMapper.insert(registerDO);


    }
    @Test
    public void testMapper1(){
        RegisterDO registerDO = new RegisterDO();
        registerDO.setLoginNumber("small_ff");
        registerDO=registerDOMapper.select(registerDO);
        log.info("查询结果是{}",registerDO);

    }



}

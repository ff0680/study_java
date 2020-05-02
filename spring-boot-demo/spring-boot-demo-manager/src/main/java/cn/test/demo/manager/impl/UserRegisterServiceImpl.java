package cn.test.demo.manager.impl;

import cn.test.dal.demo.mapper.RegisterDOMapper;
import cn.test.dal.demo.model.RegisterDO;
import cn.test.demo.manager.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterServiceImpl implements UserRegisterService {

    @Autowired
    private RegisterDOMapper registerDOMapper;

    @Override
    public Boolean addUser(RegisterDO request) {

        int result = registerDOMapper.insert(request);

        if (0 == result) {
            return Boolean.FALSE;
        } else {
            return Boolean.TRUE;
        }

    }

    @Override
    public RegisterDO queryByLoginName(String loginNo) {

        RegisterDO registerDO = new RegisterDO();
        registerDO.setLoginNumber(loginNo);

        return registerDOMapper.select(registerDO);
    }




}

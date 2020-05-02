package cn.test.demo.manager;


import cn.test.dal.demo.model.RegisterDO;

/**
 * dal ->      |insert |update |select |delete
 * <p>
 * manager ->  |add    |modify |query |remove
 * <p>
 * <p>
 * <p>
 * 用户注册相关的行为方法
 * 1. 添加用户
 */
//// TODO: 2020/5/3  增加数据库异常处理
public interface UserRegisterService {

    /**
     * 添加用户
     *
     * @param request 添加对象
     * @return 是否添加成功
     */
    Boolean addUser(RegisterDO request);

    /**
     * 查询改登录号是否存在
     *
     * @param loginNo 登录号
     * @return 如果存在返回true ，否则相反
     */
    RegisterDO queryByLoginName(String loginNo);

}

package cn.test.dal.demo.mapper;

import cn.test.dal.demo.model.RegisterDO;
import org.apache.ibatis.annotations.*;

/**
 * RegisterDOMapper:实现登录表的连接
 * insert：插入数据
 * select：查询功能
 */
public interface RegisterDOMapper {

    @Insert("INSERT INTO t_user_basic_login(id,login_number,password,create_at,create_by,update_at,update_by)  VALUES (#{id},#{loginNumber},#{password},#{createAt},#{createBy},#{updateAt},#{updateBy});")
    int insert(RegisterDO registerDO);
    /*
    * registerDO：传入一个RegisterDO的对象
    * 返回值类型：int
    * */

    @Select("SELECT * FROM t_user_basic_login where login_number=#{loginNumber}")
    @Results({
            @Result(property = "id",  column = "id"),
            @Result(property = "loginNumber", column = "login_number"),
            @Result(property = "password", column = "password"),
            @Result(property = "createAt", column = "create_at"),
            @Result(property = "createBy", column = "create_by"),
            @Result(property = "updateAt", column = "update_at"),
            @Result(property = "updateBy", column = "update_by")

    })
    RegisterDO select( RegisterDO registerDO);
    /*
    * 传入参数：RegisterDO registerDO
    * 返回值类型：RegisterDO
    *
    * */
}

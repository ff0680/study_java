package cn.test.dal.demo.mapper;

import cn.test.dal.demo.model.RegisterDO;
import org.apache.ibatis.annotations.*;


public interface RegisterDOMapper {

    @Insert("INSERT INTO t_user_basic_login(id,login_number,password,create_at,create_by,update_at,update_by)  VALUES (#{id},#{loginNumber},#{password},#{createAt},#{createBy},#{updateAt},#{updateBy});")
    int insert(RegisterDO registerDO);

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
}

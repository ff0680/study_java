package cn.test.dal.demo.model;

import lombok.Data;

import java.util.Date;

/**
 * RegisterDO:此方法是登录表对应实体（代码里的变量）
 */
@Data
public class RegisterDO {

    /*
    * id：主键
    * loginNumber：登录名
    * password:登录密码
    * createAt：创建时间
    * createBy：创建人
    * updateAt：修改时间
    * updateBy：修改人
    * */
    private long id;
    private String loginNumber;
    private String password;
    private Date createAt;
    private String createBy;
    private Date updateAt;
    private String updateBy;

}

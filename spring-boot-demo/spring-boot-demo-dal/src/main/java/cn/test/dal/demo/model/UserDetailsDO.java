package cn.test.dal.demo.model;

import lombok.Data;

import java.util.Date;

/**
 * UserDetailsDO:此方法是用户表对应的实体
 */
@Data
public class UserDetailsDO {
    /**/
    private long id;
    private long userBasicLoginId;
    private String email;
    private String qqNumber;
    private String address;
    private Date createAt;
    private String createBy;
    private Date updateAt;
    private String updateBy;

}

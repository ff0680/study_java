# study_java
### case1 :简单登录
- 1：数据库设计，包含两张表 （所有的库表必须包含以下5个统一字段，id无符号自增，create_at , create_by , update_at , update_by）
- 1.1 表1 记录登录号与密码（明文）
- 1.2 表2 登录号-用户 基本信息 （一名用户仅有一个登录号）

CREATE TABLE t_user_basic_login
(
    id bigint unsigned  PRIMARY KEY auto_increment COMMENT '主键',
    login_number varchar(16) unique COMMENT '登录名' ,
    password varchar(16) NOT NULL COMMENT '密码',
    create_at DATETIME NOT NULL  COMMENT '记录创建时间',
    create_by varchar(200) NOT NULL  COMMENT '创建人',
    update_at DATETIME NOT NULL  COMMENT '修改时间',
    update_by varchar(200) NOT NULL  COMMENT '修改人'
);




CREATE TABLE t_user_details
(
    id bigint unsigned  PRIMARY KEY auto_increment COMMENT '主键',
    user_basic_login_id bigint unsigned  COMMENT 'user_basic_login表的id',
    e_mail varchar(16) NOT NULL  COMMENT 'e-mail',
    qq varchar(16) NOT NULL  COMMENT 'qq',
    address varchar(200) NOT NULL  COMMENT '地址',
    create_at DATETIME NOT NULL  COMMENT '创建时间',
    create_by varchar(200) NOT NULL  COMMENT '创建人',
    update_at DATETIME NOT NULL  COMMENT '修改时间',
    update_by varchar(200) NOT NULL  COMMENT '记录创建时间'
);

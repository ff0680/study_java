# study_java
### case1 :简单登录
- 1：数据库设计，包含两张表 （所有的库表必须包含以下5个统一字段，id无符号自增，create_at , create_by , update_at , update_by）
- 1.1 表1 记录登录号与密码（明文）
- 1.2 表2 登录号-用户 基本信息 （一名用户仅有一个登录号）

CREATE TABLE t_user_basic_login
(
    id bigint unsigned  PRIMARY KEY auto_increment COMMENT '主键',
    login_number varchar(16) unique COMMENT '登录名' ,
    password varchar(16) NOT NULL DEFAULT '' COMMENT '密码',
    create_at DATETIME NOT NULL  COMMENT '记录创建时间',
    create_by varchar(200) NOT NULL  DEFAULT '' COMMENT '创建人',
    update_at DATETIME NOT NULL  COMMENT '修改时间',
    update_by varchar(200) NOT NULL DEFAULT ''  COMMENT '修改人'
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT = '基础登录表';





CREATE TABLE t_user_details
(
    id bigint unsigned  PRIMARY KEY auto_increment COMMENT '主键',
    user_basic_login_id bigint unsigned  COMMENT 'user_basic_login表的id',
    email varchar(16) NOT NULL DEFAULT '' COMMENT 'e-mail',
    qq_number varchar(16) NOT NULL DEFAULT '' COMMENT 'qq',
    address varchar(200) NOT NULL  DEFAULT '' COMMENT '地址',
    create_at DATETIME NOT NULL  COMMENT '创建时间',
    create_by varchar(200) NOT NULL DEFAULT '' COMMENT '创建人',
    update_at DATETIME NOT NULL   COMMENT '修改时间',
    update_by varchar(200) NOT NULL DEFAULT '' COMMENT '记录创建时间'
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT = '用户信息表';

# study_java
### case1 :简单登录
- 1：数据库设计，包含两张表 （所有的库表必须包含以下5个统一字段，id无符号自增，create_at , create_by , update_at , update_by）
- 1.1 表1 记录登录号与密码（明文）
- 1.2 表2 登录号-用户 基本信息 （一名用户仅有一个登录号）


CREATE TABLE register
(
    id int,
    name varchar(16),
    pwd varchar(16),
    create_at date,
    create_by varchar(200),
    update_at date,
    update_by varchar(200)
);



CREATE TABLE login
(
    id int,
    name varchar(16),
    pwd varchar(16),
    create_at date,
    create_by varchar(200),
    update_at date,
    update_by varchar(200)
);



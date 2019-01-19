#### JDBC & MySQL

##### 要点

- Java Database Connection，通过 Java 访问数据库。
- execute：返回值类型为 boolean，true 表示执行的是查询语句，false 表示增删改等。
- executeUpdate：返回值类型是 int，表示有多少条数据受到了影响。
- ORM：Object Relationship Database Mapping，对象和关系数据库的映射。
- DAO：Data Access Object，数据库访问对象。

##### MySQL

###### 基础操作

- show databases;
- use javabook;
- show tables;
- create database javabook;
- mysql> create table product_ (
  -> id int(11) not null auto_increment,
  -> name varchar(30),
  -> price float,
  -> primary key (id)
  -> )default charset=utf8;
- create user "xzw"@localhost identified by "12345678";
- grant select,insert,update,delete,create,create view,drop,execute,references on person.* to xzw@localhost identified by "12345678";
- alter table product_ add column alal int(11) not null;
- alter table product_ drop alal;
- show table status from test; 
- 分页查询：select * from course limit 0,5;
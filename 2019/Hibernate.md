#### Hibernate

##### 要点

- 需要 jar 包。
- 需要创建实体类（Product，属于POJO）用于映射数据库中的表（product_）。
- 在包 POJO 下需要新建配置文件 `Product.hbm.xml`，其中 Product 与实体类（Product）名字一致。
- 在 src 下需要新建 `hibernate.cfg.xml`，用于配置访问数据库要用到的驱动，url，账号密码等。

##### hibernate 基本步骤

1. 获取 SessionFactory
2. 通过 SessionFactory 获取一个 Session
3. 在 Session 基础上开启一个事务
4. 通过调用 Session 的 save 方法把对象保存到数据库
5. 提交事务
6. 关闭 Session
7. 关闭 SessionFactory

##### Hibernate 中对象状态

- 实体对象的状态有三种：瞬时状态、持久状态、脱管状态

##### 各种概念

- 事务：Hibernate 对数据的各种操作都应该放在事务里面。在事物中的各种操作要么都成功，要么都失败。
- 

##### Product.hbm.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-mapping PUBLIC
    "-//Hibernate/Hibernate Mapping DTD 3.0//EN"
    "http://www.hibernate.org/dtd/hibernate-mapping-3.0.dtd">
    
<hibernate-mapping package="pojo">
    <class name="Product" table="product_">		// 表示类 Product 对应表 product_ 
        <id name="id" column="id">		// 表示属性id，映射表里的字段id
            <generator class="native"></generator>	// 表示id的自增长方式使用数据库的本地方式
        </id>
        // 这里配置的时候，只写了属性name,没有通过column="name" 显式的指定字段，那么字段的名字也是name
        <property name="name"></property>
        <property name="price"></property>
    </class>
</hibernate-mapping>
```

##### hibernate.cfg.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
    "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
    "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">

<hibernate-configuration>
    
        <session-factory>
            <!-- Database connection settings -->
            <property name="connection.driver_class">com.mysql.cj.jdbc.Driver</property>
            <property name="connection.url">jdbc:mysql://localhost/test?serverTimezone=UTC</property>
            <property name="connection.username">xzw</property>
            <property name="connection.password">12345678</property>
            <!-- SQL dialect -->
            // 表示使用 MySQL 方言
            <property name="dialect">org.hibernate.dialect.MySQLDialect</property>
            // hibernate 的事务管理方式，即每个线程一个事务
            <property name="current_session_context_class">thread</property>
            <property name="show_sql">true</property>	// 是否在控制台显示sql语句
            <property name="hbm2ddl.auto">update</property>	//自动更新数据库表结构
            <mapping resource="pojo/Product.hbm.xml"/>	// 表示hibernate会去识别Product这个实体类
        </session-factory>
    
</hibernate-configuration>
```


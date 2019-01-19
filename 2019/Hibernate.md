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
- 属性延迟加载：用 load 方式获取对象时，只有访问了对象的属性，Hibernate 才会去数据库中查询，否则不访问数据库。
- 关系延迟加载
- 级联：通常用在 one-to-many 和 many-to-many，极少用于 many-to-one；
  - all：所有操作都执行级联操作；
  - none：都不，（默认是 none）；
  - delete：删除时；
  - save-update：保存和更新时。
- 一级缓存：Hibernate 默认开启一级缓存，一级缓存存放在 session 上。
- 二级缓存：二级缓存在 SessionFactory 上。
- 分页查询：使用 Criteria 进行分页查询。
- 乐观锁：用于处理脏数据。
- 数据库连接池：如 C3P0连接池（使用时需要 jar 包）

##### Hibernate 注解

- 注解分类：类注解，属性注解，关系注解，其他注解等。

- 类注解：@Entity，表示这是一个实体 bean（即一个持久化 POJO 类）

  ​		@Table(name = "product_")，表示这是一个类，映射到表名 `product-`

- 属性注解：（注解配置在属性对应的 getter 方法上）

  - @Id：表示这是主键
  - @GeneratedValue(strategy = GenerationType.IDENTITY)：表示自增长方式使用 MySQL 自带的方式
  - @Column(name = "id") ：表示映射到表的字段 id

- 关系注解：一对多注解，多对一注解，多对多注解。

- ```java
  package com.how2java.pojo
  import javax.persistence.Column;
  import javax.persistence.Entity;
  import javax.persistence.GeneratedValue;
  import javax.persistence.GenerationType;
  import javax.persistence.Id;
  import javax.persistence.Table;
   
  @Entity
  @Table(name = "product_")
  public class Product {
      int id;
      String name;
      float price;
      Category category;
       
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      @Column(name = "id")  
      public int getId() {
          return id;
      }
      public void setId(int id) {
          this.id = id;
      }
      @Column(name = "name")
      public String getName() {
          return name;
      }
      public void setName(String name) {
          this.name = name;
      }
      @Column(name = "price")
      public float getPrice() {
          return price;
      }
      public void setPrice(float price) {
          this.price = price;
      }
      
      @ManyToOne
      @JoinColumn(name="cid")
      public Category getCategory() {
          return category;
      }
      public void setCategory(Category category) {
          this.category = category;
      }
        
  }
  /* 
  	@OneToMany(fetch=FetchType.EAGER)
      @JoinColumn(name="cid")
      public Set<Product> getProducts() {
          return products;
      }
      public void setProducts(Set<Product> products) {
          this.products = products;
      }
  */
  /*
  	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
      @JoinTable(
              name="user_product",
              joinColumns=@JoinColumn(name="pid"),
              inverseJoinColumns=@JoinColumn(name="uid")
      )    
      public Set<User> getUsers() {
          return users;
      }
      
      @ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
      @JoinTable(
              name="user_product",
              joinColumns=@JoinColumn(name="uid"),
              inverseJoinColumns=@JoinColumn(name="pid")
      )    
      public Set<Product> getProducts() {
          return products;
      }
  */
  ```

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
            
            <!-- C3P0 -->
            <property name="hibernate.connection.provider_class">org.hibernate.connection.C3P0ConnectionProvider</property>
            <property name="hibernate.c3p0.max_size">20</property>
            <property name="hibernate.c3p0.min_size">5</property>
            <property name="hibernate.c3p0.timeout">50000</property>
            <property name="hibernate.c3p0.max_statements">100</property>
            <property name="hibernate.c3p0.idle_test_period">3000</property>
            <property name="hibernate.c3p0.acquire_increment">2</property>
            <property name="hibernate.c3p0.validate">false</property>
            
            <mapping resource="pojo/Product.hbm.xml"/>	// 表示hibernate会去识别Product这个实体类
        </session-factory>
    
</hibernate-configuration>
```


####  Mybatis

##### 要点

- 新建 Java Project 即可。
- 需要相关 jar 包
- 在 src 目录下新建 mybatis-config.xml，作用主要是提供链接数据库用的驱动，数据库名称，账号密码等。

##### mybatis-config.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE configuration
PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
"http://mybatis.org/dtd/mybatis-3-config.dtd">

<configuration>
    <typeAliases>
        <package name="pojo"/>
    </typeAliases>
    <environments default="development">
        <environment id="development">
            <transactionManager type="JDBC"></transactionManager>
            <dataSource type="POOLED">
                <property name="driver" value="com.mysql.cj.jdbc.Driver"/>
                <property name="url" value="jdbc:mysql://localhost/test?serverTimezone=UTC"/>
                <property name="username" value="xzw"/>
                <property name="password" value="12345678"/>
            </dataSource>
        </environment>
    </environments>
    <mappers>
        <mapper resource="pojo/Category.xml"/>
    </mappers>
</configuration>
```

##### Category.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper
    PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
    "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
    
<mapper namespace="pojo">
    <select id="listCategory" resultType="Category">select * from category_</select>
</mapper>
```


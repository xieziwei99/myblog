#### Spring

##### 要点

- Spring 是基于 IOC 和 AOP 结构的 J2EE 框架。
- 在新建普通 Java 项目下：
  - 需要相关 jar 包
  - 在 src 目录下新建 applicationContext.xml（Spring 核心配置文件）

##### IOC

- Inversion Of Control 反转控制。
- 简单来讲，就是创建对象由以前程序员自己 new 出来，变成了交由 Spring 创建对象。

##### DI

- Dependency Inject 依赖注入。
- 简单来讲，就是拿到的对象的属性，已经被注入好了相关值，直接使用即可。

##### AOP

- Aspect Oriented Program 面向切面编程

- 把功能分为**核心业务代码**和**周边功能**，核心业务指登陆、增删改查等，周边功能指性能统计、日志、事务管理等

  那么周边功能，被定义为切面

##### applicationContext.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:aop="http://www.springframework.org/schema/aop"
    xmlns:tx="http://www.springframework.org/schema/tx"
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="
   http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
   http://www.springframework.org/schema/aop
   http://www.springframework.org/schema/aop/spring-aop-3.0.xsd
   http://www.springframework.org/schema/tx
   http://www.springframework.org/schema/tx/spring-tx-3.0.xsd
   http://www.springframework.org/schema/context     
   http://www.springframework.org/schema/context/spring-context-3.0.xsd">

    <!-- 表示使用注解方式 -->
    <context:annotation-config></context:annotation-config>

	<bean name="c" class="pojo.Category">
	    <property name="name" value="c1"></property>
	</bean>   
	<bean name="p" class="pojo.Product">
	   <property name="name" value="p1"></property>
<!--  	   <property name="category" ref="c"></property>         -->
	</bean>

</beans>

/*
<bean id="loggerAspect" class="aspect.LoggerAspect"></bean>
    <aop:config>
        <aop:pointcut expression="execution(* service.ProductService.*(..))" id="loggerCutpoint"/>
        <aop:aspect id="logAspect" ref="loggerAspect">
            <aop:around method="log" pointcut-ref="loggerCutpoint"/>
        </aop:aspect>
    </aop:config>
*/
```


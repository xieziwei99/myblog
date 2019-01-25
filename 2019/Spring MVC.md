#### SpringMVC

##### 要点

- 需要相关 jar 包
- 创建 Dynamic Web Project，在 WEB-INF 目录下会有一个 web.xml 文件
- 在 WEB-INF 目录下创建 springmvc-servlet.xml，这是 SpringMVC 的映射配置文件

##### web.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://java.sun.com/xml/ns/javaee" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd" id="WebApp_ID" version="3.0">
  <display-name>springmvc</display-name>
  
  <servlet>
    <servlet-name>springmvc</servlet-name>
    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
    <load-on-startup>1</load-on-startup>	// 启动时加载，值（正值）越小，优先级越高
  </servlet>
  <servlet-mapping>
    <servlet-name>springmvc</servlet-name>
    <url-pattern>/</url-pattern>
  </servlet-mapping>
  
</web-app>
```

##### springmvc-servlet.xml 

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN//EN" "http://www.springframework.org/dtd/spring-beans.dtd">

<beans>
    <bean id="simpleUrlHandlerMapping" class="org.springframework.web.servlet.handler.SimpleUrlHandlerMapping">
        <property name="mappings">
            <props>
                // 表示访问路径/index会交由id=indexController的bean来处理
                <prop key="/index">indexController</prop>	
            </props>
        </property>
    </bean>
    <bean id="indexController" class="controller.IndexController"></bean>
</beans>
```


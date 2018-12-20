### Soring MVC 基础

#### Spring MVC 概述

- MVC：Model + View + Controller （数据模型 + 视图 + 控制器）。
- 三层架构 ：Presentation tier + Application tier + Data tier （展现层 + 应用层 + 数据访问层）。
- MVC 只存在三层架构的展现层：
  - M 实际上是包含数据的对象，在 Spring MVC 里，有一个专门的类叫 Model，用来和 V 之间的数据交互。
  - V 指视图页面，包含 JSP[^1] 等。
  - C 是控制器（Spring MVC 中注解 @Controller 的类）
- 三层架构是整个应用的架构，由 Spring 框架负责管理。一般项目结构中都有 Service 层，DAO层[^2]，对应于应用层和数据访问层。

#### Spring MVC 项目搭建 HelloWorld

- 环境：Linux（Ubuntu），IDEA
- 需注意的操作步骤：
  1. 在 Linux 下安装 Tomcat
  2. 将在 IDEA 下写好的项目导出为 war 包
  3. 将该 war 包放在 Tomcat/webapp 目录下
  4. 运行 startup.sh  (会自动解析 war 包)
  5. 访问 localhost 相关目录
- 实例代码见包`highlight_springmvc4`





[^1]: Java Server Pages，中文名叫java服务器页面。 
[^2]: (Data Access Object) 数据访问对象是一个面向对象的数据库接口
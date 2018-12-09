

### Spring 高级话题

#### Spring Aware

- 含义：使你的 Bean 意识到 Spring 容器的存在，这样才能调用 Spring 所提供的资源。
- 示例代码见包`highlight_spring4.ch3.aware`

#### 多线程（异步）

- 示例代码见包`highlight_spring4.ch3.taskexecutor`

#### 计划任务

- 在配置类中用 @EnableScheduling 注解开启对计划任务的支持。
- 在计划任务执行类中通过 @Scheduled 声明该方法是计划任务。
- 示例代码见包`highlight_spring4.ch3.taskscheduler`

#### 条件注解 @Conditional

- 示例代码见包`highlight_spring4.ch3.conditional`

#### 组合注解和元注解

- 我们可以自定义注解，在自定义的注解上加入其他**注解**（称为元注解），那么该自定义的注解就具备了元注解的功能，并称之为**组合注解**。
- 示例代码见包`highlight_spring4.ch3.annotation`

#### 测试

- 准备工作：增加Spring测试的依赖包到Maven。

  ```html
  <!-- Spring test 支持 -->
  <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-test</artifactId>
      <version>4.0.0.RELEASE</version>
  </dependency>
  <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
  </dependency>
  ```

  **遇到的问题**：在填spring-test的版本号时，起先是填`${spring-framework.version}`，但报错，说找不到jar包，百度后尝试**换成具体的版本号**`4.0.0.RELEASE`，有效。

- 基于Maven构建的项目结构：
  - src/test/java：测试代码；
  - src/test/resourses：测试资源；
  - src/main/java：项目源码；
  - src/main/resourses：项目资源。
- 示例代码见包`highlight_spring4.ch3.fortest`
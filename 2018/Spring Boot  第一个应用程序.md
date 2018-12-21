### Spring Boot  第一个应用程序

#### 运用 Spring Boot

- build.gradle：Gradle构建说明文件。
- ReadingListApplication.java：应用程序的启动引导类(bootstrap class), 也是主要的Spring配置类。
  - @SpringBootApplication 开启了Spring的组件扫描和Spring Boot的自动配置功能，包含三部分
    1. Spring的 @Configuration
    2. Spring的 @ComponentScan
    3. Spring Boot 的 @EnableAutoConfiguration：开启Spring Boot自动配置
- application.properties：用于配置应用程序和Spring Boot的属性。
- ReadingListApplicationTests.java：一个基本的集成测试类。 
  - @SpringBootTest：加载上下文

#### 使用起步依赖

- 在项目的构建说明文件里增加的这个依赖,会覆盖传递依赖引入的另一个依赖。

#### 使用自动配置



示例代码见项目`readinglist`
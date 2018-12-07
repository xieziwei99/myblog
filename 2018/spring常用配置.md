### Spring 常用配置

#### Bean 的 Scope

- Scope 描述的是 spring 容器如何新建 bean 的实例的。

- 1. `@Service `

     默认为 Singleton，相当于 `@Scope("singleton")`

     作用：一个 spring 容器中只有一个 bean 的实例，全容器共享一个实例。

  2. `@Service`

     `@Scope("prototype")`

     作用：每次调用新建一个 bean 的实例。

- 示例代码见包`highlight_spring4.ch2.scope`

#### spring 表达式语言和资源调用

- spring 主要在注解 @Value 的参数中使用表达式。
- 示例代码见包`highlight_spring4.ch2.el`

#### bean 的初始化和销毁

- 示例代码见包`highlight_spring4.ch2.prepost`

#### Profile

- 示例代码见包`highlight_spring4.ch2.profile`

#### 事件（Application Event）

- 示例代码见包`highlight_spring4.ch2.event`
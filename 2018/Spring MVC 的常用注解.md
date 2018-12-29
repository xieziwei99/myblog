### Spring MVC 的常用注解

- @Controller
  - 注解在类上，表明该类是控制器 Bean
- @RequestMapping
  - 用来映射 Web 请求（访问路径和参数）、处理类和方法
  - 可以注解在方法或类上，注解在方法上的 @RequestMapping 路径会继承注解在类上的路径
  - @RequestMapping 支持 Servlet 的 request 和 response 作为参数，也支持对 request 和 response 的媒体类型进行配置
- @ResponseBody
  - 它支持将返回值放在 response 体内，而不是返回一个页面
  - 其可放置在返回值前或方法上
- @RequestBody
  - 其允许 request 的参数在 request 体中，而不是直接链接在地址后面
  - 此注解放在参数前
- @PathVariable
  - 用来接收路径参数，如 /news/001，可接收 001 作为参数
  - 此注解放在参数前
- @RestController
  - 是组合注解，组合了 @Controller 和 @ResponseBody



示例代码见项目 `highlight_springmvc4`

新增部分包 `highlight_springmvc4.domain` 和包 `highlight_springmvc4.web.ch4_3`
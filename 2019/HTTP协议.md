#### HTTP协议

##### 要点

1. 超文本传输协议 Hyper Text Transfer Protocol 
2. 浏览器和WEB服务器之间，使用的就是一种叫做HTTP的协议。 这是BS (Browser Server )架构模型的基础
3. HTTP协议由请求和响应两种类型组成

#####  请求协议（Request）

1. 由 请求行，请求头部，空行 和 请求数据 4部分组成

   - 请求行：如提交的 method 是 POST，访问的路径是 addHero

   - 请求头部（Request Headers）：

     Host: 主机名
     User-Agent: 浏览器基本资料
     Accept: 浏览器能够识别的响应类型
     Accept-Language: 浏览器默认语言
     Accept-Encoding: 浏览器能够识别的压缩方式
     Referer: 来路页面， /addHero 这个路径是通过addHero.html这个页面跳转过来的。
     Connecton：是否保持连接

   - 请求数据：例如本次提交数据所传递的参数

##### 响应协议（Response）

1. 响应信息由状态行，消息报头，响应正文组成
   - 状态行：访问页面，可以看到响应代码是 200 OK，即表示响应成功
   - 消息报头（Response Headers）：
     - 消息报头中提供如下信息： 
       Content-Length: 表示长度
       Content-Type: 内容格式
       Date: 日期
       Server: 服务器类型
   - 响应正文：在响应正文里是具体的html内容

##### 响应代码

- 200 成功
- 301 表示客户端跳转，永久性的跳转
- 302 客户端跳转，临时性的跳转
- 304 表示资源未被修改
- 404表示访问的页面不存在
- 500 表示服务端的错误
- 403 禁止访问
- 406 无法接受
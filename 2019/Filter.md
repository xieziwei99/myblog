#### Filter

##### 要点

- Filter就像一个一个哨卡，用户的请求需要经过Filter并且可以有多个过滤器
- Filter 一定会随着 Tomcat 的启动而自启动
- 如果有很多servlet都需要获取中文，那么就必须在每个Servlet中增加这段代码。有一个简便的办法，那就是通过Filter过滤器进行中文处理 ，那么所有的Servlet都不需要单独处理了。  



示例代码见包`j2ee_dynamic`
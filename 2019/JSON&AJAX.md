### JSON & AJAX

#### JSON

##### 创建 json 对象

- 例如：var gareen = {"name":"盖伦","hp":616}; 

##### 创建 json 数组

- 例如：

  ```json
  var heros=
  [
      {"name":"盖伦","hp":616},
      {"name":"提莫","hp":313},
      {"name":"死歌","hp":432},
      {"name":"火女","hp":389}
  ]
  ```

##### 要点

- JavaScript对象 分内置对象(Number,String,Array,Date,Math)和自定义对象 
  JSON就是自定义对象，只不过是以JSON这样的数据组织方式表达出来 
  所以不存在JSON对象与JavaScript对象的转换问题

- 字符串转 json 对象

  例如：var gareen = eval("("+s3+")");

- json 对象转字符串

  例如：var heroString = JSON.stringify(hero)


#### AJAX

##### 要点

- AJAX，即 Asynchronous JavaScript and Xml，实现异步刷新

##### 步骤

1. 创建 XHR：var xmlhttp =new XMLHttpRequest();
2. 设置响应函数：通过 xmlhttp.onreadystatechange=checkResult 就可以指定用checkResult 函数进行处理。
3. 设置并访问页面（发出请求）：open()，send()
4. 服务器处理响应信息

##### 例如：

```js
<span>输入账号 :</span>
<input id="name" name="name" onkeyup="check()" type="text"> 
<span id="checkResult"></span>
  
<script>
var xmlhttp;
function check(){
  var name = document.getElementById("name").value;
  var url = "http://how2j.cn/study/checkName.jsp?name="+name;
  
  xmlhttp =new XMLHttpRequest();
  xmlhttp.onreadystatechange=checkResult; //响应函数
  xmlhttp.open("GET",url,true);   //设置访问的页面
  xmlhttp.send(null);  //执行访问
}
  
function checkResult(){
  if (xmlhttp.readyState==4 && xmlhttp.status==200)
    document.getElementById('checkResult').innerHTML=xmlhttp.responseText;
   
}
  
</script>
```


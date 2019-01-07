#### JQuery

##### 要点

-   JQuery是一个javascript的框架，是对javascript的一种封装。 通过JQuery可以非常方便的操作html的元素   

-  $(function(){})，表示加载文档

- 通过 id 获取 JQuery 对象：通过$("#id") 获取到的是一个 JQuery 对象

- 增加监听器：

  ```js
  $(function(){
       $("#b1").click(function(){
          alert("点击了按钮");
       });
  });
  ```

##### 方法

- 取值：$("#input1").val()
- 获取元素内容,如果有子元素，保留标签：$("#d1").html()
- 获取元素内容,如果有子元素，不包含标签：$("#d1").text()

##### CSS

- addClass：

  ```js
  <script src="http://how2j.cn/study/jquery.min.js"></script>
   
  <script>
  $(function(){
     $("#b1").click(function(){
        $("#d").addClass("pink");
     });
    
  });
    
  </script>
    <button id="b1">增加背景色</button>
  <br>
  <br>
   
  <style>
  .pink{
     background-color:pink;
  }
  </style>
    
  <div id="d">
    
  Hello JQuery
    
  </div>
  ```

- removeClass：$("#d").removeClass("pink");

- toggleClass() ：切换，如果存在就删除 ，如果不存在，就添加，$("#d").toggleClass("pink");

- css()，直接设置：

  - 单一：$("#d1").css("background-color","pink");
  - 多种：$("#d2").css({"background-color":"pink","color":"green"});

##### AJAX

```js
<script src="http://how2j.cn/study/jquery.min.js"></script>
 
<div id="checkResult"></div>
  
输入账号 :<input id="name" type="text">
  
<script>
$(function(){
   $("#name").keyup(function(){
     var page = "/study/checkName.jsp";
     var value = $(this).val();
        $.ajax({
            url: page,
            data:{"name":value},
            success: function(result){
              $("#checkResult").html(result);
            }
        });
   });
});
 
</script>
```

##### DOM 与 JQuery 转换

- JQuery 转 DOM：通过get(0)或者[0]
- DOM 转 JQuery：通过$()


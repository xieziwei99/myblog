#### JavaScript

1. JavaScript 用于网页和用户之间的交互，比如提交的时候，进行用户名是否为空的判断。 

2. 完整的javascript由[语言基础](http://how2j.cn/k/javascript/javascript-type/428.html)，[BOM](http://how2j.cn/k/javascript/javascript-bom-window/449.html)和[DOM](http://how2j.cn/k/dom/dom-node/457.html)组成。

3. javascript 代码必须放在 script 标签中，script 标签可以放在 html 的任何地方，一般建议放在 head 标签里  

4. 通常将 JavaScript 代码独立出来放在 .js 文件中，例如：

   <script src="http://how2j.cn/study/hello.js"></script>

5. 注释：//  &  /* */

6. 变量：可以用 var 声明；可以不用 var；命名规则与 java 类似，可以用 '_' 或 '$'

7. 基本数据类型：undefined，Boolean, Number, String，null

8. 伪对象概念：javascript是一门很有意思的语言，即便是基本类型，也是伪对象，所以他们都有属性和方法。

9. 函数：function f() { }


##### BOM

- BOM即 浏览器对象模型(Brower Object Model) 

  浏览器对象包括 ：

  - Window(窗口) 	// 可获得宽度和高度，可打开新窗口，window.open("http://www.baidu.com")
  - Navigator(浏览器)         提供浏览器相关的信息
  - Screen (客户端屏幕)     表示用户的屏幕相关信息
  - History(访问历史)         如：history.back();     history.go(-2);
  - Location(浏览器地址)   Location表示浏览器中的地址栏

- 弹出框：alert	警告框	
  ​               confirm	确认框	
  ​               prompt	输入框


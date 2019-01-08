<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 测试监听context </title>
</head>
<body>
    <%
    application.setAttribute("test", 1);
    application.setAttribute("test", 2);
    application.removeAttribute("test");
    %>
</body>
</html>
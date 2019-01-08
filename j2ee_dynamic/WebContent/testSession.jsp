<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test Session Listener</title>
</head>
<body>
    <%
    session.setAttribute("test", 1);
    session.setAttribute("test", 2);
    session.removeAttribute("test");
    %>
</body>
</html>
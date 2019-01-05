<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SetSession Page</title>
</head>
<body>
	<%
		session.setAttribute("name", "lingjiu");
	%>
	<a href="getSession.jsp">跳转到获取session的页面</a>
	<%--
	<a href="<%=response.encodeURL("getSession.jsp")%>">跳转到获取session的页面</a>
	 --%>
</body>
</html>
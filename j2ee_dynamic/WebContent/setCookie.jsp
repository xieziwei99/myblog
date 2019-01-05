<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SetCookie Page</title>
</head>
<body>
	<%
		Cookie cookie = new Cookie("xzw", "123");
		cookie.setMaxAge(60 * 24 * 60);
		cookie.setPath("localhost");
		response.addCookie(cookie);
	%>
	<a href="getCookie.jsp">跳转到获取Cookie的页面</a>
</body>
</html>
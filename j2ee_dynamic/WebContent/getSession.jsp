<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GetSession Page</title>
</head>
<body>
	<%String name = (String) session.getAttribute("name"); %>
	session中的name:<%=name %>
</body>
</html>
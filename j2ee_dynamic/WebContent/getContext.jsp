<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GetContext Page</title>
</head>
<body>
	<%-- 
	<%=pageContext.getAttribute("name") %>
	<%=request.getAttribute("name") %>
	<%=session.getAttribute("name") %>
	--%>
	<%=application.getAttribute("name") %>
</body>
</html>
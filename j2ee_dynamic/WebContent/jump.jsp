<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
		<%response.sendRedirect("hello.jsp"); %> 
		<jsp:forward page="hello.jsp"></jsp:forward>
	--%>
	<%request.getRequestDispatcher("hello.jsp").forward(request, response); %>
</body>
</html>
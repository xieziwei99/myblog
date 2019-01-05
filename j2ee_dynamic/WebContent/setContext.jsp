<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SetContext Page</title>
</head>
<body>
	<%-- 
	<%
		request.setAttribute("name", "lingjiu");
	%>
	<jsp:forward page="getContext.jsp"></jsp:forward>
	
	<%
		session.setAttribute("name", "lingjiu");
		response.sendRedirect("getContext.jsp");
	%>
	--%>
	<%
		application.setAttribute("name", "lingjiu");
		out.println(application == request.getServletContext());
		response.sendRedirect("getContext.jsp");
	%>
</body>
</html>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello Page</title>
</head>
<body>
	<%
		List<String> words = new ArrayList<String>();
		words.add("today is");
		words.add("a great day");
	%>	
	<table style="width:200px">
		<%for (String word : words) {%>
			<tr>
				<td><%=word %></td>
			</tr>
		<%}%>
	</table>
	<%@include file="footer.jsp" %>
	<jsp:include page="footer.jsp">
		<jsp:param value="2017" name="year"/>
	</jsp:include>
</body>
</html>
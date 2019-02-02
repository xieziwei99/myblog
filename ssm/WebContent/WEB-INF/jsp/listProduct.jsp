<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Product Page</title>
</head>
<body>
    <table align='center' border='1' cellspacing='0'>
	    <tr>
	        <td>id</td>
	        <td>name</td>
	        <td>price</td>
	        <td>cid</td>
	        <td>version</td>
	    </tr>
	    <c:forEach items="${products}" var="p" varStatus="st">
	        <tr>
	            <td>${p.id}</td>
	            <td>${p.name}</td>
	            <td>${p.price}</td>
	            <td>${p.category.cname}</td>
	            <td>${p.version}</td>   
	        </tr>
	    </c:forEach>
    </table>
</body>
</html>
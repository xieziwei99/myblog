<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
	table.aa{
		table-layout: auto;
		border-style: solid;
		border-collapse
		align-content: center;
	}	
</style>

</head>
<body>
	<table class=aa border="1">
	    <tr >
	        <td>id</td>
	        <td>name</td>
	        <td>hp</td>
	        <td>damage</td>
	        <td>edit</td>
	        <td>delete</td>
	    </tr>
	    <c:forEach items="${heros}" var="hero" varStatus="st">
	        <tr >
	            <td>${hero.id}</td>
	            <td>${hero.name}</td>
	            <td>${hero.hp}</td>
	            <td>${hero.damage}</td>
	            <td><a href="editHero?id=${hero.id}">edit</a></td>
	            <td><a href="deleteHero?id=${hero.id}">delete</a></td>
	        </tr>
	    </c:forEach>
	    <tr>
	        <td colspan="6" align="center">
	        	<a href="?start=0">[首  页]</a>
	        	<a href="?start=${pre}">[上一页]</a>
	            <a href="?start=${next}">[下一页]</a>
	            <a href="?start=${last}">[末  页]</a>
	        </td>
    	</tr>
	</table>
</body>
</html>
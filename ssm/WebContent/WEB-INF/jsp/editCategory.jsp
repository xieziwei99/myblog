<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Category Page</title>
</head>
<body>
    <div style="width:500px;margin:0px auto;text-align:center">
        <div style="text-align:center;margin-top:40px">
            <form action="updateCategory" method="post">
                Category Name: <input type="text" name="name" value="${c.name}"><br><br>
                <input type="hidden" name="id" value="${c.id}">
                <input type="submit" value="Add a Category">
            </form>
        </div>
    </div>
</body>
</html>
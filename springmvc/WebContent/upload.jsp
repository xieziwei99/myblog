<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Upload Image Page</title>
</head>
<body>
    <form action="uploadImage" method="post" enctype="multipart/form-data">
        select a picture:<input type="file" name="image" accept="image/*"> <br>
        <input type="submit" value="Upload">
    </form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>上传图片</title>
</head>
<body>
<form action="testUpload" method="post" enctype="multipart/form-data">
    选择图片:<input type="file" name="image" accept="image/*" /> <br>
    <input type="submit" value="立刻上传">
</form>
</body>
</html>
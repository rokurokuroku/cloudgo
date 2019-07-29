<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>上传图片</title>
</head>
<body>
<form action="testUpload" class="layui-form" method="post" enctype="multipart/form-data">
    <div class="layui-form-item">
        <label class="layui-form-label">选择图片:</label>
        <input type="file" id="image" name="image" accept="image/*"  required  lay-verify="required"/> <br>
        <div class="layui-form-item">
            <div class="layui-input-block" style="float:right">
                <input type="submit" value="立刻上传">
            </div>
        </div>
    </div>
</form>
</body>
</html>
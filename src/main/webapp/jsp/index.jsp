<%@ page import="com.roku.cloudgo.service.UserServiceImpl" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device=width,initial-scale=1,maximum-scale=1,user-scalable=no">

    <script type="text/javascript" src="../bootstrapvalidator-master/vendor/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="../js/bootstrap.min.js"></script>
    <link rel="stylesheet"  href="../css/bootstrap.min.css">
<%--    <% if(session.getAttribute("userName")==null||session.getAttribute("userName")==""){--%>
<%--      response.sendRedirect("toLogin");--%>
<%--    }%>--%>
</head>
<body>
<div>
    <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container" style="position: fixed;top: 0px">
            <div class="navbar-header">
                <button class="navbar-toggle" data-toggle="collapse" data-target="#menu">
                    <span class="sr-only"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a href="#" class="navbar-brand">CloudGo</a>
            </div>
            <div id="menu" class="collapse navbar-collapse">
                <ul class="nav  nav-pills navbar-left">
                    <li class="nav-item">
                        <a class="nav-link" href="#"><span class="glyphicon glyphicon-question-sign"></span>帮助</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#"><span class="glyphicon glyphicon-hand-up"></span>建议</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#"><span class="glyphicon glyphicon-cloud"></span>关于我们</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#"><span class="glyphicon glyphicon-cloud"></span>个人中心</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <div class="row">
        <div class="col-lg-4 col-md-6 col-sm-12 text-center">
            <img id="addImg" class="rounded-circle" alt="160x120" style="width: 140px; height: 140px;" src="../images/jhk-1563632055566.jpg" data-holder-rendered="true">
            <h3><a href="#">该说点啥呢</a></h3>
            <p id="addP">地区和大气</p>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-4 col-md-6 col-sm-12 text-center">
            <img class="rounded-circle" alt="160x120" style="width: 140px; height: 140px;" src="../images/jhk-1563632055566.jpg" data-holder-rendered="true">
            <h3><a href="#">该说点啥呢</a></h3>
            <p>地区和大气</p>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-4 col-md-6 col-sm-12 text-center">
            <img class="rounded-circle" alt="160x120" style="width: 140px; height: 140px;" src="../images/jhk-1563632055566.jpg" data-holder-rendered="true">
            <h3><a href="#">该说点啥呢</a></h3>
            <p>地区和大气</p>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-4 col-md-6 col-sm-12 text-center">
            <img class="rounded-circle" alt="160x120" style="width: 140px; height: 140px;" src="../images/jhk-1563632055566.jpg" data-holder-rendered="true">
            <h3><a href="#">该说点啥呢</a></h3>
            <p>地区和大气</p>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-4 col-md-6 col-sm-12 text-center">
            <img class="rounded-circle" alt="160x120" style="width: 140px; height: 140px;" src="../images/jhk-1563632055566.jpg" data-holder-rendered="true">
            <h3><a href="#">该说点啥呢</a></h3>
            <p>地区和大气</p>
        </div>
    </div>

</div>
<div>
    <
</div>

<a id="add" class="btn btn-outline-success btn-sm" href="#">添加</a>
<script>
$(document).ready(function () {
    $("#add").click(function () {
        var t="<div class=\"row\">\n" +
            "        <div id=\"addDiv\" class=\"col-lg-4 col-md-6 col-sm-12 text-center\">\n" +
            "            <img id=\"addImg\" class=\"rounded-circle\" alt=\"160x120\" style=\"width: 140px; height: 140px;\" src=\"../images/jhk-1563632055566.jpg\" data-holder-rendered=\"true\">\n" +
            "            <h3><a href=\"#\">商品名称：${p.productName}</a></h3>\n" +
            "            <p id=\"addP\">商品价格：${p.productPrice}</p>\n" +
            "        </div>\n" +
            "    </div>";
        $("#addDiv").append(t);
    });
});
</script>
<script>

</script>
</body>
</html>
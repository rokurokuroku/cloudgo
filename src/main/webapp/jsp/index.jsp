<%@ page import="com.roku.cloudgo.service.UserServiceImpl" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device=width,initial-scale=1,maximum-scale=1,user-scalable=no">

    <script type="text/javascript" src="../bootstrapvalidator-master/vendor/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="../js/bootstrap.min.js"></script>
    <link rel="stylesheet"  href="../css/bootstrap.min.css">
</head>
<body>
<section>
<div class="container">
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
</div>
</section>
<p>为啥会重叠！！！</p>
<p>为啥会重叠！！！</p>
<p>为啥会重叠！！！</p>
<p>为啥会重叠！！！</p>
<section>
<div id="addDiv" class="row">
</div>
<div class="container">
    <a id="add" class="btn btn-outline-success btn-sm">刷新</a>
</div>
</section>


<section>
    <div class="container">
        <form action="">
            姓名：
        </form>
    </div>
</section>

<%--首页商品的刷新--%>
<script>
function loadProject() {
    $.ajax({
        url:'findProductData',
        type:'get',
        dataType:'json',
        success:function (productData) {
            var contentToRemove = document.querySelectorAll("#addElement");
            $(contentToRemove).remove();
            for(i in productData.data){
                var image=productData.data[i].productImage;
                var name=productData.data[i].productName;
                var price=productData.data[i].productPrice;
                var t= "        <div id=\"addElement\" class=\"col-lg-4 col-md-6 col-sm-12 text-center\">\n" +
                    "            <img class=\"rounded-circle\" alt=\"160x120\" style=\"width: 140px; height: 140px;\" src=\"../images/"+image+".jpg\" data-holder-rendered=\"true\">\n" +
                    "            <h4><a href=\"#\">商品名称："+name+"</a></h4>\n" +
                    "            <p>商品价格："+price+"</p>\n" +
                    "            <button href=\"toBuy\">购买</button>"+
                    "        </div>\n";
                $("#addDiv").append(t);
            }
        },
        error:function () {
            alert("读取商品信息失败！");
        }
    })
}

    $("#add").click(function () {
        loadProject();
    })

    $(document).ready(function () {
        loadProject();
    })
</script>

<%--用户数据的更改--%>
<script>

</script>

<%--用户订单的显示--%>
<script>

</script>

<%--商家添加商品--%>
<script>

</script>

<%--判断是否是商家，是则把购买功能删除--%>
<script>

</script>

<%--注销请求toLogout--%>

</body>
</html>
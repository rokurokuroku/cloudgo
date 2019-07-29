<%@ page import="com.roku.cloudgo.service.UserServiceImpl" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device=width,initial-scale=1,maximum-scale=1,user-scalable=no">
    <link rel="stylesheet"  href="../css/bootstrap.min.css">
    <link rel="stylesheet"  href="../css/signin.css">
    <link rel="stylesheet" href="../layui-v2.5.4/layui/css/layui.css">
    <script src="../js/jquery-2.1.1.min.js"></script>
    <script type="text/javascript" src="../js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../layui-v2.5.4/layui/layui.js"></script>
    <link rel="stylesheet" href="../layui-v2.5.4/layui/css/layui.css">
</head>
<body>
<!--导航栏-->
<div class="container" style="margin-top: auto">

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">CloudGo</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li class="active">
                        <a href="sellerIndex">首页<span class="sr-only">(current)</span></a>
                    </li>
                    <li>
                        <a href="seller">卖家中心</a>
                    </li>
                    <li>
                        <a href="#">关于我们</a>
                    </li>
                    <li>
                        <a href="#">帮助</a>
                    </li>
                    <li>
                        <a href="toLogout">注销</a>
                    </li>

                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">所有分类 <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="#">首页</a>
                            </li>
                            <li>
                                <a href="#">用户中心</a>
                            </li>
                            <li>
                                <a href="#">关于我们</a>
                            </li>
                            <li role="separator" class="divider"></li>
                            <li>
                                <a href="#">帮助</a>
                            </li>
                            <li role="separator" class="divider"></li>
                            <li>
                                <a href="#">消息</a>
                            </li>
                        </ul>
                    </li>
                </ul>

                <form class="navbar-form navbar-right">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Search">
                    </div>
                    <button type="submit" class="btn btn-default">搜索</button>
                </form>
            </div>
        </div>
    </nav>


    <!--轮播图-->
    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
        <!-- Indicators（指示器，可增加）-->
        <ol class="carousel-indicators">
            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
        </ol>

        <!-- Wrapper for slides（轮播展示，item表示一个图片）-->
        <div class="carousel-inner" role="listbox">
            <div class="item active">
                <img src="../images/rolling%20(1).jpg" alt="...">
                <div class="carousel-caption">
                    ...
                </div>
            </div>
            <div class="item">
                <img src="../images/rolling%20(2).jpg" alt="...">
                <div class="carousel-caption">
                    ...
                </div>
            </div>
            <div class="item">
                <img src="../images/rolling%20(1).jpg" alt="...">
                <div class="carousel-caption">
                    ...
                </div>
            </div>
        </div>

        <%--Controls（左右控制区，href用于确定点击触发的那个轮播图）--%>
        <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>


    <div class="container">
        <a id="add" class="btn btn-outline-success btn-sm">点我刷新商品数据</a>
    </div>

    <div id="addDiv" class="row">

    </div>



    <%--关于--%>
    <footer class="text-center">
        <div class="container">
            <div class="footer_logo text-center navbar clearfix">
                <i style="font-size: x-large;padding-bottom: 30px">
                    ——CloudGo——
                </i>
                <div class="footer-bottom navbar ">
                    <a href="#" style="padding-left: 30px">首页</a>
                    <a href="#" style="padding-left: 30px">订阅</a>
                    <a href="#" style="padding-left: 30px">建议</a>
                    <a href="#" style="padding-left: 30px">联系我们</a>
                </div>
                <div class="footer-bottom">
                    <a href="#" style="padding-left: 30px"><span class="layui-icon layui-icon-home" style="font-size: x-large"></span></a>
                    <a href="#" style="padding-left:30px"><span class="layui-icon layui-icon-user" style="font-size: x-large"></span></a>
                    <a href="#" style="padding-left: 30px"><span class="layui-icon layui-icon-login-wechat" style="font-size: x-large"></span></a>
                    <a href="#" style="padding-left: 30px"><span class="layui-icon layui-icon-login-qq" style="font-size: x-large"></span></a>
                    <a href="#" style="padding-left: 20px"><span class="layui-icon layui-icon-login-weibo" style="font-size: x-large"></span></a>
                </div>
            </div>
        </div>
    </footer>

    <%--首页商品的刷新--%>
    <script>
        function loadProject() {
            $.ajax({
                url:'findProductData?number=30',
                type:'get',
                dataType:'json',
                success:function (productData) {
                    var contentToRemove = document.querySelectorAll("#addElement");
                    $(contentToRemove).remove();
                    for(i in productData.data){
                        var productid=productData.data[i].productId;
                        var sellername=productData.data[i].sellerName;
                        var description=productData.data[i].productDescription;
                        var productremaining=productData.data[i].productRemaining;
                        var productsales=productData.data[i].productSales;
                        var image=productData.data[i].productImage;
                        var name=productData.data[i].productName;
                        var price=productData.data[i].productPrice;

                        var t="<div class=\"col-md-4\" id=\"addElement\">\n" +
                            "            <div class=\"responsive thumbnail\">\n" +
                            "                <img src=\"../images/10000.jpg\" alt=\"Forest\">\n" +
                            "                <div class=\"caption\">\n" +
                            "                    <h4>商品名称："+name+"</h4>\n" +
                            "                    <p>商品价格："+price+"</p>\n" +
                            "                </div>\n" +
                            "                <button class=\"btn btn-warning\"  role=\"button\" data-toggle=\"modal\" data-target=\"#productModal"+i+"\">购买</button>\n" +
                            "                <button class=\"btn btn-info\" role=\"button\" data-toggle=\"modal\" data-target=\"#productModal"+i+"\">查看商品详情</button>\n" +
                            "                <div class=\"modal fade\" id=\"productModal"+i+"\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n" +
                            "                    <div class=\"modal-dialog\">\n" +
                            "                        <div class=\"modal-content\">\n" +
                            "                            <div class=\"modal-header\">\n" +
                            "                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n" +
                            "                                <h4 class=\"modal-title\" id=\"myModalLabel\">商品详情</h4>\n" +
                            "                            </div>\n" +
                            "                            <div class=\"modal-body\">\n" +
                            "                                <p>商品名称："+name+"</p>\n" +
                            "                                <p>商品价格："+price+"</p>\n" +
                            "                                <p>商家姓名："+sellername+"</p>\n" +
                            "                                <p>商品剩余量："+productremaining+"</p>\n" +
                            "                                <p>商品已购买量："+productsales+"</p>\n" +
                            "                                <p>商品详情："+description+"</p>\n" +
                            "                            </div>\n" +
                            "                            <div class=\"modal-footer\">\n" +
                            "                                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\n" +
                            "                            </div>\n" +
                            "                        </div>\n" +
                            "                    </div>\n" +
                            "                </div>\n" +
                            "            </div>\n" +
                            "        </div>";
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
</div>


</body>
</html>
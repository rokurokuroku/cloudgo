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
    <link rel="stylesheet"href="../layui-v2.5.4/layui/css/layui.css">
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
                <a class="navbar-brand" href="#">首页</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li class="active">
                        <a href="#">首页<span class="sr-only">(current)</span></a>
                    </li>
                    <li>
                        <a href="#">用户中心</a>
                    </li>
                    <li>
                        <a href="#">关于我们</a>
                    </li>
                    <li>
                        <a href="#">帮助</a>
                    </li>
                    <li>
                        <a href="#">消息</a>
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
                <img src="../images/jhk-1563632055566.jpg" alt="...">
                <div class="carousel-caption">
                    ...
                </div>
            </div>
            <div class="item">
                <img src="../images/jhk-1563632055566.jpg" alt="...">
                <div class="carousel-caption">
                    ...
                </div>
            </div>
            <div class="item">
                <img src="../images/jhk-1563632055566.jpg" alt="...">
                <div class="carousel-caption">
                    ...
                </div>
            </div>
        </div>

        <!-- Controls（左右控制区，href用于确定点击触发的那个轮播图）-->
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
        <a id="add" class="btn btn-outline-success btn-sm">刷新</a>
    </div>

    <div id="addDiv" class="row">
    </div>



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
                        var image=productData.data[i].productImage;
                        var name=productData.data[i].productName;
                        var price=productData.data[i].productPrice;
                        var t= "        <div id=\"addElement\" class=\"col-lg-4 col-md-6 col-sm-12 text-center\">\n" +
                            "            <img class=\"rounded-circle\" alt=\"160x120\" style=\"width: 140px; height: 140px;\" src=\"../images/"+image+".jpg\" data-holder-rendered=\"true\">\n" +
                            "            <h4><a href=\"\">商品名称："+name+"</a></h4>\n" +
                            "            <p>商品价格："+price+"</p>\n" +
                            "            <button href=\"toBuy\">购买</button>"+
                            "        </div>\n";
                        var tt="<div class=\"col-md-4\">\n" +
                            "                        <div class=\"responsive thumbnail\">\n" +
                            "                            <a href=\"#\">\n" +
                            "                                <img src=\"../images/"+image+".jpg\" alt=\"Forest\">\n" +
                            "                            </a>\n" +
                            "                            <div class=\"caption\">\n" +
                            "                                <h4><a href=\"\">商品名称："+name+"</a></h4>\n" +
                            "                                <p>商品价格："+price+"</p>\n" +
                            "                                <p><a href=\"#\" class=\"btn btn-warning\"role=\"button\">购买</a> <a href=\"#\" class=\" btn btn-info\"role=\"button\">加入购物车</a> </p>\n" +
                            "                            </div>\n" +
                            "                        </div>\n" +
                            "                    </div>";
                        $("#addDiv").append(tt);
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
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
<div class="container">
    <a id="logout" class="btn btn-outline-success btn-sm">注销</a>
</div>
</section>


<section>
    <div class="container">
        <form action="saveUserInformation">
            <li>用户id:${u.userId}</li>
            <li>用户名：${u.userName}</li>
            <li>等级：${u.userLevel}</li>
            <li>邮箱：<input type="text" name="userName">${u.userEmail}</li>
            <li>电话：<input type="text" name="userTelephone">${u.userTelephone}</li>
            <li>性别：<input type="radio" name="userGender" value="0">男<input type="radio" name="userGender" value="1">女</li>
            <li>地址：<input type="text" name="address">${u.adress}</li>
            <li>描述：<textarea rows="5" name="userDescription">${u.userDescription}${u.userDescription}</textarea></li>

            <button type="submit">保存信息</button>
        </form>
    </div>
</section>

<section>
    <div id="finOrder" class="row">

    </div>

</section>

<%--<h2>创建模态框（Modal）</h2>--%>
<%--<!-- 按钮触发模态框 -->--%>
<%--<button id="addOrder" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">开始演示模态框</button>--%>
<%--<!-- 模态框（Modal） -->--%>
<%--<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">--%>
<%--    <div class="modal-dialog">--%>
<%--        <div class="modal-content">--%>
<%--            <div class="modal-header">--%>
<%--                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>--%>
<%--                <h4 class="modal-title" id="myModalLabel">商品信息</h4>--%>
<%--            </div>--%>

<%--            <div class="modal-body">--%>
<%--                <img class="rounded-circle" alt="160x120" style="width: 140px; height: 140px;" src="'../images/'+${productData.data[i].productImage}+'.jpg'" data-holder-rendered="true">--%>
<%--                商品名称：${productData.data[i].productName}--%>
<%--                商品价格：${productData.data[i].productPrice}--%>
<%--                卖方：${productData.data[i].sellerName}--%>
<%--                商品描述：${productData.data[i].productDescription}--%>
<%--                商品存货：${productData.data[i].productRemaining}--%>
<%--                已售数量：${productData.data[i].productSales}--%>
<%--            </div>--%>

<%--            <div class="modal-footer">--%>
<%--                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>--%>
<%--                <button href="toBuy" type="button" class="btn btn-primary" href="toBuy">购买</button>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>


<%--首页商品的刷新--%>
<script>
function loadProject() {
    $.ajax({
        url:'findProductData',
        type:'get',
        data:30,
        dataType:'json',
        success:function (productData) {
            var contentToRemove = document.querySelectorAll("#addElement");
            $(contentToRemove).remove();
            for(i in productData.data){
                var image=productData.data[i].productImage;
                var name=productData.data[i].productName;
                var price=productData.data[i].productPrice;
                var sellername=productData.data[i].sellerName;
                var description=productData.data[i].productDescription;
                var remaining=productData.data[i].productRemaining;
                var sales=productData.data[i].productSales;
                var t= "        <div id=\"addElement\" class=\"col-lg-4 col-md-6 col-sm-12 text-center\">\n" +
                    "            <img class=\"rounded-circle\" alt=\"160x120\" style=\"width: 140px; height: 140px;\" src=\"../images/"+image+".jpg\" data-holder-rendered=\"true\">\n" +
                    "            <h4><a id=\"detailProduct\">商品名称："+name+"</a></h4>\n" +
                    "            <p>商品价格："+price+"</p>\n" +
                    "            <button href=\"toBuy\">购买</button>"+
                    "        </div>\n";
                var td="<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n" +
                    "    <div class=\"modal-dialog\">\n" +
                    "        <div class=\"modal-content\">\n" +
                    "            <div class=\"modal-header\">\n" +
                    "                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n" +
                    "                <h4 class=\"modal-title\" id=\"myModalLabel\">商品信息</h4>\n" +
                    "            </div>\n" +
                    "\n" +
                    "            <div class=\"modal-body\">\n" +
                    "                <img class=\"rounded-circle\" alt=\"160x120\" style=\"width: 140px; height: 140px;\" src=\"'../images/'+${productData.data[i].productImage}+'.jpg'\" data-holder-rendered=\"true\">\n" +
                    "                商品名称："+image+"\n"+
                    "                商品价格："+price+"\n"+
                    "                卖方："+sellername+"\n"+
                    "                商品描述："+description+"\n"+
                    "                商品存货："+remaining+"\n"+
                    "                已售数量："+sales+"\n"+
                    "            </div>\n" +
                    "\n" +
                    "            <div class=\"modal-footer\">\n" +
                    "                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\n" +
                    "                <button href=\"toBuy\" type=\"button\" class=\"btn btn-primary\" href=\"toBuy\">购买</button>\n" +
                    "            </div>\n" +
                    "        </div>\n" +
                    "    </div>\n" +
                    "</div>";
                $("#addDiv").append(t);
            }
        },
        error:function () {
            alert("读取商品信息失败！");
        }
    })
}

function showDetailProduct(){
    $.ajax({
        success:function (productData) {

        },
        error:function () {
            alert("读取商品信息失败！");
        }
    })
}

    $("#detailProduct").click(function () {
        showDetailProduct();
    })

    $("#add").click(function () {
        loadProject();
    })

    $(document).ready(function () {
        loadProject();
    })
</script>

<%--注销--%>
<script>
    function userLogout(){
        $.post("toLogout",function (data) {
            alert("成功退出！");
        })
    }
    $("#logout").click(function () {
        userLogout();
    })
</script>

<%--用户数据的更改--%>
<script>
</script>

<%--用户订单的显示--%>
<script>
    function loadOrder(){
        $.ajax({
            url:'findOrderData',
            type:'get',
            data:30,
            dataType:'json',
            success:function (orderData) {
                var contentToRemove = document.querySelectorAll("#addOrderElement");
                $(contentToRemove).remove();
                for(i in orderData.data){

                }
            }
        })
    }

    $("#addOrder").click(function () {
        loadOrder();
    })

    $(document).ready(function () {
        loadOrder();
    })
</script>

<%--商家添加商品--%>
<script>

</script>

<%--判断是否是商家，是则把购买功能删除--%>
<script>

</script>

</body>
</html>
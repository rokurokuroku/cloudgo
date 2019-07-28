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
<%--<div class="container">--%>
<%--    <nav class="navbar navbar-inverse navbar-fixed-top">--%>
<%--        <div class="container" style="position: fixed;top: 0px">--%>
<%--            <div class="navbar-header">--%>
<%--                <button class="navbar-toggle" data-toggle="collapse" data-target="#menu">--%>
<%--                    <span class="sr-only"></span>--%>
<%--                    <span class="icon-bar"></span>--%>
<%--                    <span class="icon-bar"></span>--%>
<%--                    <span class="icon-bar"></span>--%>
<%--                </button>--%>
<%--                <a href="#" class="navbar-brand">CloudGo</a>--%>
<%--            </div>--%>
<%--            <div id="menu" class="collapse navbar-collapse">--%>
<%--                <ul class="nav  nav-pills navbar-left">--%>
<%--                    <li class="nav-item">--%>
<%--                        <a class="nav-link" href="#"><span class="glyphicon glyphicon-question-sign"></span>帮助</a>--%>
<%--                    </li>--%>
<%--                    <li class="nav-item">--%>
<%--                        <a class="nav-link" href="#"><span class="glyphicon glyphicon-hand-up"></span>建议</a>--%>
<%--                    </li>--%>
<%--                    <li class="nav-item">--%>
<%--                        <a class="nav-link disabled" href="#"><span class="glyphicon glyphicon-cloud"></span>关于我们</a>--%>
<%--                    </li>--%>
<%--                    <li class="nav-item">--%>
<%--                        <a class="nav-link disabled" href="#"><span class="glyphicon glyphicon-cloud"></span>个人中心</a>--%>
<%--                    </li>--%>
<%--                </ul>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </nav>--%>
<%--</div>--%>
<%--</section>--%>
<%--<p>为啥会重叠！！！</p>--%>
<%--<p>为啥会重叠！！！</p>--%>
<%--<p>为啥会重叠！！！</p>--%>
<%--<p>为啥会重叠！！！</p>--%>

<section>

<div id="addDiv" class="row">
</div>
<div>
    <table class="table table-hover">
        <thead><tr>
            <th>商品名称</th>
            <th>卖家</th>
            <th>商品剩余数量</th>
            <th>商品交易时间</th>
            <th>配送地址</th>
            <th>交易数量</th>
        </tr></thead>
        <tbody id="findOrder">

        </tbody>
    </table>
</div>

<div class="container">
    <a id="add" class="btn btn-outline-success btn-sm">刷新</a>
</div>
<div class="container">
    <a id="addOrder" class="btn btn-outline-success btn-sm">订单</a>
</div>
<div class="container">
    <a class="btn btn-outline-success btn-sm" href="toLogout">注销</a>
</div>

</section>

<%--保存用户数据--%>
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
            <li>描述：<textarea rows="5" name="userDescription">${u.userDescription}</textarea></li>
            <button type="submit">保存信息</button>
        </form>
    </div>
</section>





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

<%--用户订单的显示--%>
<script>
    function loadOrder(){
        $.ajax({
            url:'../json/orderData.json',
            type:'get',
            dataType:'json',
            success:function (orderData) {
                var contentToRemove = document.querySelectorAll("#addOrderElement");
                $(contentToRemove).remove();
                for(i in orderData.data){
                    var productname=orderData.data[i].productName;
                    var sellername=orderData.data[i].sellerName;
                    var productnumbers=orderData.data[i].productNumbers;
                    var tradinghour=orderData.data[i].tradingHour;
                    var buyershippingaddress=orderData.data[i].buyerShippingAddress;
                    var transactionAmount=orderData.data[i].transactionAmount;
                    var t= "          <td>"+productname+"</td>"+
                        "          <td>"+sellername+"</td>"+
                        "          <td>"+productnumbers+"</td>"+
                        "          <td>"+tradinghour+"</td>"+
                        "          <td>"+buyershippingaddress+"</td>"+
                        "          <td>"+transactionAmount+"</td>";
                    $("#findOrder").append("<tr id=\"addOrderElement\">"+t+"</tr>");
                }
            },
            error:function () {
                alert("读取订单失败！");
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
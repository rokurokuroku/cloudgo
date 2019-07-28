<%@ page import="com.roku.cloudgo.service.UserServiceImpl" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device=width,initial-scale=1,maximum-scale=1,user-scalable=no">
    <script src="../js/jquery-2.1.1.min.js"></script>
    <script type="text/javascript" src="../js/bootstrap.min.js"></script>
    <link rel="stylesheet"  href="../css/bootstrap.min.css">
    <script type="text/javascript" src="../layui-v2.5.4/layui/layui.js"></script>
    <link rel="stylesheet" href="../layui-v2.5.4/layui/css/layui.css" media="all">
<%--    <link rel="stylesheet" href="../css/order.css">--%>

</head>
<body style="background-image: url(../images/login.jpg);background-size: cover;height: 100vh;">

<!--导航-->
<div class="fonts">
    <ul class="layui-nav" lay-filter="" style="font-size: x-large">
        <li class="layui-nav-item"> <a href="index">CloudGo</a></li>
        <li class="layui-nav-item"><a href="index">首页</a></li>
        <li class="layui-nav-item layui-this"><a href="user">个人中心</a></li>
        <li class="layui-nav-item"><a href="">建议</a></li>
        <li class="layui-nav-item"><a href="">帮助</a></li>
    </ul>
</div>

<div class="container-fluid fonts">
    <!--左侧个人信息-->
    <div class="row col-xs-2 col-md-2" style="height: 100vh;background-color: #4a4f5b;opacity: 0.55;position: relative"></div>
    <div class="col-xs-2 col-md-2 center-block" style="position: absolute">
        <img src="../images/img.jpg" alt="80x60" class="img-circle img-responsive center-block">
        <table id="table1" class="table-responsive border-collapse" >
            <thead>
            <tr>
                <th></th>
                <th></th>
            </tr>
            </thead>
            <tbody id="findUserInform">
            <tr>
                <td>用户ID：</td>
                <td>读取失败</td>
            </tr>
            <tr>
                <td>用户等级：</td>
                <td>读取失败</td>
            </tr>
            <tr>
                <td>用户名：</td>
                <td>读取失败</td>
            </tr>
            <tr>
                <td>用户余额：</td>
                <td>读取失败</td>
            </tr>
            <tr>
                <td>用户积分：</td>
                <td>读取失败</td>
            </tr>
            </tbody>
        </table>
    </div>

    <!--右侧内容-->
    <div class="row fonts">
        <div class="col-xs-10 col-md-9">
            <div class="layui-tab">
                <ul class="layui-tab-title">
                    <li class="layui-this">信息查询</li>
                    <li>个人订单</li>
                </ul>
                <!--标签页内容-->
                <div class="layui-tab-content">
                    <!--信息查询-->
                    <div class="layui-tab-item layui-show">
                        <form class="layui-form" action="">
                            <!--用户名-->
                            <div class="layui-form-item">
                                <label class="layui-form-label">用户名</label>
                                <div class="layui-input-inline font">
                                    <input type="text" name="userName" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <!--电话-->
                            <div class="layui-form-item">
                                <label class="layui-form-label">电话</label>
                                <div class="layui-input-inline font">
                                    <input type="text" name="userTelephone" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <!--邮箱-->
                            <div class="layui-form-item">
                                <label class="layui-form-label">邮箱</label>
                                <div class="layui-input-inline font">
                                    <input type="text" name="userEmail" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <!--密码-->
                            <div class="layui-form-item">
                                <label class="layui-form-label">密码</label>
                                <div class="layui-input-inline font">
                                    <input type="password" name="userPassword" required lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">性别</label>
                                <div class="layui-input-inline">
                                    <input type="radio" name="userGender" value="男" title="男">
                                    <input type="radio" name="userGender" value="女" title="女" checked>
                                </div>
                            </div>
                            <!--收货地址-->
                            <div class="layui-form-item">
                                <label class="layui-form-label">收货地址</label>
                                <div class="layui-input-inline font">
                                    <select name="quiz1">
                                        <option value="无">请选择省</option>
                                        <option value="四川省" selected="">四川省</option>
                                        <option value="山东省">山东省</option>
                                        <option value="浙江省">浙江省</option>
                                        <option value="上海市">上海市</option>
                                    </select>
                                </div>
                                <div class="layui-input-inline font">
                                    <select name="quiz2">
                                        <option value="无">请选择市</option>
                                        <option value="成都">成都</option>
                                        <option value="自贡">自贡</option>
                                        <option value="攀枝花">攀枝花</option>
                                        <option value="泸州">泸州</option>
                                        <option value="德阳">德阳</option>
                                        <option value="绵阳">绵阳</option>
                                        <option value="广元">广元</option>
                                    </select>
                                </div>
                                <div class="layui-input-inline font">
                                    <select name="quiz3">
                                        <option value="无">请选择县/区</option>
                                        <option value="成华区">成华区</option>
                                        <option value="武侯区">武侯区</option>
                                        <option value="青羊区">青羊区</option>
                                        <option value="锦江区">锦江区</option>
                                    </select>
                                </div>
                            </div>
                            <!--个人描述-->
                            <div class="layui-form-item layui-form-text">
                                <label class="layui-form-label">个人描述</label>
                                <div class="layui-input-block font">
                                    <textarea placeholder="请输入内容" class="layui-textarea"></textarea>
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <div class="layui-input-block"style="float:right">
                                    <button class="layui-btn" lay-submit="" lay-filter="demo1" type="submit">保存</button>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="layui-tab-item">
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
                </div>
            </div>
        </div>
    </div>
</div>

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
    // $("#addOrder").click(function () {
    //     loadOrder();
    // })
    $(document).ready(function () {
        loadOrder();
    })
</script>

<%--用户信息的显示--%>
<script>
    function loadUserInform(){
        $.ajax({
            url:'../json/userInform.json',
            type:'get',
            dataType:'json',
            success:function (userData) {
                // var contentToRemove = document.querySelectorAll("#findUserInform");
                // $(contentToRemove).remove();
                var userid=userData.data.userId;
                var userlevel=userData.data.userLevel;
                var username=userData.data.userName;
                var userbalance=userData.data.Balance;
                var userscore=userData.data.userScore;
                var usertelephone=userData.data.userTelephone;
                var useremai=userData.data.userEmail;
                var usergender=userData.data.userGender;
                var shippingaddress=userData.data.shippingAddress;
                var userdescription=userData.data.userDescription;
                var t= "<tr>\n" +
                    "                <td>用户ID：</td>\n" +
                    "                <td>"+userid+"</td>\n" +
                    "            </tr>\n" +
                    "            <tr>\n" +
                    "                <td>用户等级：</td>\n" +
                    "                <td>"+userlevel+"</td>\n" +
                    "            </tr>\n" +
                    "            <tr>\n" +
                    "                <td>用户名：</td>\n" +
                    "                <td>"+username+"</td>\n" +
                    "            </tr>\n" +
                    "            <tr>\n" +
                    "                <td>用户余额：</td>\n" +
                    "                <td>"+userbalance+"</td>\n" +
                    "            </tr>\n" +
                    "            <tr>\n" +
                    "                <td>用户积分：</td>\n" +
                    "                <td>"+userscore+"</td>\n" +
                    "            </tr>";
                $("#findUserInform").append("<tbody id=\"findUserInform\">"+t+"</tbody>");
            },
            error:function () {
                alert("读取用户信息失败！");
            }
        })
    }
    $(document).ready(function () {
        loadUserInform();
    })
</script>

<script>
    layui.use('form', function(){
        var form = layui.form;

        //监听提交
        form.on('submit(formDemo)', function(data){
            layer.msg(JSON.stringify(data.field));
            return false;
        });
    });
    layui.use(['layer', 'form'], function() {
        var layer = layui.layer
            , form = layui.form;
    });

    layui.use('element', function(){
        var element = layui.element;
    });
</script>
</body>
</html>
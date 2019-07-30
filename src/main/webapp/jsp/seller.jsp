<%@ page import="com.roku.cloudgo.service.SellerServiceImpl" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device=width,initial-scale=1,maximum-scale=1,user-scalable=no">
    <script src="../js/jquery-2.1.1.min.js"></script>
    <script type="text/javascript" src="../js/bootstrap.min.js"></script>
    <link rel="stylesheet"  href="../css/bootstrap.min.css">
    <script type="text/javascript" src="../layui-v2.5.4/layui/layui.js"></script>
    <script src="../js/jquery.form.js"></script>
    <link rel="stylesheet" href="../layui-v2.5.4/layui/css/layui.css" media="all">

</head>
<body style="background-color:#ECEFF1;height: 100vh;">
<!--导航-->

<div class="fonts">
    <ul class="layui-nav" lay-filter="" style="font-size: x-large;background-color:#393D49;">
        <li class="layui-nav-item"> <a href="sellerIndex">CloudGo</a></li>
        <li class="layui-nav-item"><a href="sellerIndex">首页</a></li>
        <li class="layui-nav-item layui-this"><a href="seller">卖家中心</a></li>
        <li class="layui-nav-item"><a href="">建议</a></li>
        <li class="layui-nav-item"><a href="">帮助</a></li>
    </ul>
</div>

<div class="container-fluid fonts">
    <!--左侧个人信息-->
    <%--    <div class="row col-xs-2 col-md-2" style="height: 100vh;background-color: #4a4f5b;opacity: 0.55;position: relative"></div>--%>
    <div class="row col-xs-2 col-md-2" style="height: 100vh;background-color: #090D09;opacity: 0.55;position: relative"></div>
    <div class="col-xs-2 col-md-2 center-block" style="position: absolute">
<%--        <img src="../images/10000.jpg" alt="80x60" class="img-circle img-responsive center-block">--%>
        <table id="table1" class="table-responsive border-collapse" style="color:#ECEFF1;">
            <thead>
            <tr>
                <th></th>
                <th></th>
            </tr>
            </thead>
            <tbody id="findSellerInform">
            <tr>
                <td>店家ID：</td>
                <td>读取失败</td>
            </tr>
            <tr>
                <td>店家等级：</td>
                <td>读取失败</td>
            </tr>
            <tr>
                <td>店名：</td>
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
                    <li>已售订单</li>
                    <li>添加商品</li>
                    <li>卖家商品信息</li>
                </ul>
                <!--标签页内容-->
                <div class="layui-tab-content">
                    <!--信息查询-->
                    <div class="layui-tab-item layui-show">
                        <form class="layui-form" action="toSellerChange">
                            <!--电话-->
                            <div class="layui-form-item">
                                <label class="layui-form-label">电话</label>
                                <div class="layui-input-inline font">
                                    <input id="addSTele" type="text" name="sellerTelephone" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <!--邮箱-->
                            <div class="layui-form-item">
                                <label class="layui-form-label">邮箱</label>
                                <div class="layui-input-inline font">
                                    <input id="addSEmail" type="text" name="sellerEmail" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">性别</label>
                                <div class="layui-input-inline">
                                    <input id="Smale" type="radio" name="sellerGender" value="0" title="男">
                                    <input id="Sfemale" type="radio" name="sellerGender" value="1" title="女">
                                </div>
                            </div>
                            <!--个人描述-->
                            <div class="layui-form-item layui-form-text">
                                <label class="layui-form-label">简介</label>
                                <div class="layui-input-block font">
                                    <textarea name="descriptions" id="addSDes" placeholder="请输入内容" class="layui-textarea"></textarea>
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <div class="layui-input-block" style="float:right">
                                    <button id="saveSData" class="layui-btn" lay-submit="" lay-filter="demo1" type="submit">保存</button>
                                </div>
                            </div>
                        </form>

                        <div class="layui-input-block" style="float:right">
                            <a class="layui-btn" id="flushSData" href="seller">刷新数据</a>
                        </div>
                    </div>

                    <div class="layui-tab-item">
                        <table class="table table-hover">
                            <thead><tr>
                                <th>商品名称</th>
                                <th>买家</th>
                                <th>商品交易数量</th>
                                <th>商品交易时间</th>
                                <th>配送地址</th>
                                <th>交易金额</th>
                            </tr></thead>
                            <tbody id="findSOrder">

                            </tbody>
                        </table>
                    </div>

                    <div class="layui-tab-item">
<%--                        <form class="layui-form" action="addProduct" method="post" enctype="multipart/form-data">--%>

                        <form class="layui-form">
                            <div class="layui-form-item">
                                <label class="layui-form-label">商品名称</label>
                                <div class="layui-input-inline font">
                                    <input id="addPName" type="text" name="productName" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">商品定价</label>
                                <div class="layui-input-inline font">
                                    <input id="addPPrice" type="text" name="productPrice" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">商品数量</label>
                                <div class="layui-input-inline font">
                                    <input id="addPRemaining" type="text" name="productRemaining" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">商品主分类</label>
                                <div class="layui-input-inline font" id="Class1">
                                    <select name="mainClass" id="mainClass" lay-filter="mainClass">
                                    </select>
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">商品子类</label>
                                <div class="layui-input-inline font" id="Class2" >
                                    <select name="subClass" id="subClass" lay-filter="subClass">
                                    </select>
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">商品描述</label>
                                <div class="layui-input-block font">
                                    <textarea id="addPDescription" name="productDescription" required placeholder="请输入内容" class="layui-textarea"></textarea>
                                </div>
                            </div>

                            <div class="layui-form-item">
                                <label class="layui-form-label">选择图片:</label>
                                <input type="file" id="image" name="image" /> <br>
                            </div>
                            <div class="layui-form-item">
                                <div class="layui-input-block" style="float:right">
                                    <button id="savePData" class="layui-btn" lay-submit="" lay-filter="demo1" type="button">上架</button>
                                </div>
                            </div>
                        </form>
                    </div>

                    <div class="layui-tab-item">
                        <table class="table table-hover">
                            <thead><tr>
                                <th>商品名称</th>
                                <th>商品价格</th>
                                <th>商品剩余量</th>
                                <th>商品已购买量</th>
                                <th>商品详情</th>
                            </tr></thead>
                            <tbody id="findSProduct">

                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<%--卖家订单的显示--%>
<script>
    function loadSOrder(){
        $.ajax({
            url:'showSellerOrders',
            type:'get',
            dataType:'json',
            success:function (orderData) {
                var contentToRemove = document.querySelectorAll("#addSOrderElement");
                $(contentToRemove).remove();
                for(i in orderData.data){
                    var productname=orderData.data[i].productName;
                    var username=orderData.data[i].buyerName;
                    var productnumbers=orderData.data[i].productNumbers;
                    var tradinghour=orderData.data[i].tradingHour;
                    var buyershippingaddress=orderData.data[i].shippingAddress;
                    var transactionAmount=orderData.data[i].transactionAmount;
                    var t= "          <td>"+productname+"</td>"+
                        "          <td>"+username+"</td>"+
                        "          <td>"+productnumbers+"</td>"+
                        "          <td>"+tradinghour+"</td>"+
                        "          <td>"+buyershippingaddress+"</td>"+
                        "          <td>"+transactionAmount+"</td>";
                    $("#findSOrder").append("<tr id=\"addSOrderElement\">"+t+"</tr>");
                }
            },
            error:function () {
                alert("读取订单失败！");
            }
        })
    }
    $(document).ready(function () {
        loadSOrder();
    })
    $("#flushSData").click(function () {
        loadSOrder();
    })
</script>

<script>
    function warningGender() {
        var thisGenderRadio=$('input:radio[name="sellerGender"]:checked').val();
        if(null==thisGenderRadio){
            alert("请设置性别！");
            return false;
        }
    }
    $("#saveSData").click(function () {
        warningGender();
    })
</script>

<%--卖家信息的显示--%>
<script>
    function checkRadio(mValue) {
        var genderRadio = document.getElementsByName("sellerGender");
        for(var i=0;i<genderRadio.length;i++){
            if(mValue==genderRadio[i].value){
                genderRadio[i].checked=true;
            }else{
                genderRadio[i].checked=false;
            }
        }
    }
    function loadSellerInform(){
        $.ajax({
            url:'toShowSellerInfo',
            type:'get',
            dataType:'json',
            success:function (sellerData) {
                var contentToRemove = document.querySelectorAll("#findSellerInform");
                $(contentToRemove).remove();
                var sellerid=sellerData.sellerId;
                var sellerlevel=sellerData.sellerLevel;
                var sellername=sellerData.sellerName;
                var sellertelephone=sellerData.sellerTelephone;
                var selleremail=sellerData.sellerEmail;
                var sellergender=sellerData.sellerGender;
                var sellerdescription=sellerData.sellerDescription;
                var t= "<tr>\n" +
                    "                <td>用户ID：</td>\n" +
                    "                <td>"+sellerid+"</td>\n" +
                    "            </tr>\n" +
                    "            <tr>\n" +
                    "                <td>用户等级：</td>\n" +
                    "                <td>"+sellerlevel+"</td>\n" +
                    "            </tr>\n" +
                    "            <tr>\n" +
                    "                <td>用户名：</td>\n" +
                    "                <td>"+sellername+"</td>\n" +
                    "            </tr>";
                $("#table1").append("<tbody id=\"findSellerInform\">"+t+"</tbody>");
                $("#addSTele").val(sellertelephone);
                $("#addSEmail").val(selleremail);
                checkRadio(sellergender);
                $("#addSDes").val(sellerdescription);
            },
            error:function () {
                alert("读取卖家信息失败！");
            }
        })
    }
    $(document).ready(function () {
        loadSellerInform();
    })
    $("#flushSData").click(function () {
        loadSellerInform();
    })
</script>

<%--laiyu FORM--%>
<script>
    layui.use('form', function(){
        var form = layui.form;
        //监听提交
        form.on('submit(formDemo)', function(data){
            layer.msg(JSON.stringify(data.field));
            return false;
        });
        
        var $=layui.jquery;
        
        $.get("../json/subClass.json",function (data) {
            var a;
            for(var i=0;i<data.length;i++){
                a=data[i].mainClass;
                $("#mainClass").append("<option>"+a+"</option>\n");
            }
            form.render('select');
        })
        
        form.on('select(mainClass)',function (data) {
            $("select[name=subClass]").empty();
            form.render('select');
            var b;
            $.get("../json/subClass.json",function (d) {
                for(var j=0;j<d.length;j++){
                    if(d[j].mainClass==data.value){
                        for(var k=0;k<d[j].subClass.length;k++){
                            b=d[j].subClass;
                            $("select[name=subClass]").append("<option>"+b[k].name+"</option>\n");
                        }
                        break;
                    }
                }
                form.render('select');
            })
        })
    });


    layui.use(['layer', 'form'], function() {
        var layer = layui.layer
            , form = layui.form;
    });

    layui.use('element', function(){
        var element = layui.element;
    });

</script>

<%--ajax表单提交--%>
<script>
    function submitPro(){
        var productName=$("#addPName").val();
        var productPrice=$("#addPPrice").val();
        var productRemaining=$("#addPRemaining").val();
        var mainClass=$("#mainClass").val();
        var subClass=$("#subClass").val();
        var productDescription=$("#addPDescription").val();
        var imgFile = document.getElementById('image').files[0];
        console.log(imgFile);
        // if(typeof(imgFile)=="undefined"){
        //     toastr.error("请选择需要导入的搜索词文件。");
        //     return;
        // }

        var formData=new FormData();
        formData.append("productName",productName);
        formData.append("productPrice",productPrice);
        formData.append("productRemaining",productRemaining);
        formData.append("mainClass",mainClass);
        formData.append("subClass",subClass);
        formData.append("productDescription",productDescription);
        formData.append("image",imgFile);

        $.ajax({
            url:"addProduct",
            data:formData,
            type:"post",
            processData: false,
            contentType: false,
            success:function (result) {
                if(true==result){
                    alert("添加成功!请返回页面重新刷新。");
                }else{
                    alert("添加失败!失败的原因有以下几种:1.错误访问，2.系统繁忙，3.填入信息错误。");
                }
            },
            error:function () {
                alert("添加失败！");
            }
        })
    }
    $("#savePData").click(function () {
        submitPro();
    })
</script>

<%--卖家商品展示--%>
<script>
    function loadSProduct(){
        $.ajax({
            url:'findSellerProducts',
            type:'get',
            dataType:'json',
            success:function (proData) {
                var contentToRemove = document.querySelectorAll("#addSProElement");
                $(contentToRemove).remove();
                for(i in proData.data){
                    var product_name=proData.data[i].productName;
                    var product_price=proData.data[i].productPrice;
                    var product_remaining=proData.data[i].productRemaining;
                    var product_sales=proData.data[i].productSales;
                    var product_description=proData.data[i].productDescription;
                    var t= "          <td>"+product_name+"</td>"+
                        "          <td>"+product_price+"</td>"+
                        "          <td>"+product_remaining+"</td>"+
                        "          <td>"+product_sales+"</td>"+
                        "          <td>"+product_description+"</td>";
                    $("#findSProduct").append("<tr id=\"addSProElement\">"+t+"</tr>");
                }
            },
            error:function () {
                alert("读取商品失败！");
            }
        })
    }
    $(document).ready(function () {
        loadSProduct();
    })
    $("#flushSData").click(function () {
        loadSProduct();
    })
</script>

</body>
</html>
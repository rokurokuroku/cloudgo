<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device=width,initial-scale=1,maximum-scale=1,user-scalable=no">

    <script type="text/javascript" src="../bootstrapvalidator-master/vendor/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="../js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../bootstrapvalidator-master/vendor/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../bootstrapvalidator-master/dist/js/bootstrapValidator.js"></script>
    <script type="text/javascript" src="../js/npm.js"></script>
    <script type="text/javascript" src="../js/verify.js"></script>


    <link rel="stylesheet"  href="../css/bootstrap.min.css">
    <link rel="stylesheet"  href="../css/signin.css">
    <link rel="stylesheet" href="../bootstrapvalidator-master/vendor/bootstrap/css/bootstrap.css">
    <link rel="stylesheet"href="../bootstrapvalidator-master/dist/css/bootstrapValidator.min.css">
</head>
<body>
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

            </ul>

            <div class=" navbar-right">
                <nav class="nav-pills navbar-right" style="top: 0px">
                    <ul class=" nav nav-pills" role="tablist">
                        <li role="presentation" class="active"><a href="#login" aria-controls="login" role="tab" data-toggle="tab">登录</a></li>
                        <li role="presentation"><a href="#register" aria-controls="register" role="tab" data-toggle="tab">注册</a></li>
                    </ul>
                </nav>
            </div>
        </div>
    </div>
</nav>

<div class="container text-center" style="margin: auto;height:640px;background:url(../images/loginbg.jpg);width: 100%;background-size: cover">

    <!-- Nav tabs -->


    <!-- 登录 -->
    <div class="tab-content">
        <div role="tabpanel" class="tab-pane active " id="login" style="position: center">
            <form  id="defaultForm1" method="post" class="form-signin form-horizontal " style="transform: translate(10%,20%);" action="toSellerLogin">

                <h1 class="mb-4 font-weight-normal">店家登录界面</h1>

                <label for="sellerName" class="sr-only">商店名</label>
                <div class="input-group form-group">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-user" aria-hidden="true" style="font-size: large;" style="float:left"></span></span>
                    <input name="sellerName" type="text" id="sellerName" class=" form-control" placeholder="请输入商店名" maxlength="20" required autofocus>
                </div>

                <label for="sellerPassword" class="sr-only">密码</label>
                <div class="input-group form-group">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-lock" aria-hidden="true" style="font-size: large;"></span></span>
                    <input name="sellerPassword" id="sellerPassword"  type="password" class=" form-control" placeholder="请输入密码" maxlength="20" required autofocus>
                </div>
                <div class="checkbox mb-3" style="float: left">
                    <label>
                        <input type="checkbox" value="seller-remember-me"> 记住我
                    </label>
                </div>
                <div class="container right"></div><button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
                <label>
                    <a class="btn btn-outline-success btn-sm" href="login">前往用户登录界面</a>
                </label>
            </form>
        </div>

        <!--注册--->
        <div role="tabpanel" class="tab-pane" id="register">
            <form  id="defaultForm" method="post" class="form-signin form-horizontal" style="transform: translate(10%,4%);" action="toSellerRegister">
                <h1 class="mb-4 font-weight-normal">店家注册界面</h1>

                <label for="inputSellerName" class="sr-only">商店名</label>
                <div class="input-group form-group">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-user" aria-hidden="true" style="font-size: large;" style="float:left"></span></span>
                    <input name="sellerName" type="text" id="inputSellerName"  class=" form-control" placeholder="请输入商店名" maxlength="20" required autofocus>
                </div>

                <label for="inputSellerEmail" class="sr-only">邮箱</label>
                <div class="input-group form-group">
                    <span class="input-group-addon" ><span class="glyphicon glyphicon-envelope" aria-hidden="true" style="font-size:large"></span></span>
                    <input  name="sellerEmail" type="email" id="inputSellerEmail" class=" form-control" placeholder="请输入你的邮箱" required autofocus>
                </div>

                <label for="inputSellerTele" class="sr-only">电话</label>
                <div class="input-group form-group">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-earphone" aria-hidden="true" style="font-size: large;"></span></span>
                    <input name="sellerTelephone"  type="text" id="inputSellerTele"  class=" form-control" placeholder="请输入手机号" required autofocus>
                </div>

                <label for="inputSellerPassword" class="sr-only">登录密码</label>
                <div class="input-group form-group">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-lock" aria-hidden="true" style="font-size: large;"></span></span>
                    <input  name="sellerPassword" type="password" id="inputSellerPassword" class=" form-control" placeholder="请输入登录密码" maxlength="20" required autofocus>
                </div>

                <label for="reinputSellerPassword" class="sr-only">确认登录密码</label>
                <div class="input-group form-group">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-lock" aria-hidden="true" style="font-size: large;"></span></span>
                    <input  name="reSellerPassword" type="password" id="reinputSellerPassword"  class=" form-control" placeholder="请确认登录密码" maxlength="20" required autofocus>
                </div>

                <div class="checkbox mb-3" style="float: left">
                    <label>
                        <input type="checkbox" value="seller-remember-me"> 记住我
                    </label>
                </div>
                <button id="signup" class="btn btn-lg btn-primary btn-block" type="submit">注册</button>
            </form>
        </div>
    </div>

</div>

</body>
</html>

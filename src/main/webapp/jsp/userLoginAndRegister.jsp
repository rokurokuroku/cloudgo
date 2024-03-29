<%@ page import="com.roku.cloudgo.controller.UserControllerImpl" %>
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

    <style>
        .form-horizontal
        {
            border-radius: 5px;
            padding: 30px;
            height: max-content;
            box-shadow: 10px 10px 5px #888888;
        }
    </style>
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

<div class="container text-center" style="margin: auto;height:640px;background:url(../images/loginbg2.jpg);width: 100%;background-size: cover">

    <!-- Nav tabs -->

    <!-- 登录 -->
    <div class="tab-content">
        <div role="tabpanel" class="tab-pane active " id="login" style="position: center">
            <form  id="defaultForm1" method="post" class="form-signin form-horizontal " style="transform: translate(10%,20%);" action="toLogin">

                <h1 class="mb-4 font-weight-normal">用户登录界面</h1>

                <label for="Username" class="sr-only">用户名</label>
                <div class="input-group form-group">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-user" aria-hidden="true" style="font-size: large;" style="float:left"></span></span>
                    <input name="userName" type="text" id="Username"  class=" form-control" placeholder="请输入用户名" maxlength="20" required autofocus>
                </div>

                <label for="Password" class="sr-only">登录密码</label>
                <div class="input-group form-group">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-lock" aria-hidden="true" style="font-size: large;"></span></span>
                    <input name="userPassword"  type="password" id="Password" class=" form-control" placeholder="请输入密码" maxlength="20" required autofocus>
                </div>
                <div class="checkbox mb-3" style="float: left">
                    <label>
                        <input type="checkbox" value="remember-me"> 记住我
                    </label>
                </div>
                <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
                <label>
                    <a class="btn btn-outline-success btn-sm" href="sellerLogin">前往店家登录界面</a>
                </label>
            </form>

        </div>

        <!--注册--->
        <div role="tabpanel" class="tab-pane" id="register">
            <form  id="defaultForm" method="post" class="form-signin form-horizontal" style="transform: translate(10%,4%);" action="toRegister">
                <h1 class="mb-4 font-weight-normal">用户注册界面</h1>
                <label for="inputUsername" class="sr-only">用户名</label>
                <div class="input-group form-group">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-user" aria-hidden="true" style="font-size: large;" style="float:left"></span></span>
                    <input name="userName" type="text" id="inputUsername"  class=" form-control" placeholder="请输入用户名" maxlength="20" required autofocus />
                </div>

                <label for="inputEmail" class="sr-only">邮箱</label>
                <div class="input-group form-group">
                    <span class="input-group-addon" ><span class="glyphicon glyphicon-envelope" aria-hidden="true" style="font-size:large"></span></span>
                    <input  name="userEmail" type="email" id="inputEmail" class=" form-control" placeholder="请输入邮箱" required autofocus>
                </div>

                <label for="inputPhone" class="sr-only">电话</label>
                <div class="input-group form-group">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-earphone" aria-hidden="true" style="font-size: large;"></span></span>
                    <input name="userTelephone"  type="text" id="inputPhone"  class=" form-control" placeholder="请输入手机号" required autofocus>
                </div>

                <label for="inputPassword" class="sr-only">登陆密码</label>
                <div class="input-group form-group">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-lock" aria-hidden="true" style="font-size: large;"></span></span>
                    <input  name="userPassword" type="password" id="inputPassword" class=" form-control" placeholder="请输入登录密码" maxlength="20" required autofocus>
                </div>

                <label for="inputPassword" class="sr-only">确认登录密码</label>
                <div class="input-group form-group">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-lock" aria-hidden="true" style="font-size: large;"></span></span>
                    <input  name="reUserPassword" type="password" id="inputcPassword"  class=" form-control" placeholder="请确认登录密码" maxlength="20" required autofocus>
                </div>

                <label for="inputPayPwd" class="sr-only">支付密码</label>
                <div class="input-group form-group">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-lock" aria-hidden="true" style="font-size: large;"></span></span>
                    <input  name="paymentCode" type="password" id="inputPayPwd" class=" form-control" placeholder="请输入支付密码" maxlength="20" required autofocus>
                </div>

                <label for="inputCPayPwd" class="sr-only">确认支付密码</label>
                <div class="input-group form-group">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-lock"aria-hidden="true" style="font-size: large;"></span></span>
                    <input  name="rePaymentCode" type="password" id="inputCPayPwd"  class=" form-control" placeholder="请确认支付密码" maxlength="20" required autofocus>
                </div>


                <div class="checkbox mb-3" style="float: left">
                    <label>
                        <input type="checkbox" value="remember-me"> 记住我
                    </label>
                </div>
                <button id="signup" class="btn btn-lg btn-primary btn-block" type="submit">注册</button>
            </form>
        </div>
    </div>
</div>

</body>
</html>

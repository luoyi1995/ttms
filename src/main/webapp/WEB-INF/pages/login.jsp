<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri= "http://java.sun.com/jsp/jstl/core" prefix= "c" %>
<c:set var="basePath" value="${pageContext.request.contextPath}"></c:set>
<HTML>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>TTMS教学系统</title>
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <link rel="stylesheet" href="${basePath}/bootstrap/css/bootstrap.min.css" />
  <link rel="stylesheet" href="${basePath}/dist/css/AdminLTE.min.css">
  <script src="${basePath}/jquery/jquery-3.2.1.min.js"></script>
</head>
<body class="hold-transition login-page">
<div class="login-box" id="rrapp">
  <div class="login-box-body">
   <form action="">
      <p class="login-box-msg"><b>TTMS 用户登录</b></p>
       <div class="alert alert-danger alert-dismissible" style="display:none">
        <h4 style="margin-bottom: 0px;"><i class="fa fa-exclamation-triangle" id="errorMessage"></i></h4>
      </div>
      <div class="form-group has-feedback">
          <input type="text" class="form-control" id="userId" placeholder="账号">
          <span class="glyphicon glyphicon-user form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
          <input type="password" class="form-control" id="userpwd" placeholder="密码">
          <span class="glyphicon glyphicon-lock form-control-feedback"></span>
      </div>

      <div class="row">
        <div class="col-xs-12">
          <button type="button" class="btn btn-primary btn-block btn-flat" id="btn-login" >登录</button>
        </div>
      </div>
      </form>
  </div>
</div>
</body>
</HTML>
<script type="text/javascript">
    $(document).ready(function () {
        $('#btn-login').click(function(){
            var userId=$('#userId').val();
            var pwd=$('#userpwd').val();
            if(userId==null||userId==''){
                $('#errorMessage').parent().parent().css('display','block');
                $('#errorMessage').text('账号不能为空');
                return false;
            }
            if(pwd==null||pwd==''){
                $('#errorMessage').parent().parent().css('display','block');
                $('#errorMessage').text('密码不能为空');
                return false;
            }
            var url='role/user/login.do';
            var params={
                'userId':userId,
                'pwd':pwd
            };
            $.post(url,params,function(result){
                if(result.state==1){//用户登陆成功,跳转到主页面
                    location.href='indexUI.do';
                }else {
                    $('#errorMessage').parent().parent().css('display','block');
                    $('#errorMessage').text(result.message);
                }
            });

        });
    });
</script>


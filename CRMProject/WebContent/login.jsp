<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<c:set var="base" value="<%=basePath %>"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
		<title>某某科技</title>
		<meta name="keywords" content="某某科技" />
		<meta name="description" content="某某科技" />
		<link href="ziyuan/css/layout.css" rel="stylesheet" type="text/css">
		<link href="ziyuan/css/login.css" rel="stylesheet" type="text/css">
		<script type="text/javascript" src="ziyuan/js/jquery-1.7.2.min.js"></script>
		<script type="text/javascript" src="ziyuan/js/js.js"></script>
	</head>
	<style>
		.ibar {display: none;}
	</style>
	<body class="login-bg">
		<div class="main ">
			<!--登录-->
			<div class="login-dom login-max">
				<div class="logo text-center">
					<a href="#">
					<img src="ziyuan/images/logo.png" width="180px" height="180px">
					</a>
				</div>
				<div class="login container " id="login">
					<p class="text-big text-center logo-color">
						同一个账号，连接一切
					</p>
					<p class=" text-center margin-small-top logo-color text-small">
						控制台 | 云平台 | 论坛 | 云市场
					</p>
					<form class="login-form" action="index.jsp" method="post" autocomplete="off">
						<div class="login-box border text-small" id="box">
							<div class="name border-bottom">
								<input type="text" placeholder="手机 / 邮箱 / 某某账号" id="username" name="username" datatype="*" nullmsg="请填写帐号信息">
							</div>
							<div class="pwd">
								<input type="password" placeholder="密码" datatype="*" id="password" name="password" nullmsg="请填写帐号密码">
							</div>
						</div>
						 
						<input type="hidden" name="formhash" value="5abb5d21"/>
						<input type="submit" class="btn text-center login-btn    "value="员工登录">
						<input type="submit" class="btn text-center login-btn   " value="客户登录">
						<input type="submit" class="btn text-center login-btn   " value="经理登录">
						 
					</form>
					<div class="forget">
						<a href="updatepass.jsp" class="forget-pwd text-small fl">忘记登录密码？</a><a href="register.jsp" class="forget-new text-small fr" id="forget-new">创建一个新账号</a>
					</div>
				</div>
			</div>

			<div class="footer text-center text-small ie">
				Copyright 2013-2016 某某科技科技有限公司 版权所有 <a href="#" target="_blank">滇ICP备13005806号</a>
				<span class="margin-left margin-right">|</span>
				<script src="#" language="JavaScript"></script>
			</div>
			<div class="popupDom">
				<div class="popup text-default">
				</div>
			</div>
		</div>
	</body>
	<script type="text/javascript" src="Js/Validform_v5.3.2_min.js"></script>
	<script type="text/javascript">
		function popup_msg(msg) {
			$(".popup").html("" + msg + "");
			$(".popupDom").animate({
				"top": "0px"
			}, 400);
			setTimeout(function() {
				$(".popupDom").animate({
					"top": "-40px"
				}, 400);
			}, 2000);
		}

		/*动画（注册）*/
		$(document).ready(function(e) {
			// $("input[name=username]").focus();
			// $('.login-form').Validform({
			// 	ajaxPost: true,
			// 	tiptype: function(msg) {
			// 		if (msg) popup_msg('' + msg + '');
			// 	},
			// 	callback: function(ret) {
			// 		popup_msg('' + ret.info + '');
			// 		if (ret.status == 1) {
			// 			if (ret.uc_user_synlogin) {
			// 				$("body").append(ret.uc_user_synlogin);
			// 			}
			// 			setTimeout("window.location='" + ret.url + "'", 2000);
			// 		}
			// 	}
			// })

		});
	</script>

</html>
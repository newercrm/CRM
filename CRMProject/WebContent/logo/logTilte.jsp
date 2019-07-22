<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>日志管理</title>
<link rel="stylesheet" type="text/css" href="../ziyuan/css/identify.css" />
<link rel="stylesheet" type="text/css" href="../ziyuan/css/layout.css" />
<link rel="stylesheet" type="text/css" href="../ziyuan/css/account.css" />
<link rel="stylesheet" type="text/css" href="../ziyuan/css/style.css" />
<link rel="stylesheet" type="text/css"
	href="../ziyuan/css/control_index.css" />
<script type="text/javascript" src="../ziyuan/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="../ziyuan/js/layer/layer.js"></script>
<script type="text/javascript"
	src="../ziyuan/js/haidao.offcial.general.js"></script>
<script type="text/javascript" src="../ziyuan/js/select.js"></script>
<script type="text/javascript" src="../ziyuan/js/haidao.validate.js"></script>
</head>
</head>

<body>
	<div class="view-topbar">
		<div class="topbar-console">
			<div class="tobar-head fl">
				<a href="#" class="topbar-logo fl"> <span><img
						src="../ziyuan/images/logo.png" width="20" height="20" /></span>
				</a> <a href="index.jsp"
					class="topbar-home-link topbar-btn text-center fl"><span>管理控制台</span></a>
			</div>
		</div>
		<div class="topbar-info">
			<ul class="fr">
				<li class="fl dropdown topbar-notice topbar-btn"><a href="#"
					class="dropdown-toggle"> <span class="icon-notice"></span> <span
						class="topbar-num have">0</span> <!--have表示有消息，没有消息去掉have-->
				</a></li>
				<li class="fl topbar-info-item">
					<div class="dropdown">
						<a href="#" class="topbar-btn"> <span class="fl text-normal">帮助与文档</span>
							<span class="icon-arrow-down"></span>
						</a>
						<ul class="dropdown-menu">
							<li><a href="#">模板开发手册</a></li>
							<li><a href="#">某某数据字典</a></li>
						</ul>
					</div>
				</li>
				<li class="fl topbar-info-item">
					<div class="dropdown">
						<a href="#" class="topbar-btn"> <span class="fl text-normal">小朱</span>
							<span class="icon-arrow-down"></span>
						</a>
						<ul class="dropdown-menu">
							<li><a href="../login.jsp">退出</a></li>
						</ul>
					</div>
				</li>
			</ul>
		</div>
	</div>
	<div class="view-body">
		<div class="view-sidebar">
			<div class="sidebar-content">
				<div class="sidebar-nav">
					<div class="sidebar-title">
						<a href="#"> <span class="icon"><b
								class="fl icon-arrow-down"></b></span> <span class="text-normal">合同管理</span>
						</a>
					</div>
					<ul class="sidebar-trans">
						<li><a href="../contract_jsp/parContract.jsp"> <b
								class="sidebar-icon"><img
									src="resources/images/icon_author.png" width="16" height="16" /></b>
								<span class="text-normal">合同</span>
						</a></li>
					</ul>
				</div>

				<div class="sidebar-nav">
					<div class="sidebar-title">
						<a href="#"> <span class="icon"><b
								class="fl icon-arrow-down"></b></span> <span class="text-normal">员工管理</span>
						</a>
					</div>
					<ul class="sidebar-trans">

						<li><a href="../staff_jsp/staff.jsp"> <b
								class="sidebar-icon"><img
									src="resources/images/icon_authentication.png" width="16"
									height="16" /></b> <span class="text-normal">员工信息</span>
						</a></li>
						<li><a href="../log_jsp/log.jsp"> <b class="sidebar-icon"><img
									src="resources/images/icon_news.png" width="16" height="16" /></b>
								<span class="text-normal">日志管理</span>
						</a></li>

					</ul>
				</div>
				<div class="sidebar-nav">
					<div class="sidebar-title">
						<a href="#"> <span class="icon"><b
								class="fl icon-arrow-down"></b></span> <span class="text-normal">客户管理</span>
						</a>
					</div>
					<ul class="sidebar-trans">

						<li><a href="../customer_jsp/customer.jsp"> <b
								class="sidebar-icon"><img
									src="resources/images/icon_authentication.png" width="16"
									height="16" /></b> <span class="text-normal">客户详情</span>
						</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="view-product"></div>
	</div>

	<script>
				$(".sidebar-title").live('click', function() {
					if($(this).parent(".sidebar-nav").hasClass("sidebar-nav-fold")) {
						$(this).next().slideDown(200);
						$(this).parent(".sidebar-nav").removeClass("sidebar-nav-fold");
					} else {
						$(this).next().slideUp(200);
						$(this).parent(".sidebar-nav").addClass("sidebar-nav-fold");
					}
				});
			</script>
</body>

</html>
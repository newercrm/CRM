<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/logo/logTilte.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>控制台</title>
<link rel="stylesheet" type="text/css" href="../ziyuan/css/identify.css" />
<link rel="stylesheet" type="text/css" href="../ziyuan/css/layout.css" />
<link rel="stylesheet" type="text/css" href="../ziyuan/css/account.css" />
<link rel="stylesheet" type="text/css" href="../ziyuan/css/style.css" />
<link rel="stylesheet" type="text/css"
	href="../ziyuan/css/control_index.css" />
<script type="text/javascript" src="../ziyuan/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="../ziyuan/js/layer/layer.js"></script>
<script type="text/javascript" src="../ziyuan/js/haidao.offcial.general.js"></script>
<script type="text/javascript" src="../ziyuan/js/select.js"></script>
<script type="text/javascript" src="../ziyuan/js/haidao.validate.js"></script>
<style>
.ud {
	/*color: red;*/
	margin-left: 25px;
}

.box {
	padding-top: 50px;
	margin-left: 180px;
	height: 760px;
}
</style>
</head>

<body>
	<div class="box">
		<div class="view-product">
			<div class="info-center">
				<div class="manage-head">
					<h6 class=" padding-left manage-head-con ">日志管理</h6>
				</div>
				<div class="info-center-con">
					<div class=" info-center-title h5 margin-big-top clearfix">
						<span class="fl padding-large-right manage-title"><a
							href="#">全部日志</a></span> <span class="fl padding-large-right"><a
							href="#">新增日志</a></span>
						<!--<span class="fl"><a href="#">修改日志</a></span>-->
					</div>
					<p style="width: 56px; left: 20px;" class="solid-slider"></p>
				</div>





				<div class="offcial-table input-table table-margin clearfix">
					<div class="tr-th clearfix">
						<div class="th w5 text-center"></div>
						<div class="padding-left-15 th w55">标题内容</div>
						<br>
						<div class="th w15">开始时间</div>
						<div class="th w15">结束时间</div>
						<div class="th w15">合同状态</div>
						<div class="th w25">提交人:</div>
					</div>



					<div class="tr-th clearfix">
						<div class="th w5 text-center"></div>
						<div class="padding-left-15 th w55">标题内容</div>
						<br>
						<div class="th w15">开始时间</div>
						<div class="th w15">结束时间</div>

						<div class="th w15">合同状态</div>
						<div class="th w25">
							提交人: <a class="ud" href="#">修改</a> <a class="ud" href="#">删除</a>

						</div>
					</div>




					<div class="non-info">
						<span>没有任何消息</span>
					</div>
				</div>
			</div>
			<div class="show-page padding-top-0 layout hidden">
				<ul class="tr-float">
				</ul>
			</div>
		</div>
	</div>
</body>

</html>
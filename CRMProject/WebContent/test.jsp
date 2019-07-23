<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path1 = request.getContextPath();
	String basePath1 = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path1 + "/";
%>

<c:set var="base" value="<%=basePath1%>" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<head>
<script type="text/javascript" src="ziyuan/js3/jquery.min.js"></script>
<script type="text/javascript" src="ziyuan/js3/jquery.easyui.min.js"></script>
<script type="text/javascript" src="ziyuan/js3/easyui-lang-zh_CN.js"></script>
</head>
<body>
	<table border="1px">
		<tr>
			<td>编号</td>
			<td>概要</td>
			<td>指定客户</td>
			<td>客户联系电话</td>
			<td>创建时间</td>
			<td>开始执行时间</td>
			<td>执行结束时间</td>
			<td>状态</td>
			<td>创建人</td>
		</tr>
		<c:forEach items="${logMess}" var="mm">
			<tr>
				<td>${mm.lid}</td>
				<td>${mm.logmessage}</td>
				<td>${mm.client.cname}</td>
				<td>${mm.client.ctel}</td>
				<td>${mm.logtime}</td>
				<td>${mm.starttime}</td>
				<td>${mm.endtime}</td>
				<td>${mm.lstate}</td>
				<td>${mm.emp.ename}</td>
			</tr>
		</c:forEach>
	</table>
	<%-- <a href="${base}fingLog">获取角色</a> --%>
	<%-- <a href="${base}findClientId">点击</a> --%>
	<form action="${base}findClientId" method="post">
		概要：<input type="text" name="logmessage"> 开始时间：<input
			type="date" name="starttime"> 结束时间：<input type="date"
			name="endtime"> 创建时间：<input type="date" name="logtime">
		客户姓名：<input type="text" name="cname" > 客户联系方式：<input
			type="text" name="ctel" > 员工姓名：<input type="text"
			name="ename" value="周豪"> 员工联系方式：<input type="text"
			name="etel" value="18265369865"> <input type="hidden"
			name="lEid" value="1">

		 <input type="submit" value="提交"> 
		<!-- <button id="btn">提交</button> -->
	</form>
</body>
<!-- <script type="text/javascript">
	$("document").ready(function(){
		$("#btn").click(function(){
			var cname = $("#cname").val();
			var ctel = $("#ctel").val();
		 	 alert(cname+" "+ctel);
		 	var params = {"cname":cname,"ctel":ctel};
		 	alert(params.cname+" "+params.ctel);
			    $.ajax({
	            type: "POST",
	            url: "${base}findIdByName",
	            contentType:'application/json;charset=utf-8',
	            async:true,//请求是否异步，默认为异步
	            data:JSON.stringify(params),
	            beforeSend:function(){
	                //请求前的处理
	            },
	            success: function (data,status,xhr) {
	            	//alert(JSON.stringify(data)+"---------status:"+status+"-------xhr:"+xhr);
					alert("------"+data.cid); 
	            	
	            },
	            complete:function(){
	                //请求完成的处理
	            },
	            error:function(data,status,xhr){
	            	alert(JSON.stringify(data)+"---------status:"+status+"-------xhr:"+xhr);
		        }
	        });    
			
		}); 
	});
	</script> -->
</html>

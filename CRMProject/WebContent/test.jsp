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
<%-- 	<table border="1px">
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
	</table>  --%>
	<%-- <a href="${base}fingLog">获取角色</a> --%>
	<%-- <a href="${base}findClientId">点击</a> --%>
	<%-- <form action="${base}findClientId" method="post">
		概要：<input type="text" name="logmessage"> 开始时间：<input
			type="date" name="starttime"> 结束时间：<input type="date"
			name="endtime"> 创建时间：<input type="date" name="logtime">
		客户姓名：<input type="text" name="cname"> 客户联系方式：<input
			type="text" name="ctel"> 员工姓名：<input type="text"
			name="ename" value="周豪"> 员工联系方式：<input type="text"
			name="etel" value="18265369865"> <input type="hidden"
			name="lEid" value="1"> <input type="submit" value="提交">
		<!-- <button id="btn">提交</button> -->
	</form> --%>

	<%-- <a href="${base}findLogById">员工查询</a> --%>
<%-- 	<form action="${base}findLogByClass" method="post">
	客户姓名：<input type="text" id="cname" name="cname">
	员工姓名：<input type="text" id= "ename" name = "ename"> 
	概要：<input type="text" name = "logmessage">
	状态情况：<select name="lstate">
				<option value="">请选择...</option>
				<option value="0">未完成</option>
				<option value="1">已完成</option>
		   </select>
	<br>
	<input type="submit" value="提交">
	<!-- <button type="button" id="findButton">搜索</button> -->
</form> --%>
<%-- <form action="${base}updateLogByClientAndEmp" method="post">
		概要：<input type="text" name="logmessage" value="模拟修改"><br>
		 开始时间：<input type="date" name="starttime" value="2019-07-26"> <br>
		 结束时间：<input type="date" name="endtime" value="2019-07-27"><br>
		客户姓名：<input type="text" name="cname" value="辉总"> <br>
		客户联系方式：<input type="text" name="ctel" value="14563289"> <br>
		员工姓名：<input type="text" name="ename" value="阿亮"><br> 
		员工联系方式：<input type="text" name="etel" value="147258369"><br> 
		状态情况：<input type="text" name="lstate" value="0"><br> 
		<input type="hidden" name="lid" value="7"> 
		<input type="submit" value="提交">
</form> --%>
<input type="hidden" name = "lid" value="8" id = "lid">
<button id = "detelebtn">删除</button>
</body>



<script type="text/javascript">
	$("document").ready(function(){
		$("#detelebtn").click(function(){
			var lid = $("#lid").val();
			alert(lid);
			var jsonObject ={"lid":lid};
			alert(JSON.stringify(jsonObject)); 
			var jsonString = JSON.stringify(jsonObject);
			
			 $.ajax({
	            type: "POST",
	            url: "${base}deleteLogByid",
	            contentType:'application/json;charset=utf-8',
	            async:true,//请求是否异步，默认为异步
	            data:JSON.stringify(jsonObject),
	            beforeSend:function(){
	                //请求前的处理
	            },
	            success: function (data,status,xhr) {
	            	/*  alert(data); */
	            	 if(data == 1){
	            		 alert("删除成功！！！")
	            	 }else{
	            		 alert("删除失败")
	            	 }
					/*  alert(data.log.logmessage+"  "+data.client.cname+" "+data.emp.ename+" "+data.log.lstate);  */
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

</script>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

 <c:set var="base" value="<%=basePath %>"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<head></head>
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
	<a href="${base}fingLog">获取角色</a>
</body>
</html>
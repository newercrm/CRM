<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<table>
	<tr>
		<td>角色ID</td>
		<td>角色名</td>
	</tr>
	<c:forEach items="${mess}" var="mm">
		<tr>
		<td>${mm.rid}</td>
		<td>${mm.rolename}</td>
	</tr>
	</c:forEach>
</table>
	<a href="${base}index">获取角色</a>
</body>
</html>
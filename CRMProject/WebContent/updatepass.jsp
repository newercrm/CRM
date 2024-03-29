<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<c:set var="base" value="<%=basePath %>"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

	<head>
		<meta charset="UTF-8">
		<title>账户注册</title>
		<style type="text/css">
			body,
			input {
				margin: 0;
				padding: 0;
			}
			
			input {
				display: inline-block;
				background: #fff;
			}
			
			.xiao-container {
				width: 100%;
			}
			
			.xiao-register-box {
				position: relative;
				height: 800px;
				width: 800px;
				top: 50px;
				margin: 0 auto;
				z-index: 99999;
				background: #ffffff;
				border: 7px solid #ccc;
			}
			
			.xiao-title-box {
				position: absolute;
				width: 300px;
				height: 50px;
				margin-left: 250px;
				margin-top: 5px;
				text-align: center;
				font-size: 28px;
				font-weight: 800;
				color: #ff5000;
				line-height: 50px;
			}
			
			.xiao-username-box {
				position: absolute;
				width: 420px;
				height: 40px;
				line-height: 40px;
				margin-top: 100px;
				margin-left: 80px;
				font-weight: 700;
			}
			
			.xiao-username-input {
				display: inline-block;
				margin-left: 45px;
				/*background: green;*/
			}
			
			#username {
				height: 35px;
				width: 290px;
				border: 2px solid #ccc;
				border-radius: 5px;
			}
			
			.xiao-userPassword-box {
				position: absolute;
				width: 420px;
				height: 40px;
				line-height: 40px;
				margin-top: 180px;
				margin-left: 80px;
				font-weight: 700;
			}
			
			.xiao-userPassword-input {
				display: inline-block;
				margin-left: 61px;
			}
			
			#userPassword {
				height: 35px;
				width: 290px;
				border: 2px solid #ccc;
				border-radius: 5px;
			}
			
			.xiao-userRePassword-box {
				position: absolute;
				width: 420px;
				height: 40px;
				line-height: 40px;
				margin-top: 260px;
				margin-left: 80px;
				font-weight: 700;
			}
			
			.xiao-userRePassword-input {
				display: inline-block;
				margin-left: 28px;
			}
			
			#userRePassword {
				height: 35px;
				width: 290px;
				border: 2px solid #ccc;
				border-radius: 5px;
			}
			
			.xiao-userPhone-box {
				position: absolute;
				width: 420px;
				height: 40px;
				line-height: 40px;
				margin-top: 340px;
				margin-left: 80px;
				font-weight: 700;
			}
			
			.xiao-userPhone-input {
				display: inline-block;
				margin-left: 28px;
			}
			
			#userPhone {
				height: 35px;
				width: 290px;
				border: 2px solid #ccc;
				border-radius: 5px;
			}
			
			.xiao-userEmail-box {
				position: absolute;
				width: 420px;
				height: 40px;
				line-height: 40px;
				margin-top: 420px;
				margin-left: 80px;
				font-weight: 700;
			}
			
			.xiao-userEmail-input {
				display: inline-block;
				margin-left: 28px;
			}
			
			#userEmail {
				height: 35px;
				width: 290px;
				border: 2px solid #ccc;
				border-radius: 5px;
			}
			
			.xiao-userGender-box {
				position: absolute;
				width: 420px;
				height: 40px;
				line-height: 40px;
				margin-top: 500px;
				margin-left: 82px;
				font-weight: 700;
			}
			
			.xiao-userGender-input {
				display: inline-block;
				margin-left: 62px;
			}
			
			.xiao-require {
				color: red;
			}
			
			.xiao-submit-box {
				position: absolute;
				width: 80px;
				height: 40px;
				line-height: 40px;
				margin-top: 580px;
				margin-left: 200px;
				border-radius: 5px;
				background: grey;
			}
			
			#xiao-submit-button {
				display: inline-block;
				width: 80px;
				height: 40px;
				border-radius: 5px;
				background: red;
			}
			
			.xiao-goLogin-box {
				position: absolute;
				width: 150px;
				height: 20px;
				margin-top: 600px;
				margin-left: 320px;
			}
		</style>

	</head>

	<body>
		<div class="xiao-container">
			<div class="xiao-register-box">
				<div class="xiao-title-box">
					<span>用户注册</span>
				</div>
					<div class="xiao-username-box">
						<span class="xiao-require">*</span>
						<label for="username">  账号</label>
						<div class="xiao-username-input">
							<input type="text" id="username" name="username" placeholder="请输入用户名 长度:6-12个字符" />
						</div>
					</div>

					<div class="xiao-userPassword-box">
						<span class="xiao-require">*</span>
						<label for="userPassword">密码</label>
						<div class="xiao-userPassword-input">
							<input type="password" id="userPassword" name="userPassword" placeholder="请输入密码 长度:6-12个字符" />
						</div>
					</div>

					<div class="xiao-userRePassword-box">
						<span class="xiao-require">*</span>
						<label for="userRePassword">确认密码</label>
						<div class="xiao-userRePassword-input">
							<input type="password" id="userRePassword" name="userRePassword" placeholder="请重复输入密码" />
						</div>
					</div>

					<div class="xiao-userPhone-box">
						<span class="xiao-require">*</span>
						<label for="userPhone">手机号码</label>
						<div class="xiao-userPhone-input">
							<input type="text" id="userPhone" name="userPhone" placeholder="请输入您的手机号码，11位有效数字" />
						</div>
					</div>

					<div class="xiao-userEmail-box">
						<span class="xiao-require">*</span>
						<label for="userEmail">区域地址</label>
						<div class="xiao-userEmail-input">
	
		<select id="s1" onchange="link()">
			<option>湖南</option>
			 
		</select>
		<select id="s2">
			
		</select>
		</div>
		<div class="xiao-userEmail-box">
					<span class="xiao-require">*</span>
					<label for="userEmail">账号</label>
					<div class="xiao-userEmail-input">
						<input type="text" id="userEmail" name="userEmail" placeholder="请输入您的账户，如：123@qq.com" />
					</div>
		</div>
		
		 
	<script>
		var sz=[
					["长沙","株洲","娄底","湘潭","常德","怀化","邵阳","湘西","益阳","永州","衡阳","张家界","岳阳"],
					 ];
		function link(){
			var sheng =document.getElementById("s1");
			var shi =document.getElementById("s2");
			shi.options.length=0;
			var k=sheng.selectedIndex;
			for(var i=0;i<sz[k].length;i++){
				var v=sz[k][i];
				op=new Option(v,v);
				shi.add(op);
			}
				
		}
		window.onload=link;
	</script>
								
						</div>
					</div>

					<div class="xiao-submit-box">
						<input id="xiao-submit-button" type="submit" value="注册">
					</div>

					<div class="xiao-goLogin-box">
						<a href="login.jsp" style="text-decoration: none;">已有账号？去登录</a>
					</div>
				</form>
			</div>
		</div>
	</body>
	 

</html>
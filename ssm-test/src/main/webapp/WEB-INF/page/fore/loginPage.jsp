<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ include file='incloud/header.jsp' %>

<link rel='stylesheet' href='${pageContext.request.contextPath}/res/css/fore/fore_login.css'/>
<script src='${pageContext.request.contextPath}/res/js/fore/fore_login.js'></script>
<title>登录界面</title>

<body style="margin:0 auto">
<!-- 头部 -->
	<div id='top'>
		<img class='top_image' src='${pageContext.request.contextPath}/res/image/fore/webSiteImage/HomeLogoA.png'/>
	</div>
<!-- 中部 -->
	<div class='back'>
		<div id='middle' style='background:url("${pageContext.request.contextPath}/res/image/fore/webSiteImage/loginbz3.jpg");'>
			<div class='login_frame'>
				<div class='login_info'>
					<p class='tsls' style='margin-left:20px'>
						密码登录
					</p>
					<form method='post' class='loginForm' onsubmit="return false">
					<p>
						<label >用户名：</label>
						<input id='user_name' name="user_name"  type='text' placeholder='请输入用户名'/>
					</p>
					<p>
						<label >密码：</label>
						<input id='password' name='password' type='password' placeholder='请输入密码'/>
					</p>
					<p>
						<input class="btns btn-large" type='submit' value='登录'/>
					</p>
					</form>
					<a href='${pageContext.request.contextPath}/register' class='register_button'>免费注册</a>
				</div>
			</div>
		</div>
	</div>
<!-- 尾部 -->
	<div>
	
	</div>
</body>
</html>
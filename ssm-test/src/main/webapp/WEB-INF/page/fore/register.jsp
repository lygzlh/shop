<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>用户注册</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/bootstrap-select.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/fore/fore_main.css"/>
    <script src="${pageContext.request.contextPath}/res/js/jquery-1.11.3.min.js"></script>
    <script src="${pageContext.request.contextPath}/res/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/res/js/bootstrap-select.min.js"></script>
    <script src="${pageContext.request.contextPath}/res/js/defaults-zh_CN.min.js"></script>
    <script src="${pageContext.request.contextPath}/res/js/base.js"></script>
	<script src="${pageContext.request.contextPath}/res/js/fore/fore_register.js"></script>
	<link rel='stylesheet' href='${pageContext.request.contextPath}/res/css/fore/fore_register.css'/>
</head>
<body>

	<nav>
		<div class="header">
			<div id="mallLogo">
				<img src='${pageContext.request.contextPath}/res/image/fore/webSiteImage/HomeLogoA.png'/>
				<span class="span_hwshopRegister" >用户注册</span>
			</div>
		</div>
	</nav>
	
	<div class='content'>
		<div class='steps'>
			<div class='steps_main'>
					<span class='steps_tsl tsls'>填写用户信息</span>
			</div>
		</div>
		
		
		<div class='form-list'>
			<div class='form-item'>
				<label class='form-label tsls'>设置会员名</label>
			</div>
			<div class='form-item'>
				<label class='form-label tsl'>用户名：</label>
				<input name='user_name' id='user_name' class='form-text err-input' type='text' placeholder='请输入用户名' />
			</div>
			<div class='form-item'>
				<label class='form-label tsls'>设置登录密码</label>
				<span class='form-label tsl'>登录时验证，保护登录信息</span>
			</div>
			<div class='form-item'>
				<label class='form-label tsl'>登录密码：</label>
				<input name='user_password' id='user_password' class='form-text err-input' type='text' placeholder='请设置登录密码' />
			</div>
			<div class='form-item'>
				<label class='form-label tsl'>确认密码：</label>
				<input name='user_password_one' id='user_password_one' class='form-text err-input' type='text' placeholder='请再次输入登录密码' />
			</div>
			<div class='form-item'>
				<label class='form-label tsls'>填写基本信息</label>
			</div>
			<div class='form-item'>
				<label class='form-label tsl'>昵称：</label>
				<input name='user_nickname' id='user_nickname' class='form-text err-input' type='text' placeholder='请输入昵称' />
			</div>
			<div class='form-item'>
				<label class='form-label tsl'>性别：</label>
				<input name='user_gender' id="form_radion"   type='radio' value='0' checked='checked'/>男
				<input name='user_gender' id="form_radions"   type='radio' value='1' />女
			</div>
			<div class='form-item'>
				<label class='form-label tsl'>出生年月：</label>
				<input name='user_birthday' id='user_birthday' class='form-text err-input' type='text' placeholder='年\月\日' />
			</div>
			
			<div class="form-item">
            <label class="form-label tsl">居住地址：</label>
            <select class="selectpicker" id="select_user_address_province" data-size="8" data-live-search="true">
               
                    <option value="">北京</option>
                    <option value="">上海</option>
            </select>
            <select class="selectpicker" id="select_user_address_city" data-size="8" data-live-search="true">               
                    <option ></option>
            </select>
            <select name="user_address" class="selectpicker" id="select_user_address_district" data-size="8"
                    data-live-search="true">
                 <option ></option>
            </select>
        </div>

			 <div class="form-item">
            	<input type="button" id="register_sub" class="btns btn-large tsl" value="注 册"/>
        	</div>
		</div>
	</div>
	
</body>
</html>
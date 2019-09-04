<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="incloud/header.jsp" %>

<html>
<head>
	<title>用户列表</title>
	<script src='${pageContext.request.contextPath}/res/js/admin/userSelect.js'></script>
</head>
<body>
	<div>
		
			<div>
					用户名/昵称
					<input id='user_name' name='user_name' type='text' placeholder='用户名'/>
					<input id='submit_data' type='button' value='提交'/>
					<input type='button' value='重置'/>
				
			</div>
			<div>
				用户性别：  
				<input name='user_gender' type='checkbox' value='0'/>男
				<input name='user_gender' type='checkbox' value='1'/>女
			</div>
	
		<div>
			<span>查看合计</span>
		</div>
	</div>


	<table id='table_info' class="table table-striped">
		<thead>
			<tr>
				<td><input id='id_choose' type='checkbox'/></td>
				<td>用户名</td>
				<td>密码</td>
				<td>名称</td>
				<td>性别</td>
				<td>生日</td>
				<td>操作</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items = '${requestScope.userList}' var='user'>
				<tr>
					<td><input name='nid' type='checkbox' value=${user.user_id}/></td>
					<td>${user.user_name}</td>
					<td>${user.user_password}</td>
					<td>${user.user_nickname}</td>
					<td>
						<c:choose>
							<c:when test="${user.user_gender==0}">男</c:when>
							<c:otherwise>女</c:otherwise>
						</c:choose>
					</td>
					<td>${user.user_birthday}</td>
					<td><a style='color:red'>详情</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<div></div>
	
</body>
</html>
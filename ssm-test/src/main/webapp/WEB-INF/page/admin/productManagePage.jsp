<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="incloud/header.jsp" %>

<head>
	<title>产品管理</title>
	<script src='${pageContext.request.contextPath}/res/js/admin/product.js'></script>
	<link rel='stylesheet' href='${pageContext.request.contextPath}/res/css/admin/admin_product.css'/>
</head>
<body>
	<div class='pro_div'>
		<span class='pro_left'>
			产品类型
			<select id='product_type' name='product_type'>
				<option value='女装'>女装</option>
				<option value='男装'>男装</option>
			</select>
		</span>
		<span  class='pro_right'>
			产品状态
			<input name='state' type='radio' value='销售中'/>销售中
			<input name='state' type='radio' value='停售中'/>停售中
			<input name='state' type='radio' value='促销中'/>促销中
		</span>
	</div>
	<!-- 下划线 -->
	<div ></div>
	
	<div class='details_div'>
		<div >基本信息</div>
		<div class='pro_div'>
			<span class='pro_left'>
				<span>产品编号</span>
				<span>系统指定</span>
			</span>
			<span class='pro_right'>
				<span>上架日期</span>
				<span>系统指定</span>
			</span>
		</div>
		
		<div class='pro_div'>
			<span class='pro_left'>
				<span>产品名称</span>
				<input id='product_name' name='product_name' type='text'/>
			</span>
			<span class='pro_right'>
				<span>产品标题</span>
				<input id='product_title' name='product_title' type='text'/>
			</span>
		</div>
		
		<div class='pro_div'>
			<span class='pro_left'>
				<span>产品原价</span>
				<input id='product_price' name='product_price' type='text'/>元
			</span>
			<span class='pro_right'>
				<span>产品促销价</span>
				<input id='product_sales'name='product_sales' type='text'/>元
			</span>
		</div>		
	</div>
	
	<div></div>
	
	<div class='details_div'>
		<div>概述图片</div>
		<ul class='details_picList'>
			<li class="details_picList_fileUpload">
	            <svg class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="1528"  width="40" height="40">
	                <path d="M0 512C0 229.230208 229.805588 0 512 0 794.769792 0 1024 229.805588 1024 512 1024 794.769792 794.194412 1024 512 1024 229.230208 1024 0 794.194412 0 512Z" p-id="1529" fill="#FF7874"></path>
	                <path d="M753.301333 490.666667l-219.946667 0L533.354667 270.741333c0-11.776-9.557333-21.333333-21.354667-21.333333-11.776 0-21.333333 9.536-21.333333 21.333333L490.666667 490.666667 270.72 490.666667c-11.776 0-21.333333 9.557333-21.333333 21.333333 0 11.797333 9.557333 21.354667 21.333333 21.354667L490.666667 533.354667l0 219.904c0 11.861333 9.536 21.376 21.333333 21.376 11.797333 0 21.354667-9.578667 21.354667-21.333333l0-219.946667 219.946667 0c11.754667 0 21.333333-9.557333 21.333333-21.354667C774.634667 500.224 765.077333 490.666667 753.301333 490.666667z" p-id="1530" fill="#FFFFFF"></path>
	            </svg>
	            <span>点击上传</span>
	            <input type="file" onchange="uploadImage(this)" accept="image/*">
	        </li>
        </ul>
	</div>
	<div class='details_div'>
		<input class='btn btn-danger' id='add' type='button' value='添加'/>
	</div>
</body>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/bootstrap.min.css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/bootstrap-select.min.css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/fore/fore_main.css"/>
<link rel='stylesheet' href='${pageContext.request.contextPath}/res/css/fore/fore_nav.css' />
</head>
<body style='margin:0 auto'>
	<div id="nav">
	<!-- 头部导航开始 -->
		<div class='nav_main'>
			<p id="container-login">
				<em>喵，欢迎来易优购</em>
		      	<a href="${pageContext.request.contextPath}/login">请登录</a>                   
		       	<a href="${pageContext.request.contextPath}/register">免费注册</a>
			</p>
	<!-- 搜索栏 -->
			<div >
				<img class='p_left img_size' src='${pageContext.request.contextPath}/res/image/fore/webSiteImage/HomeLogoA.png'/>
				<input class='p_left search form-control' type='text'/>
				<input class="btn btn-default" style='margin-top:44px;margin-left:-54px;' type="button" value="搜索">
			</div>
			<div style='clear:both'></div>
			<div>
				<span class='tlss border_con'>全部</span>
				<span class='tlss'>男装</span>
				<span class='tlss'>女装</span>
			</div>
			<div style='border-bottom:2px solid red;margin-left:-500px;width:1999px;'></div>
			<div style='margin-top:30px;'></div>
	<!-- 商品栏 -->		
	 	<div>
				<a class='condition btn btn-default'>价格</a>
				<a class='condition btn btn-default'>评价</a>
				<a class='condition btn btn-default'>销量</a>
		</div> 	
			<ul>
				<c:forEach items = '${requestScope.productList}' var='product'>
					<li class='commodity p_left '>
						<a href='#'>
							<p>
								<img class='shop_img_size' src="${product.product_url}">
							</p>
							<div>
								<h5 class='title'>${product.product_name}</h5>
								<h5 class='title' style='color:#999'>${product.product_title}</h5>
							</div>
							<div class='pbtn'>
								<span class='price'>
									<b class='price_size'>
									¥ ${product.product_price}
									</b>
								</span>
								<span class='buy_size btn btn-danger'>立即购买</span>
							</div>
						</a>
					</li>
				</c:forEach>
			</ul>
	
		</div>


		

		<div>
			
		</div>
	</div>
</body>
</html>
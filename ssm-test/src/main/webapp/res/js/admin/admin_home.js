$(function(){
	
	$('.menu_li').click(function(){
		var url = $(this).attr('data-toggle');
	//	if($(this).hasClass('menu_li_select')){
	//		return;
	//	}else{
			$('.menu_li_select').removeClass('menu_li_select');
			$(this).addClass('menu_li_select');
			var title = $(this).children('span').text();
			$('#div_home_title').children('span').text(title);
			ajaxUtil.getPage(url,null,false);
		//}
	});
	
	
	
});

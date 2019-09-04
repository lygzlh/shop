$(function(){
	
	$('.loginForm').submit(function(){
		var user_name = $('#user_name').val();
		var password = $('#password').val();
			
		
		$.ajax({
			type:'POST',
			url:'/ssm-test/login/doLogin',
			data:{
				'user_name':user_name,
				'password':password
			},
			dataType:'json',
			success:function(data){
				if(data.success){
					alert('登录成功');
					location.href='/ssm-test';
				}else{
					alert('用户名或密码不正确');
					location.reload();
				}
			}
			
		})
		
	});
	
	
	
});

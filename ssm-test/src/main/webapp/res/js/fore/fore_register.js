$(function(){

	$('#register_sub').click(function(){
		//获取所有输入框的值
		var user_name = $('#user_name').val();
		var user_password = $('#user_password').val();
		var user_password_one = $('#user_password_one').val();
		var user_nickname = $('#user_nickname').val();
		var user_gender = $('input[name=user_gender]:checked').val();
		var user_birthday = $('#user_birthday').val();
		
		
		$.ajax({
			type:'POST',
			url: '/ssm-test/register/doRegister',
			data:{
				'user_name':user_name,
				'user_password':user_password,
				'user_password_one':user_password_one,
				 "user_nickname": user_nickname,
                 "user_birthday": user_birthday,
                 "user_gender":user_gender
			},
			dataType: 'json',
			success:function(data){
				if(data.success){
					alert('注册成功');
					location.href='/ssm-test/login';
				}else{
					alert('注册失败');
					location.reload();
				}
			},
		
		});
		
		
		//把获取到的数据提交给后台
		//处理后台返回的结果
		

	});
});
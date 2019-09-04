$(function(){
	
	$('#submit_data').click(function(){
		var user_name = $('#user_name').val();
		var user_gender=null;
		var num=0;
		$('input[name=user_gender]:checked').each(function(){
			num = num+1;
			if(num==1){
				if($(this).val()==0){
					user_gender='0';
				}
				if($(this).val()==1){
					user_gender='1';
				}
			}else{
				user_gender=null;
			}
		});
		
		$.ajax({
			url:'/ssm-test/user',
			type:'post',
			data:{
				'user_name':user_name,
				'user_gender':user_gender
			},
			dataType:'json',
			success:function(data){
				if(data.userList!=null){
					var tbody = $('#table_info').children('tbody').first();
					tbody.empty();
					for(var i=0;i<data.userList.length;i++){
						var user_name = data.userList[i].user_name;
						var user_password = data.userList[i].user_password;
						var user_nickname = data.userList[i].user_nickname;
						var user_gender = data.userList[i].user_gender;
						var user_birthday = data.userList[i].user_birthday;
						
						if(user_gender==0){
							user_gender='男';
						}else{
							user_gender='女';
						}
							
						
						tbody.append("<tr><td><input name='nid' type='checkbox' value=${user.user_id}/></td><td>"+user_name+"</td><td>"+user_password+"</td><td>"+user_nickname+"</td><td>"+user_gender+"</td><td>"+user_birthday+"</td><td><a style='color:red'>详情</a></td></tr>")
					}
				}
			}
			
			
		});
		
	});
	
	
});

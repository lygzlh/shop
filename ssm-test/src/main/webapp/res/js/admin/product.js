$(function(){
	
	$('#add').click(function(){
		var product_type = $('#product_type').val();
		var state = $('input[name=state]:checked').val();
		var product_name = $('#product_name').val();
		var product_title = $('#product_title').val();
		var product_price = $('#product_price').val();
		var product_sales = $('#product_sales').val();
		var product_id = $('#product_id').val();
		var file = $('.upload').attr('src');

		$.ajax({
			url:'/ssm-test/allProduct',
			type:'post',
			data:{
				'product_type':product_type,
				'state':state,
				'product_name':product_name,
				'product_title':product_title,
				'product_price':product_price,
				'product_sales':product_sales,
				'product_id':product_id,
				'file':file
			},
			dataType:'json',
			success:function(data){
				if(data.success){
					alert('添加成功');
					ajaxUtil.getPage('allProduct',null,false);
				}
			}
		});
	});
		
}



);

function uploadImage(fileDom){

    //获取文件
    var file = fileDom.files[0];
    //判断类型x

    var type="single";

    //清空值
    $(fileDom).val('');
    var formData = new FormData();
    formData.append("file", file);
    formData.append("imageType", type);
    //上传图片
    $.ajax({
        url: "/ssm-test/admin/uploadProductImage",
        type: "post",
        data: formData,
        contentType: false,
        processData: false,
        dataType: "json",
        mimeType: "multipart/form-data",
        success: function (data) {
            $(fileDom).attr("disabled", false).prev("span").text("上传图片");
            if (data.success) {
   
                    $(fileDom).parent('.details_picList_fileUpload').before("<li><img class='upload' src='/ssm-test/res/image/item/productSinglePicture/" + data.fileName + "' width='128px' height='128px' name='new'/></li>");
                    
               
            } else {
                alert("图片上传异常！");
            }
        },
        beforeSend: function () {
            $(fileDom).attr("disabled", true).prev("span").text("图片上传中...");
        },
        error: function () {

        }
    });
}
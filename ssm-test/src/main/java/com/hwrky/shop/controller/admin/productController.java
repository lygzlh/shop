package com.hwrky.shop.controller.admin;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.hwrky.shop.entity.Product;
import com.hwrky.shop.entity.User;
import com.hwrky.shop.service.ProductService;
import com.hwrky.shop.service.UserService;
import com.jsptags.navigation.pager.parser.ParseException;

@Controller
public class productController {
	 protected Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
	@Resource(name="productService")
	private ProductService productService;
	/**
	 * 添加商品
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "allProduct", method = RequestMethod.GET)
	public String goToPage(Map<String, Object> map) {
		
		//List<User> users = userService.selectAll();
		//map.put("userList",users);	
		return "admin/productManagePage";
	}
	

	@ResponseBody
	@RequestMapping(value = "allProduct", method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
	public String getDataBy(
			@RequestParam(value = "product_type") String product_type ,
			@RequestParam(value = "state") String state ,
			@RequestParam(value = "product_name") String product_name ,
			@RequestParam(value = "product_title") String product_title ,
			@RequestParam(value = "product_price") Double product_price ,
			@RequestParam(value = "file") String file ,
			@RequestParam(value = "product_sales") Double product_sales) throws ParseException {
		/**
		 * 获取商品数据存入数据库
		 */
		System.out.println(product_type+","+state+","+product_name+","+product_title+","+product_price+","+product_sales);
		Date date = new Date();
		String product_id = UUID.randomUUID() + "";
		Product product = new Product()
				.setProduct_type(product_type)
				.setState(state)
				.setProduct_name(product_name)
				.setProduct_title(product_title)
				.setProduct_price(product_price)
				.setProduct_id(product_id)
				.setProduct_sales(product_sales)
				.setProduct_date(date)
				.setProduct_url(file);
		JSONObject object = new JSONObject();
		if(productService.add(product)) {
			object.put("success", true);
			System.out.println("成功");
		}else {
			object.put("success", false);
			System.out.println("失败");
		}
		
		return object.toJSONString();
	}

	 //上传产品图片-ajax
    @ResponseBody
    @RequestMapping(value = "admin/uploadProductImage", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public String uploadProductImage(@RequestParam MultipartFile file, @RequestParam String imageType, HttpSession session) {
        String originalFileName = file.getOriginalFilename();
        System.out.println(file);
        logger.info("获取图片原始文件名：{}", originalFileName);
        String extension = originalFileName.substring(originalFileName.lastIndexOf('.'));
        String filePath;
        String fileName = UUID.randomUUID() + extension;
        System.out.println(session.getServletContext().getRealPath("/"));
        filePath = session.getServletContext().getRealPath("/").replace("\\", "/") + "res/image/item/productSinglePicture/" + fileName;
        System.out.println(filePath);
        logger.info("文件上传路径：{}", filePath);
        JSONObject object = new JSONObject();
        try {
            logger.info("文件上传中...");
            System.out.println("文件上传中...");
            file.transferTo(new File(filePath));
            
            System.out.println("文件上传完成");
            logger.info("文件上传完成");
            object.put("success", true);
            object.put("fileName", fileName);
        } catch (IOException e) {
            logger.warn("文件上传失败！");
            e.printStackTrace();
            object.put("success", false);
        }

        return object.toJSONString();
    }
    
    

	
}

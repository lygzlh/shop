package com.hwrky.shop.controller.fore;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hwrky.shop.entity.Product;
import com.hwrky.shop.service.ProductService;

@Controller
public class ForeHomeController {
	@Resource(name="productService")
	private ProductService productService;
	
	/**
	 * 系统首页
	 * @param session
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String goToPage(HttpSession session,Map<String, Object> map) {
		List<Product> products = productService.selectAll();
		map.put("productList",products);	
		return "fore/homePage";
	}
}

package com.hwrky.shop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
	/**
	 * 后台首页
	 */
	
	@RequestMapping(value = "admin", method = RequestMethod.GET)
	public String goToPage() {
		return "admin/homePage";
	}
	
}

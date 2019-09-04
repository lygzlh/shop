package com.hwrky.shop.controller.admin;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.hwrky.shop.entity.Product;
import com.hwrky.shop.entity.User;
import com.hwrky.shop.service.UserService;
import com.jsptags.navigation.pager.parser.ParseException;

@Controller
public class UserController {
	@Resource(name="userService")
	private UserService userService;
	/**
	 * 用户列表
	 * @return
	 */
	
	@RequestMapping(value = "user", method = RequestMethod.GET)
	public String goToPage(Map<String, Object> map) {
		
		List<User> users = userService.selectAll();
		map.put("userList",users);	
		return "admin/userManagePage";
	}
	
	@ResponseBody
	@RequestMapping(value = "user", method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
	public String getDataBy(
			@RequestParam(value = "user_name") String user_name ,
			@RequestParam(value = "user_gender") String user_gender) throws ParseException {
		/**
		 * 获取满足条件的信息
		 */
		System.out.println(user_name+","+user_gender);
		List<User> users = userService.selectUser(user_name,user_gender);
		JSONObject object = new JSONObject();
		object.put("userList", users);

		
		return object.toJSONString();
	}
	
}

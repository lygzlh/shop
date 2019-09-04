package com.hwrky.shop.controller.fore;

import java.text.SimpleDateFormat;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.hwrky.shop.entity.User;
import com.hwrky.shop.service.UserService;
import com.jsptags.navigation.pager.parser.ParseException;

@Controller
public class ForeRegisterController {
	@Resource(name="userService")
	private UserService userService;
	
	/**
	 * 注册界面
	 * @param session
	 * @param map
	 * @return
	 */
	
	
	@RequestMapping(value="register",method = RequestMethod.GET)
	public String goToPage(HttpSession session,Map<String, Object> map) {
		return "fore/register";
	}
	
	 @ResponseBody
	 @RequestMapping(value = "/register/doRegister", method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
	public String doRegister(@RequestParam(value = "user_name") String user_name  /*用户名 */,
            @RequestParam(value = "user_nickname") String user_nickname  /*用户昵称 */,
            @RequestParam(value = "user_password") String user_password  /*用户密码*/,
            @RequestParam(value = "user_gender") String user_gender  /*用户性别*/,
            @RequestParam(value = "user_birthday") String user_birthday /*用户生日*/) throws ParseException, NumberFormatException, java.text.ParseException{
		
		//取数据
		System.out.println(user_name+" ,"+user_password+" ,"+user_nickname+" ,"+user_birthday+" ,"+user_gender);
		
		User user = new User()
				.setUser_name(user_name)
				.setUser_nickname(user_nickname)
				.setUser_password(user_password)
				.setUser_gender(Byte.valueOf(user_gender))
				.setUser_birthday(new SimpleDateFormat("yyyy-MM-dd").parse(user_birthday));
		JSONObject object = new JSONObject();
		if(userService.add(user)) {
			//注册成功
			object.put("success", true);
			System.out.println("成功");
		}else {
			object.put("success", false);
		}
		return object.toJSONString();
	}
}

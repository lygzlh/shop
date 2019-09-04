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
public class ForeLoginController {
	@Resource(name="userService")
	private UserService userService;
	/**
	 * 登录界面
	 * @param session
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String goToPage(HttpSession session,Map<String, Object> map) {
		return "fore/loginPage";
	}

	
	@ResponseBody
	 @RequestMapping(value = "/login/doLogin", method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
	public String doLogin(@RequestParam(value = "user_name") String user_name  /*用户名 */,
              @RequestParam(value = "password") String user_password  /*用户密码*/) throws ParseException, NumberFormatException, java.text.ParseException{
		
		//取数据
		System.out.println(user_name+" ,"+user_password );
		User user =  userService.select(user_name, user_password); 
		JSONObject object = new JSONObject();
		

		if(user!=null) {
			object.put("success",true);
			System.out.println("成功");
		}else{
			object.put("success",false);
			System.out.println("失败");
			
		}
		//return "fore/homePage";
		return object.toJSONString();
		

	}
}
	


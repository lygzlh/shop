package com.hwrky.shop.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	 //转到前台易优购-登录页
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String goToPage(HttpSession session, Map<String, Object> map) {

        return "test/hello";
    }
}
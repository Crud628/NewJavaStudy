package com.ky.shop.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ky.shop.entity.User;
import com.ky.shop.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("ulogin")
	@ResponseBody
	private Map<String,Object> uLogin(User user){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		boolean flag = userService.selectUserByNameAndPwd(user);
		if(flag) {
			modelMap.put("success", true);
			modelMap.put("username", user.getName());
		}else {
			modelMap.put("success", false);
		}
		return modelMap;
	}
	
	@RequestMapping("uregist")
	@ResponseBody
	private Map<String,Object> uRegist(User user){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		boolean flag = userService.userRegist(user);
		if(flag) {
			modelMap.put("success", true);
			modelMap.put("redirect", "login.html");
		}else {
			modelMap.put("success", false);
		}
		return modelMap;
	}
	
	
}

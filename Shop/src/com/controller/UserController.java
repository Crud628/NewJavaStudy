package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.User;
import com.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("regist")
	@ResponseBody
	public String registUser(User user) {
		int effectiveNum = userService.registUser(user);
		if (effectiveNum <= 0) {
			return "注册失败";
		} else {
			return "注册成功";
		}

	}
	@RequestMapping("nameCheck")
	@ResponseBody
	public boolean nameCheck(String username) {
		System.out.println(username);
		String result = userService.nameCheck(username);
		if(result == null) {
			return true;
		}
		return false;
	}
	
	
	@RequestMapping("login")
	@ResponseBody
	public String userLogin(User user) {
		String name = userService.userLogin(user);
		if(name != null) {
			return name;
		}
		return null;
	}

}

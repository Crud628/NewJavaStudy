package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.User;
import com.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService service;
	
	
	@RequestMapping("registUser")
//	public void registUser(@RequestParam("input_01")String username,@RequestParam("input_02")String userpass) {
	public String registUser(User user) {
//		System.out.println( user.getUser_id()+" "+user.getUser_name()+" "+user.getUser_pass()+" registUser run");
		int result = service.registUser(user);
		if(result!=0) {
			//成功
			return "a";
		}else {
			return "redirect:/html/b.html";
			//失败
		}
	}
}

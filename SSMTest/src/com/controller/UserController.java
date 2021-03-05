package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	@RequestMapping("tr")
	public String trasactionTest(@RequestParam("user_name")String[] usernames,@RequestParam("user_pass")String[] userpass) {
		List<User> list = new ArrayList<User>();
		for(int index=0;index<usernames.length-1;index++) {
			list.add(new User(usernames[index],userpass[index]));
		}
		//boolean flag = service.transactionTest(list);
		boolean flag = service.insertUsers(list);
		if(flag) {
			return "redirect:/html/a.html";
		}else {
			return "redirect:/html/b.html";
		}
	}
}

package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Member;
import com.service.MemberService;

@RestController
public class MemberController {
	@Autowired
	private MemberService memberservice;
	
	@RequestMapping("getMemberList")
	@ResponseBody
	public List<Member> getMemberList(){
		List<Member> list = memberservice.getMemberList();
		return list;
	}
	
	
	
}

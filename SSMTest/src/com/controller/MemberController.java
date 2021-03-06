package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Member;
import com.entity.PageBean;
import com.github.pagehelper.PageInfo;
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
	
	@RequestMapping("delMembers")
	@ResponseBody
	public String delMembers(@RequestParam("ids")String[] ids) {
		boolean flag = memberservice.delMembers(ids);
		if(flag) {
			return "1";
		}else {
			return "2";
		}
	}
	
	@RequestMapping("getMemberPage")
	@ResponseBody
	public PageBean<Member> getMemberPage(@RequestParam("pageNum")int i){
		PageBean<Member> list = memberservice.memberQueryByPage(i);
		return list;
	}
	
	
	@RequestMapping("getMemberPages")
	@ResponseBody
	public PageInfo<Member> getMemberPages(int parseInt){
		System.out.println("run");
		PageInfo<Member> page = memberservice.memberQueryByPagehelper(parseInt);
		//System.out.println(1/0);
		return page;
	}
	
	@RequestMapping("getMemberPage2")
	@ResponseBody
	public List<Member> getMemberPage2(@RequestParam("uname")String uname,
			@RequestParam("salary1")Integer salary1,
			@RequestParam("salary2")Integer salary2){
		List<Member> page = memberservice.memberQuery2(uname,salary1,salary2);
		return page;
	}
	
	@RequestMapping("getMemberPage3")
	@ResponseBody
	public PageInfo<Member> getMemberPage3(@RequestParam("uname")String uname,
			@RequestParam("salary1")Integer salary1,
			@RequestParam("salary2")Integer salary2,
			@RequestParam("pageNum")Integer pageNum,
			@RequestParam("dep")String dep){
		if(pageNum==null) {
			pageNum=1;
		}
		PageInfo<Member> page = memberservice.memberQuery3(uname,salary1,salary2,pageNum,dep);
		return page;
	}
	
}

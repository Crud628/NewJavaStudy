package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Member;
import com.entity.PageBean;
import com.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public List<Member> getMemberList() {
		// TODO Auto-generated method stub
		return memberMapper.getMemberList();
	}

	@Override
	public boolean delMembers(String[] ids) {
		// TODO Auto-generated method stub
		return memberMapper.delMembers(ids);
	}

	@Override
	public List<Member> getMemberPage(int i) {
		// TODO Auto-generated method stub
		int start = (i-1)*5;
		int step = 5;
		return memberMapper.getMemberPage(start,step);
	}
	
	//PageBean分页
	@Override
	public PageBean<Member> memberQueryByPage(int pageNum) {
		// TODO Auto-generated method stub
		List<Member> member_all=memberMapper.getMemberList();
		int rows=5;
		
		PageBean<Member> pageBean=new PageBean<Member>();
		pageBean.setRows(rows); //每页数据条数
		pageBean.setCurrentPage(pageNum);  //当前页数
		pageBean.setTotalRows(member_all.size());  //总数据条数
		//总页数
		pageBean.setTotalPage((member_all.size()%rows==0)?member_all.size()/rows:member_all.size()/rows+1);
		//当前页数据
		pageBean.setList(member_all.subList((pageNum-1)*5,(member_all.size()<pageNum*5)?member_all.size():pageNum*5));		
		return pageBean;
	}


}

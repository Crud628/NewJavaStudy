package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Member;
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

}

package com.service;

import java.util.List;

import com.entity.Member;

public interface MemberService {
	
	List<Member> getMemberList();

	boolean delMembers(String[] ids);

	List<Member> getMemberPage(int i);
}

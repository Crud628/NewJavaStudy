package com.mapper;

import java.util.List;

import com.entity.Member;

public interface MemberMapper {
	
	
	List<Member> getMemberList();

	boolean delMembers(String[] ids);
}

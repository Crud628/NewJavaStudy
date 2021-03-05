package com.service;

import java.util.List;

import com.entity.Member;
import com.entity.PageBean;

public interface MemberService {
	
	List<Member> getMemberList();

	boolean delMembers(String[] ids);

	List<Member> getMemberPage(int i);

	PageBean<Member> memberQueryByPage(int pageNum);
}

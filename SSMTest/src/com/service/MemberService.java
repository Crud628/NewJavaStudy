package com.service;

import java.util.List;

import com.entity.Member;
import com.entity.PageBean;
import com.github.pagehelper.PageInfo;

public interface MemberService {
	
	List<Member> getMemberList();

	boolean delMembers(String[] ids);

	List<Member> getMemberPage(int i);

	PageBean<Member> memberQueryByPage(int pageNum);

	PageInfo<Member> memberQueryByPagehelper(int parseInt);
}

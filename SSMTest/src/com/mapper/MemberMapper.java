package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.Member;

public interface MemberMapper {
	
	
	List<Member> getMemberList();

	boolean delMembers(String[] ids);

	List<Member> getMemberPage(int start,int step);

	List<Member> memberQuery2(String uname, Integer salary1, Integer salary2);

	List<Member> memberQuery3(@Param("uname")String uname, @Param("salary1")Integer salary1, @Param("salary2")Integer salary2, @Param("dep")String dep);

}

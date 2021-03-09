package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Member;
import com.entity.PageBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
	
	//PageBean鍒嗛〉
	@Override
	public PageBean<Member> memberQueryByPage(int pageNum) {
		// TODO Auto-generated method stub
		List<Member> member_all=memberMapper.getMemberList();
		int rows=5;
		
		PageBean<Member> pageBean=new PageBean<Member>();
		pageBean.setRows(rows); //姣忛〉鏁版嵁鏉℃暟
		pageBean.setCurrentPage(pageNum);  //褰撳墠椤垫暟
		pageBean.setTotalRows(member_all.size());  //鎬绘暟鎹潯鏁�
		//鎬婚〉鏁�
		pageBean.setTotalPage((member_all.size()%rows==0)?member_all.size()/rows:member_all.size()/rows+1);
		//褰撳墠椤垫暟鎹�
		pageBean.setList(member_all.subList((pageNum-1)*5,(member_all.size()<pageNum*5)?member_all.size():pageNum*5));		
		return pageBean;
	}

	@Override
	public PageInfo<Member> memberQueryByPagehelper(int parseInt) {
		// TODO Auto-generated method stub
		PageHelper.startPage(parseInt,5);
		List<Member> member_all = memberMapper.getMemberList();
		PageInfo<Member> pageinfo = new PageInfo<Member>(member_all);
		return pageinfo;
	}


}

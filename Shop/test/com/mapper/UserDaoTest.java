package com.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoTest extends BaseTest{
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testNameCheck() {
		String name = "333";
		System.out.println("-----------------------------------------------");
		System.out.println(userMapper.nameCheck(name));
		System.out.println("--------------------------------------------------");
	}
}

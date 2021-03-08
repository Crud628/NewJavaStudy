package com.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mapper.BaseTest;
import com.mapper.UserMapper;

public class UserServiceTest extends BaseTest{
	@Autowired
	private UserMapper usermapper;
	
	@Test
	public void UserServiceTests() {
		System.out.println(usermapper.nameCheck("333"));
	}
}

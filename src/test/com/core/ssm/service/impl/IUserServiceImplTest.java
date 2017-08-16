package com.core.ssm.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.core.ssm.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class IUserServiceImplTest {
	private static Logger logger = Logger.getLogger(IUserServiceImplTest.class);
	
	@Resource
	private IUserService userService;
	@Test
	public void testGetUserById() {
		logger.info(JSON.toJSON(userService.getUserById(1)));
	}

}

package com.luo.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.csii.user.domain.User;
import com.csii.user.service.UserService;

public class ConsumerServiceTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"application.xml"});
		applicationContext.start();
		TestService testService = (TestService) applicationContext.getBean("testService");
		System.out.println("调用RPC方法："+testService.getName());
		
		UserService userService = (UserService) applicationContext.getBean("userService");
		User user = userService.getUser("123456");
		System.out.println(user.toString());
	}
}

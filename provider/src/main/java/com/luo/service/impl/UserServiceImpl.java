package com.luo.service.impl;

import com.csii.user.domain.User;
import com.csii.user.service.UserService;

public class UserServiceImpl implements UserService{

	public User getUser(String userId) {
		User user = new User();
		user.setUserName("程永");
		user.setAge(18);
		user.setUserId(userId);
		user.setAddress("中国-北京");
		return user;
	}

	public int addUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}

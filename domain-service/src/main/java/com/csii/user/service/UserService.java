package com.csii.user.service;

import com.csii.user.domain.User;

/**
 * 用户服务接口
 * @author lenovo
 *
 */
public interface UserService {

	/**
	 * 查询用户
	 * @param userId 用户id
	 * @return
	 */
	public User getUser(String userId);
	
	/**
	 * 新增用户
	 * @param user 用户
	 * @return
	 */
	public int addUser(User user);
}

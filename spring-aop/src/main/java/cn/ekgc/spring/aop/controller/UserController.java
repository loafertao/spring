package cn.ekgc.spring.aop.controller;

import cn.ekgc.spring.aop.service.UserService;

public class UserController {
	private UserService userService;

	public void createUser() {
		userService.saveUser();
	}
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}

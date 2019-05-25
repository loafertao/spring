package cn.ekgc.spring.aop.service.impl;

import java.util.Date;

import cn.ekgc.spring.aop.service.UserService;

public class UserServiceImpl implements UserService {

	public void saveUser() {
		System.out.println("保存user对象" + new Date());
	}

}

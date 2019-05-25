package cn.ekgc.spring.aop.log;

import java.util.Date;

public class UserLogger {
	
	public void saveUserBefore() {
		System.out.println("开始保存user信息" + new Date());
	}
	
	public void saveUserAfter() {
		System.out.println("结束保存user信息" + new Date());
	}

}

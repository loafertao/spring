package cn.ekgc.spring.aop.dao.impl;

import java.util.Date;

import org.springframework.stereotype.Repository;

import cn.ekgc.spring.aop.dao.StudentDao;
@Repository("studentDao")
public class StudentDaoImpl implements StudentDao{

	public void saveStudent() {
		System.out.println("StudentDao存储student对象"+ new Date());
		
	}

}

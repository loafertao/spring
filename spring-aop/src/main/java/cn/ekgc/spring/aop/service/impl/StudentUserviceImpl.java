package cn.ekgc.spring.aop.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.ekgc.spring.aop.dao.StudentDao;
import cn.ekgc.spring.aop.service.StudentService;
@Service("studentService")
public class StudentUserviceImpl implements StudentService {
	@Resource(name = "studentDao")
	private StudentDao studentDao;
	public void saveStudent() {
	System.out.println("StudentService存储student对象" + new Date());
		studentDao.saveStudent();
	}

}

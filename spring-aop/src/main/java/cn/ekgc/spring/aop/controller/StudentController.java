package cn.ekgc.spring.aop.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.ekgc.spring.aop.service.StudentService;
@Component("studentController")
public class StudentController {
	@Resource(name = "studentService")
	private StudentService studentService;
	public void saveStudent() {
		System.out.println("StudentController储存student对象" + new Date());
		studentService.saveStudent();
	}

}

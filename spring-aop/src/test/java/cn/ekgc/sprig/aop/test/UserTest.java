package cn.ekgc.sprig.aop.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ekgc.spring.aop.controller.StudentController;
import cn.ekgc.spring.aop.controller.UserController;

public class UserTest {
	private ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-aop.xml");
	
	@Test
	public void userTest() {
		UserController  controller = (UserController) context.getBean("userController");
		controller.createUser();
	}
	@Test
	public void studentTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentController controller = (StudentController) context.getBean("studentController");
		controller.saveStudent();
	}

}

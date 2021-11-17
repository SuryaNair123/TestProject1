package com.journaldev.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.journaldev.spring.service.EmployeeService;

public class SpringMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		
		System.out.println(employeeService.getEmployee().getName());
		System.out.println("Testing repo changes from repo");
		
		System.out.println("Testing from local to commit changes to repo");
		
		employeeService.getEmployee().setName("suria");
		
		employeeService.getEmployee().throwException();
		
		ctx.close();
	}

}

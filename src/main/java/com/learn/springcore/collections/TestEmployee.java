package com.learn.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		
		ApplicationContext employeeContext = new ClassPathXmlApplicationContext("com/learn/springcore/collections/collectionconfig.xml");
		Employee emp1 = (Employee) employeeContext.getBean("employee1");
		System.out.println(emp1.getEmployeeName());
		System.out.println(emp1.getEmployeePhones());
		System.out.println(emp1.getEmployeeAddress());
		System.out.println(emp1.getEmployeeCourses());
		System.out.println(emp1.getDatabaseProperties());

	}

}

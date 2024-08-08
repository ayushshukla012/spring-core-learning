package com.learn.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Sample Project to learn Spring Core
 *
 */
public class App {
	/* Application context is a interface */
	private static ApplicationContext studentContext;

	public static void main(String[] args) {
		System.out.println("Hello World!");
		/* Instantiating the context */
		studentContext = new ClassPathXmlApplicationContext("config.xml");
		/* From object of ApplicationContext call the name of bean by getBean method. */
		Student student1 = (Student) studentContext.getBean("studentA");
		Student student2 = (Student) studentContext.getBean("studentB");
		/*
		 * Directly printing the object which will print the value from toString()
		 * methods.
		 */
		System.out.println(student1);
		System.out.println(student2);
	}
}

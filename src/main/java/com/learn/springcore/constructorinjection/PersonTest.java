package com.learn.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
	
	ApplicationContext personContext = new ClassPathXmlApplicationContext("com/learn/springcore/constructorinjection/constructorinjectionconfig.xml");
	Person pObject = (Person) personContext.getBean("constInject1");
	System.out.println(pObject);
	
	/*
	 * Checking the concept of Ambiguity problem and its solution with COnstructor
	 * Injection
	 */
	Addition addHere = (Addition) personContext.getBean("add1");
	addHere.doSum();

	}

}

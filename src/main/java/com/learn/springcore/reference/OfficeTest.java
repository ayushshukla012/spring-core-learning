package com.learn.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OfficeTest {

	public static void main(String[] args) {

		ApplicationContext officeContext = new ClassPathXmlApplicationContext("com/learn/springcore/reference/referenceconfig.xml");
		Office tempOffice = (Office) officeContext.getBean("officeReference1");
		System.out.println(tempOffice.getOperations());
		System.out.println(tempOffice.getClass());
		System.out.println(tempOffice.getDept());
		

	}

}

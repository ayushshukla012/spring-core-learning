package com.learn.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Beans works parallely so printed data may overlap one over another
 * Upon run 1 index means using XML technique to handle lifecycle
 * Upon run 2 index means using Spring Interface technique to handle lifecycle
 * Upon run 3 index means using Annotation technique to handle lifecycle
*/
public class TestFood {

	public static void main(String[] args) {
		AbstractApplicationContext foodContext = new ClassPathXmlApplicationContext("com/learn/springcore/lifecycle/foodconfig.xml");
		Samosa details = (Samosa) foodContext.getBean("sam1");
		System.out.println(details);

		/*
		 * 1. To call the destroy method of Samosa class given inside the "sam1" bean I
		 * need to use AbstractApplicationContext inplace of ApplicationContext
		 * as it provides additional hook for shutdown.
		 * 2. Name of "init" and "destroy" method from Samosa class can be changed but 
		 * the name must be given inside the bean to handle initialization and destroy 
		 * of bean.
		 */
		foodContext.registerShutdownHook();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Pepsi cokeContext = (Pepsi) foodContext.getBean("coke1");
		System.out.println(cokeContext);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Maggi maggiContext = (Maggi) foodContext.getBean("maggiFlavor1");
		System.out.println(maggiContext);
	}

}

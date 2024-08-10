package com.learn.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/* 1. Here used Annotations Technique to configure and handle lifecycle of bean.
 * 2. If using above Java 8 to use the init and destroy method with this technique
 * we need to add a dependency added in pom.xml file.abstract
 * 3. The init method is called PostConstruct and destroy method is called PreDestroy
 * 4. To display the annotation technique in foodconfig.xml file add <context:annotation-config/> property
*/
public class Maggi {
	private String flavour;

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public Maggi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "3. Maggi [flavour=" + flavour + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("3. Starting method : init.");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("3. Ending method : destroy.");
	}
	
}

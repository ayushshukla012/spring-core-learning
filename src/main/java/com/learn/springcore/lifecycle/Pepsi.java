package com.learn.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


/* 1. Here used Spring Interface Technique to configure and handle lifecycle of bean.
 * 2. All the handling of lifecycle remain in this class only.
 * 3. Implemented "InitializingBean" interface which gives afterPropertiesSet() and handle initialization.
 * 4. Implemented "DisposableBean" interface which gives destroy() and handle cleanup or destroy of object.
 * */

public class Pepsi implements InitializingBean,DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "2. Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		// Called on init
		System.out.println("2. taking Pepsi: init");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		// Called on destroy
		System.out.println("2. Going to call destroy: pepsi bye");
		
	}
	
}

package com.learn.springcore.lifecycle;

/*1. Here used XML Technique to configure and handle lifecycle of bean.
 *2.  In this init() to initialize the object and destroy() to cleanup the object
 * are given in this class and used in bean named "sam1". 
 * 3. Use foodContext.registerShutdownHook(); in main method to call the destroy method.
 * */
public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("1. Setting price..");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "1. Samosa [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("1. Inside init method");
	}
	
	public void destroy() {
		System.out.println("1. Inside destroy method");
	}
	
}

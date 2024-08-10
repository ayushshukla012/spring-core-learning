package com.learn.springcore.constructorinjection;

public class Addition {
	private int aVariable;
	private int bVariable;
	
	// Using constructor overloading in ambiguity problem for constructor injection
	
	public Addition(double a, double b) {
		this.aVariable = (int)a;
		this.bVariable = (int)b;
		System.out.println("Constructor2 : double , double");
	}
	
	public Addition(int a, int b) {
		this.aVariable = a;
		this.bVariable = b;
		System.out.println("Constructor1 : int , int");
	}
	
	public Addition(String a, String b) {
		this.aVariable = Integer.parseInt(a);
		this.bVariable = Integer.parseInt(b);
		System.out.println("Constructor1 : String , String");
	}
	

	
	public void doSum() {
		System.out.println("Sum is= " + (this.aVariable + this.bVariable));
		System.out.println("Value of a = " + this.aVariable);
		System.out.println("Value of b = " + this.bVariable);
	}
}

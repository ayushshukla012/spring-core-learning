package com.learn.springcore.reference;

public class Office {
	private int operations;
	private Department dept;
	
	public int getOperations() {
		return operations;
	}
	public void setOperations(int operations) {
		this.operations = operations;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Office() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Office(int operations, Department dept) {
		super();
		this.operations = operations;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Office [operations=" + operations + ", dept=" + dept + "]";
	}
	
}

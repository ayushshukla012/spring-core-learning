package com.learn.springcore.reference;

public class Department {
	private int managerId;

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public Department(int managerId) {
		super();
		this.managerId = managerId;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Department [managerId=" + managerId + "]";
	}
	
}

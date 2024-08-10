package com.learn.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private String employeeName;
	private List<String> employeePhones;
	private Set<String> employeeAddress;
	private Map<String, String> employeeCourses;
	private Properties databaseProperties;
	public Properties getDatabaseProperties() {
		return databaseProperties;
	}
	public void setDatabaseProperties(Properties databaseProperties) {
		this.databaseProperties = databaseProperties;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public List<String> getEmployeePhones() {
		return employeePhones;
	}
	public void setEmployeePhones(List<String> employeePhones) {
		this.employeePhones = employeePhones;
	}
	public Set<String> getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(Set<String> employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public Map<String, String> getEmployeeCourses() {
		return employeeCourses;
	}
	public void setEmployeeCourses(Map<String, String> employeeCourses) {
		this.employeeCourses = employeeCourses;
	}
	public Employee(String employeeName, List<String> employeePhones, Set<String> employeeAddress,
			Map<String, String> employeeCourses, Properties databaseProperties) {
		super();
		this.employeeName = employeeName;
		this.employeePhones = employeePhones;
		this.employeeAddress = employeeAddress;
		this.employeeCourses = employeeCourses;
		this.databaseProperties = databaseProperties;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeePhones=" + employeePhones + ", employeeAddress="
				+ employeeAddress + ", employeeCourses=" + employeeCourses + ", databaseProperties="
				+ databaseProperties + "]";
	}
	
}

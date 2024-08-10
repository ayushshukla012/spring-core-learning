package com.learn.springcore.constructorinjection;

import java.util.List;

public class Person {
	private String personName;
	private int personId;
	private Certificate personCertificate;
	private List<String> personList;
	
	public Person(String name, int pId, Certificate pCertificate, List<String> pList) {
		this.personName = name;
		this.personId = pId;
		this.personCertificate = pCertificate;
		this.personList = pList;
	}
	
	public String toString() {
		return this.personName + " : " + this.personId + " : " + this.personCertificate.name + " : " + this.personList.toString();
	}
}

package com.learnandpush.model;
/*model for our customer*/

import java.sql.Timestamp;

public class Customer {

	int custId;

	public Customer(int ID, String NAME, int AGE) {
		this.custId = ID;
		this.name = NAME;
		this.age = AGE;

		// TODO Auto-generated constructor stub
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	String name;
	int age;
}

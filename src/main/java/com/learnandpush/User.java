/*implementing this to understand how POJO(plain old java object works)*/
package com.learnandpush;

public class User {

	private int Id;
	private String Name;
	private String Dept;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

}

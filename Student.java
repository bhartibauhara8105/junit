package com.niit.mockito;

public class Student {
	private String rollNo;
	private String firstname;
	private String lastname;
	private String dept;
	
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String toString()
	{
		return "\nRollNo :"+rollNo+"\n FirstName :"+firstname+"\n LastName :"+lastname+"\n Dept :"+dept;
	}
	

}

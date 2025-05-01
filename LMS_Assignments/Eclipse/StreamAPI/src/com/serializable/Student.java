package com.serializable;

public class Student extends Person {
	private String PRN;
	transient private int age;
	Course course;

	public Student() {
		PRN="";
		age=0;
		course=new Course();
	}
	
	public Student(String prn,int age,int cid,String cname,double fees) {
		this.PRN=prn;
		this.age=age;
		this.course=new Course(cid,cname,fees); 
	}

	@Override
	public String toString() {
		return "Student [PRN=" + PRN + ", age=" + age + ", course=" + course + "]";
	}
	
	
}

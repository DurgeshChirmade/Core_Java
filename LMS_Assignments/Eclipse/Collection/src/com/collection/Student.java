package com.collection;

import java.util.Objects;

public class Student {
	private int studentid;
	private String name;
	private String city;
	private float percentage;
	
	public Student() {
		super();
	}

	public Student(int studentid, String name, String city, float percentage) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.city = city;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + ", city=" + city + ", percentage=" + percentage
				+ "]";
	}

	@Override
	public int hashCode() {
		int code=0;
		if(city.equals("Pune")) {
			code=10;
		}
		else if(city.equals("Solapur")) {
			code=20;
		}
		else if(city.equals("Nashik")) {
			code=30;
		}
		else if(city.equals("Mumbai")){
			code=40;
		}
		return code;
	}

	@Override
	public boolean equals(Object obj) {
		boolean flag=false;
		if(obj instanceof Student) {
			Student s = (Student)obj;
			
			if(this.city==s.city) {
				flag=true;
			}
		}
		return flag;
	}
	
	

}

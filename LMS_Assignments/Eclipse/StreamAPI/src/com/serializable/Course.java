package com.serializable;

import java.io.Serializable;

public class Course implements Serializable {
	private int courseid;
	private String coursename;
	private double fees;

	public Course() {

	}

	public Course(int courseid, String coursename, double fees) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.fees = fees;
	}
	
	public void display() {
		System.out.println(courseid+" "+coursename+" "+fees);
	}

	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename + ", fees=" + fees + "]";
	}
	
	
	
}

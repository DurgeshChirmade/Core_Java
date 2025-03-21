package com.stream;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Student{
	private int rollno;
	private String name;
	private double marks;
	
	public Student() {
		this.rollno=0;
		this.name="";
		this.marks=0.0;
	}

	public Student(int rollno, String name, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	void checkGrade() {
		if(marks<40) {
			System.out.println("Fail");
		}
		else {
			if(marks>=41 && marks<=59.99) {
				System.out.println("Pass");
			}
			else if(marks>=60 && marks<=69.99 ) {
				System.out.println("First class");
			}
			else if(marks>=70 && marks<=79.99) {
				System.out.println("Distinction");
			}
			else if(marks>=80 && marks<=99.99) {
				System.out.println("First class with Distinction");
			}
			else {
				System.out.println("Invalid marks");
			}
		}
	}
}

public class ThirdClass {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter your roll number : ");
		int rollno = Integer.parseInt(br.readLine());
		
		System.out.print("Enter your name : ");
		String name = br.readLine();
		
		System.out.print("Enter your marks : ");
		double marks=Double.parseDouble(br.readLine());
		
		Student s = new Student(rollno,name,marks);
		
		s.checkGrade();

	}
	

}

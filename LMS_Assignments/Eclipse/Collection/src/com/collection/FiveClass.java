package com.collection;

import java.util.HashSet;
import java.util.Set;

public class FiveClass {

	public static void main(String[] args) {
		
		Set<Student> s = new HashSet<>();

		s.add(new Student(101,"AAA","Pune",78.65f));
		s.add(new Student(102,"BBB","Pune",57.65f));
		s.add(new Student(103,"CCC","Mumbai",56.45f));
		s.add(new Student(104,"DDD","Nashik",34.56f));
		s.add(new Student(105,"EEE","Solapur",58.34f));
		
		System.out.println("Size : "+s.size());
		
		for(Student st:s) {
			System.out.println(st);
		}
		
	}

}

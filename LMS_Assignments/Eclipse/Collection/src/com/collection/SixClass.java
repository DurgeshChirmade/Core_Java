package com.collection;

import java.util.Set;
import java.util.TreeSet;

public class SixClass {

	public static void main(String[] args) {

		Set<Employee> s = new TreeSet<>();

		s.add(new Employee(101, "AAA", 456745.78));
		s.add(new Employee(102, "BBB", 567823.5656));
		s.add(new Employee(103, "CCC", 456745.78));
		s.add(new Employee(104, "DDD", 787878.7878));
		s.add(new Employee(105, "EEE", 676761.5656));

		for (Employee e : s) {
			System.out.println(e);
		}
	}

}

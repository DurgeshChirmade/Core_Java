package com.collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class NineClass {

	public static void main(String[] args) throws Exception {

		Set<Employees> s = new TreeSet<Employees>(new Comparator<Employees>() {

			@Override
			public int compare(Employees e1, Employees e2) {

				int diff = 0;
				diff = e1.getDept().compareTo(e2.getDept());
				if (diff == 0) {
					diff = (int) (e2.getSalary() - e2.getSalary());
					if (diff == 0) {
						diff = e2.getName().compareTo(e2.getName());
						if (diff == 0) {
							diff = e1.getSid() - e2.getSid();
						}
					}
				}

				return diff;
			}
		});

		s.add(new Employees(101, "AAA", 456745.78, "Science"));
		s.add(new Employees(102, "BBB", 567823.5656, "Maths"));
		s.add(new Employees(103, "CCC", 456745.78, "English"));
		s.add(new Employees(104, "DDD", 787878.7878, "History"));
		s.add(new Employees(105, "EEE", 676761.5656, "Geography"));

		System.out.println(s.size());

		for (Employees e : s) {
			System.out.println(e);
		}

	}

}

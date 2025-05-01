package com.collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ThirteenClass {

	public static void main(String[] args) {

		Set<String> s = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {

				int buff = count(s2) - count(s1);
				if (buff == 0) {
					buff = s1.compareTo(s2);
				}
				return buff;
			}

		});

		s.add("aei");
		s.add("aeio");
		s.add("aeiouaiouio");
		s.add("aioueiou");
		s.add("aeiouaeiou");

		for (String st : s) {
			System.out.println(st);
		}

	}

	public static int count(String s) {
		int cnt = 0;

		for (int i = 0; i < s.length(); i++) {
			s = s.toLowerCase();
			if (s.charAt(i) == 'a') {
				cnt++;
			} else if (s.charAt(i) == 'e') {
				cnt++;
			} else if (s.charAt(i) == 'i') {
				cnt++;
			} else if (s.charAt(i) == 'o') {
				cnt++;
			} else if (s.charAt(i) == 'u') {
				cnt++;
			}
		}
		return cnt;
	}

}

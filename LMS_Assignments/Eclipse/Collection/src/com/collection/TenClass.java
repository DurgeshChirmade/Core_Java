package com.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TenClass {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Set<String> s = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				
				int diff=s1.length()-s2.length();
				if(diff==0) {
					s1.compareTo(s2);
				}
				return diff;
			}
		});

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter your String : ");
			String str = br.readLine();

			s.add(str);
		}

		System.out.println(s);

	}

}

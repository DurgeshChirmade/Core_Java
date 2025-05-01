package com.collection;

import java.util.Map;
import java.util.TreeMap;

public class SixteenClass {

	public static void main(String[] args) {

		String str = "coccacola";

		Map<Character, Integer> map = new TreeMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}

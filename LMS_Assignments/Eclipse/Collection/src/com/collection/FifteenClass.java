package com.collection;

import java.util.Map;
import java.util.TreeMap;

public class FifteenClass {

	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<Integer, String>();

		map.put(101, "XYZ");
		map.put(106, "ASD");
		map.put(103, "QWE");
		map.put(104, "ERT");
		map.put(105, "AQW");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}

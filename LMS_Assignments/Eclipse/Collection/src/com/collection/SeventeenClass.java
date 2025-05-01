package com.collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SeventeenClass {

	public static void main(String[] args) {

		Map<String, Integer> map = new TreeMap<String, Integer>();

		BufferedReader br = null;

		try {
			br = new BufferedReader(
					new FileReader("E:\\CDAC\\PGDAC\\KNOW-IT_Pune\\Daily_Lab\\Core_Java\\LMS_Assignments\\emails.txt"));

			String line;

			while ((line = br.readLine()) != null) {
				String domain = getDomain(line.trim()); // it will send email id line by line to the static function

				if (domain != null) {
					map.put(domain, map.getOrDefault(domain, 0) + 1);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Email domain counts : ");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

	private static String getDomain(String email) {
		int index = email.indexOf('@');

		if (index != -1 && index < email.length() - 1) {
			return email.substring(index + 1);
		}

		return null;
	}

}

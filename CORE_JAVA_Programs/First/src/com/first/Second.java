package com.first;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Second {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter your number : ");
		int num = Integer.parseInt(br.readLine());

		System.out.println("Number : " + num);

	}
}

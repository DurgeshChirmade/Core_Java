package com.reflect;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThirdClass {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter your number : ");
		int num = Integer.parseInt(br.readLine());

		// Create a thread using lambda to print prime numbers from 1 to 100
		Thread t = new Thread(() -> {

			if (num < 2) {
				System.out.println(num + " is not a prime number.");
				return;
			}

			for (int i = 2; i <= num; i++) {
				boolean flag = true;
				for (int j = 2; j < i / 2; j++) {
					if (i % j == 0) {
						flag = false;
						break;
					}
				}

				if (flag) {
					System.out.print(i + " ");
				}
			}
		});

		t.start();
	}

}

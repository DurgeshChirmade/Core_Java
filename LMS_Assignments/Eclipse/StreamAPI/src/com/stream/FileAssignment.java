package com.stream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileAssignment {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter your First number : ");
		int num1 = Integer.parseInt(br.readLine());

		System.out.print("Enter your Second number : ");
		int num2 = Integer.parseInt(br.readLine());

		if (num2 < num1) {
			System.out.println("num2 is greater than num1");
			System.exit(0);
		} else {
			int num = 0;
			FileWriter fr = new FileWriter("prime.txt");
			for (int i = num1; i <= num2; i++) {
				boolean flag = true;
				if (i < 2) {
					flag = false;
					System.exit(0);
				} else {
					for (int j = 2; j <= i/2; j++) {
						if (i % j == 0) {
							flag = false;
							break;
						}
					}
					if (flag == true) {
						System.out.println(i);
						fr.write(String.valueOf(i)+"\n"); //this method write character to the file then it will convert prime number into its ASCII value & write in file, then first convert int into string.
					}
				}
			}
			fr.close();
			System.out.println("Successful writing.");
		}
	}

}

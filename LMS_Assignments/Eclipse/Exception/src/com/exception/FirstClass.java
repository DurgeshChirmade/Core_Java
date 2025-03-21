package com.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstClass {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter your First Number : ");
		int num1 = Integer.parseInt(br.readLine());

		System.out.print("Enter your Second Number : ");
		int num2 = Integer.parseInt(br.readLine());
		
		try {
			int div=num1/num2;
			System.out.println("Division of Two numbers : "+div);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}

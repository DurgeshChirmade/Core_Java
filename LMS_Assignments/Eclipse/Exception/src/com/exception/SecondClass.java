package com.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondClass {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		
		System.out.print("Enter Array size : ");
		int size = Integer.parseInt(br.readLine());
		
		System.out.print("Enter index you want to search : ");
		int index=Integer.parseInt(br.readLine());
		
		try {
			display(size,index);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	public static void display(int size, int index) throws Exception {

		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("Enter Data : ");
			arr[i] = Integer.parseInt(br.readLine());
		}

		if (arr[index]!=0) {
			System.out.println(arr[index] + " is found in array");
		} else {
			System.out.println("Number not found at " + index + " in array.");
		}
	}

}

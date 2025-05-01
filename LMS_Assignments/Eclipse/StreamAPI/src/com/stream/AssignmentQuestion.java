package com.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//check given string is binary number or not & find the given number 
public class AssignmentQuestion {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your string in the form of 0 & 1 : ");
		String bin=br.readLine();
		
		int num=0;
		
		if(bin.length()>=1 && bin.length()<=8) {
			for(int i=bin.length()-1;i>=0;i--) {
				//if(bin.charAt(i)=='0' && bin.charAt(i)=='1') {
					if(bin.charAt(i)=='1') {
						num += Math.pow(2, bin.length()-1-i);
					}
				//}
			}
		}
		
		System.out.println("Binary number "+bin+" into Decimal number : "+num);

	}

}

package com.stream;
//Check given string is palindrome or not.
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Assignment {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter your string : ");
		String str=br.readLine();
		
		boolean flag=true;
		for(int i=0,j=str.length()-1;i<str.length()/2;i++,j--) {
			
			if(str.charAt(i)!=str.charAt(j)) {
				flag=false;
			}
		}
		if(flag==true) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome.");
		}

	}

}

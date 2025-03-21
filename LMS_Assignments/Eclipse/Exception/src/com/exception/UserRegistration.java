package com.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserRegistration {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter User Name : ");
		String username = br.readLine();
		
		System.out.print("Enter User Country : ");
		String userCountry = br.readLine();
		
		registerUser(username, userCountry);
	}
	
	public static void registerUser(String username,String userCountry) {
		
		try {
			if(!(userCountry.equalsIgnoreCase("India"))) {
				throw new InvalidCountryException("User Outside India cannot be registerd.");
			}
			else {
				System.out.println("User registration done successfully.");
			}
		}
		catch(InvalidCountryException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
	}
	
}

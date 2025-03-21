package com.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class characterException extends Exception {

	private String msg;

	public characterException(String msg) {
		super(msg);
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Exception MSG : " + msg;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Special Msg : " + msg;
	}

}

public class FiveClass {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter your First Name : ");
		String fname = br.readLine();

		System.out.print("Enter your Last Name : ");
		String lname = br.readLine();

		boolean flag = false;
		try {
			if (fname.charAt(0) >= 'A' && fname.charAt(0) <= 'Z') {
				for (int i = 1; i < fname.length(); i++) {
					if (fname.charAt(i) >= 'a' && fname.charAt(i) <= 'z') {
						flag = true;
					}
					else {
						break;
					}
				}
			} else {
				throw new characterException("First Name is not in correct form.");
			}

			if (lname.charAt(0) >= 'A' && lname.charAt(0) <= 'Z') {
				for (int i = 1; i < lname.length(); i++) {

					if (lname.charAt(i) >= 'a' && lname.charAt(i) <= 'z') {
						flag = true;
					}
					else {
						break;
					}

				}
			} else {
				throw new characterException("First Name is not in correct form.");
			}

			if (flag) {
				System.out.println("Welcome " + fname + " " + lname);
			} else {
				throw new characterException("name is not in good form.");
			}
		} catch (characterException ce) {
			System.out.println(ce.getMessage());
			System.out.println(ce);
			ce.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
	}

}

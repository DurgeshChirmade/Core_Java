package com.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PasswordTooLongException extends Exception {
	private String msg;

	public PasswordTooLongException(String msg) {
		super(msg);
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return "Exception Message : " + msg;
	}

	@Override
	public String toString() {
		return "Specal Message : " + msg;
	}

}

class PasswordTooShortException extends Exception {
	private String msg;

	public PasswordTooShortException(String msg) {
		super(msg);
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return "Exception Message : " + msg;
	}

	@Override
	public String toString() {
		return "Special Message : " + msg;
	}

}

public class ThirdClass {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter your passowrd : ");
		String pwd = br.readLine();

		try {
			if (pwd.length() > 12) {
				throw new PasswordTooLongException("Password must be less than 12 characters.");
			}
			if (pwd.length() < 8) {
				throw new PasswordTooShortException("password must be greater than 8 characters.");
			}
		} catch (PasswordTooLongException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		} catch (PasswordTooShortException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

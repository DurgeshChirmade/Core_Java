package com.exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class InvalidPwdException extends Exception{
	private String msg;
	
	public InvalidPwdException(String msg) {
		super(msg);
		this.msg=msg;
	}

	@Override
	public String getMessage() {
		return "Exception MSG : "+msg;
	}

	@Override
	public String toString() {
		return "Special Msg : "+msg;
	}
	
	
}

public class SixClass {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your password : ");
		String pwd = br.readLine();
		
		checkPwd(pwd);

	}
	
	public static void checkPwd(String pwd) {
		try {
			boolean flag1=false,flag2=false,flag3=false;
		for(int i=0;i<pwd.length();i++) {
			if(pwd.charAt(i)>='A' && pwd.charAt(i)<='Z') {
				flag1=true;
			}
			else if(pwd.charAt(i)>='0' && pwd.charAt(i)<='9') {
				flag2=true;
			}
			else {
				flag3=true;
			}
		}
		if(flag1==true && flag2==true && flag3==true) {
			System.out.println("Given password is correct.");
		}
		else {
			throw new InvalidPwdException("Password is not in correct form.");
		}
		}
		catch (InvalidPwdException e) {
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

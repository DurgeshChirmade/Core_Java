package com.exception;

public class InvalidCountryException extends Exception{
	
	private String msg;
	
	public InvalidCountryException(String msg) {
		super(msg);
		this.msg=msg;
	}

	@Override
	public String getMessage() {
		return "Exception Message : "+msg;
	}

	@Override
	public String toString() {
		return "Special Message : "+msg;
	}
	
}

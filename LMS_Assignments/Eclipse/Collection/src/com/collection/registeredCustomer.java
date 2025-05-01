package com.collection;

public class registeredCustomer extends Customer {

	private int regno;

	public registeredCustomer() {
		super();
	}

	public registeredCustomer(String name, String emailid, long contactno, int regno) {
		super(name, emailid, contactno);
		this.regno = regno;
	}

	@Override
	public String toString() {
		return super.toString() + "registeredCustomer [regno=" + regno + "]";
	}

}

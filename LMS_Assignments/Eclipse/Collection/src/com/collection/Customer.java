package com.collection;

import java.io.Serializable;

public class Customer implements Serializable {
	private String name;
	private String emailid;
	private long contactno;
	
	public Customer() {
		super();
	}

	public Customer(String name, String emailid, long contactno) {
		super();
		this.name = name;
		this.emailid = emailid;
		this.contactno = contactno;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", emailid=" + emailid + ", contactno=" + contactno + "]";
	}
	
	
	
}

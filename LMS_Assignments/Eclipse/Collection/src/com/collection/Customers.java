package com.collection;

import java.util.Objects;

public class Customers {
	private String name;
	private int cid;

	public Customers() {
		super();
	}

	public Customers(String name, int cid) {
		super();
		this.name = name;
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, cid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		Customers cust = (Customers) obj;
		return cid == cust.cid && Objects.equals(name, cust.name);
	}

	@Override
	public String toString() {
		return name + " : " + cid;
	}

}

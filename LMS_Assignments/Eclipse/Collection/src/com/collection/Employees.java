package com.collection;

public class Employees {
	private int sid;
	private String name;
	private double Salary;
	private String dept;
	
	public Employees() {
		super();
	}

	public Employees(int sid, String name, double salary, String dept) {
		super();
		this.sid = sid;
		this.name = name;
		Salary = salary;
		this.dept = dept;
	}


	public String toString() {
		return "Employee [sid=" + sid + ", name=" + name + ", Salary=" + Salary + ", dept=" + dept + "]";
	}



	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
		

}

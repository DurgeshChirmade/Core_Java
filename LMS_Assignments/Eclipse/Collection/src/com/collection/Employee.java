package com.collection;

public class Employee implements Comparable<Employee> {
	private int sid;
	private String name;
	private double Salary;
	
	public Employee() {
		super();
	}

	public Employee(int sid, String name, double salary) {
		super();
		this.sid = sid;
		this.name = name;
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [sid=" + sid + ", name=" + name + ", Salary=" + Salary + "]";
	}

	@Override
	public int compareTo(Employee e) {
		
		int diff=0;
		if(this.Salary>e.Salary) {
			diff=1;
		}
		else if(this.Salary<e.Salary) {
			diff=-1;
		}
		else {
			diff=e.name.compareTo(this.name);
			if(diff==0) {
				diff=this.sid-e.sid;
			}
		}
		return diff;
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
	
	

}

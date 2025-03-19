package com.staff;

public class Administrator extends Employee {
	private double allowance;
	
	public Administrator() {
		super();
		allowance=0.0;
	}
	
	public Administrator(String name,int dd,int mm,int yy,int empid,double salary,double allowance) {
		super(name,dd,mm,yy,empid,salary);
		this.allowance=allowance;
	}
	
	public void display() {
		super.display();
		System.out.println("Allowance : "+allowance);
	}

	@Override
	public String toString() {
		return "Administrator [allowance=" + allowance + "]";
	}
	
	public double CalculateSalary() {
		return salary+allowance;
	}

}

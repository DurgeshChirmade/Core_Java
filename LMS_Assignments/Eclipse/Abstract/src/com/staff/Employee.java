package com.staff;

public abstract class Employee extends Person {
	private int empid;
	protected double salary;
	
	public Employee() {
		super();
		empid=0;
		salary=0.0;
	}
	public Employee(String name,int dd,int mm,int yy,int empid,double salary) {
		super(name,dd,mm,yy);
		this.empid=empid;
		this.salary=salary;
	}
	public void display() {
		super.display();
		System.out.println("EmpId : "+empid);
		System.out.println("Salary : "+salary);
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + "]";
	}
	
	public abstract double CalculateSalary();
}

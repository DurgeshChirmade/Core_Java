package com.staff;

public class SalesManager extends Employee implements iTraveller {
	private double salesTarget;
	private double perCommision;
	private int passportNumber;
	private int travelHours;

	public SalesManager() {
		super();
	}

	public SalesManager(String name, int dd, int mm, int yy, int empid, double salary, double salesTarget,
			double perCommision, int passportNumber, int travelHours) {
		super(name, dd, mm, yy, empid, salary);
		this.salesTarget = salesTarget;
		this.perCommision = perCommision;
		this.passportNumber = passportNumber;
		this.travelHours = travelHours;
	}

	public void display() {
		super.display();
		System.out.println("Sales Target : " + salesTarget + " Per Commission : " + perCommision + " Passport Number : "
				+ passportNumber + " Travel Hours : " + travelHours);
	}

	@Override
	public String toString() {
		return "SalesManager [salesTarget=" + salesTarget + ", perCommision=" + perCommision + ", passportNumber="
				+ passportNumber + ", travelHours=" + travelHours + "]";
	}

	public double CalculateSalary() {
		return salary + (perCommision / 100);
	}

	@Override
	public String getPassportDetails() {
		return getEmpid()+" "+getName()+" "+passportNumber;
	}

	@Override
	public int getTravelHours() {
		return travelHours;
	}

}

package com.staff;

public class Programmer extends Employee implements iTraveller {
	private String projectTitle;
	private int extraHours;
	private double chargesPerExtraHour;
	private int passportNumber;
	private int travelHours;
	
	public Programmer() {
		super();
	}

	public Programmer(String name, int dd, int mm, int yy, int empid, double salary, String projectTitle,
			int extraHours, double chargesPerExtraHour, int passportNumber, int travelHours) {
		super(name, dd, mm, yy, empid, salary);
		this.projectTitle = projectTitle;
		this.extraHours = extraHours;
		this.chargesPerExtraHour = chargesPerExtraHour;
		this.passportNumber = passportNumber;
		this.travelHours = travelHours;
	}


	public void display() {
		super.display();
		System.out.println("Project Title : "+projectTitle+" Extra Hours : "+extraHours+" Charges Per Extra Hour : "+chargesPerExtraHour+ " Passport Number : "
				+ passportNumber + " Travel Hours : " + travelHours);
	}
	
	@Override
	public String toString() {
		return "Programmer [projectTitle=" + projectTitle + ", extraHours=" + extraHours + ", chargesPerExtraHour="
				+ chargesPerExtraHour + ", passportNumber=" + passportNumber + ", travelHours=" + travelHours + "]";
	}

	public double CalculateSalary() {
		return salary+(extraHours*chargesPerExtraHour);
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

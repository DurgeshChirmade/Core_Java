package office.staff;

public class SalesManager extends Employee {
	private double salesTarget;
	private double perCommision;
	
	public SalesManager() {
		super();
		this.salesTarget=0.0;
		this.perCommision=0.0;
	}
	
	public SalesManager(String name,int dd,int mm,int yy,int empid,double salary,double salesTarget,double perCommision) {
		super(name,dd,mm,yy,empid,salary);
		this.salesTarget=salesTarget;
		this.perCommision=perCommision;
	}
	
	public void display() {
		super.display();
		System.out.println("Sales Target : "+salesTarget+" Per Commission : "+perCommision);
	}

	@Override
	public String toString() {
		return "SalesManager [salesTarget=" + salesTarget + ", perCommision=" + perCommision + "]";
	}
	
	public double CalculateSalary() {
		return super.CalculateSalary()+(perCommision/100);
	}
	
	public double GetTarget() {
		return salesTarget;
	}

}

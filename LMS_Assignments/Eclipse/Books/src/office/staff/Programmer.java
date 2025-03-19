package office.staff;

public class Programmer extends Employee {
	private String projectTitle;
	private int extraHours;
	private double chargesPerExtraHour;
	
	public Programmer() {
		super();
		projectTitle="";
		extraHours=0;
		chargesPerExtraHour=0.0;
	}
	
	public Programmer(String name,int dd,int mm,int yy,int empid,double salary,String projectTitle,int extraHours,double chargesPerExtraHour) {
		super(name,dd,mm,yy,empid,salary);
		this.projectTitle=projectTitle;
		this.extraHours=extraHours;
		this.chargesPerExtraHour=chargesPerExtraHour;
	}
	
	public void display() {
		super.display();
		System.out.println("Project Title : "+projectTitle+" Extra Hours : "+extraHours+" Charges Per Extra Hour : "+chargesPerExtraHour);
	}

	@Override
	public String toString() {
		return "Programmer [projectTitle=" + projectTitle + ", extraHours=" + extraHours + ", chargesPerExtraHour="
				+ chargesPerExtraHour + "]";
	}
	
	public double CalculateSalary() {
		return super.CalculateSalary()+(extraHours*chargesPerExtraHour);
	}
	
	public String GetProjectName() {
		return projectTitle;
	}
}

package office.staff;

public class Employee extends Person {
	private int empid;
	private double salary;
	
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
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + "]";
	}
	
	public double CalculateSalary() {
		return salary;
	}
}

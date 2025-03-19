package apps;

import office.staff.Administrator;
import office.staff.Employee;
import office.staff.Programmer;
import office.staff.SalesManager;

public class SecondDemo {

	public static void main(String[] args) {
		
		Employee [] emp = new Employee[3];
		emp[0]=new SalesManager("ABC",1,1,2001,101,45000.78,567.87,8.98);
		emp[1]=new Programmer("ABC",1,1,2001,101,45000.78,"QWERTY",78,897.87);
		emp[2]=new Administrator("ABC",1,1,2001,101,45000.78,786.67);
		
		for(Employee e:emp) {
			e.display();
			System.out.println(e);
			e.CalculateSalary();
		}
		
		showMoreDetails(emp);

	}
	
	public static void showMoreDetails(Employee emp[]) {
		for(Employee e:emp) {
			if(e instanceof Employee) {
				if(e instanceof SalesManager) {
					System.out.println("Get Target : "+((SalesManager)e).GetTarget());
				}
				if(e instanceof Programmer) {
					System.out.println("Get Project Name : "+((Programmer)e).GetProjectName());
				}
				if(e instanceof Administrator) {
					System.out.println("Get Allowance : "+((Administrator)e).GetAllowance());
				}
			}
		}
	}

}

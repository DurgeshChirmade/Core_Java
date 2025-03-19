package application;

import com.staff.Administrator;
import com.staff.Employee;
import com.staff.Programmer;
import com.staff.SalesManager;
import com.staff.iTraveller;

public class SecondDemo {

	public static void main(String[] args) {
		
		Employee [] emp = new Employee[3];
		emp[0]=new SalesManager("ABC",1,1,2001,101,45000.78,567.87,8.98,2202444,12);
		emp[1]=new Programmer("ABC",1,1,2001,102,45000.78,"QWERTY",78,897.87,2202490,15);
		emp[2]=new Administrator("ABC",1,1,2001,101,45000.78,786.67);
		
		
		/*
		for(Employee e:emp) {
			e.display();
			System.out.println(e);
			System.out.println("Calculate  Salary : "+e.CalculateSalary());
		}
		*/
		
		showdetails(emp);

	}
	
	public static void showdetails(Employee emp[]) {
		int total=0;
		for(Employee e:emp) {
			if(e instanceof iTraveller) {
				if(e instanceof SalesManager) {
					System.out.println(((SalesManager)e).getPassportDetails());
					total += ((SalesManager)e).getTravelHours();
				}
				if(e instanceof Programmer) {
					System.out.println(((Programmer)e).getPassportDetails());
					total += ((Programmer)e).getTravelHours();
				}
			}
		}
		System.out.println("Total Travel Hours : "+total);
	}

}

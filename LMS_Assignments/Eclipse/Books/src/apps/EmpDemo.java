package apps;

import office.staff.Employee;
import office.staff.Person;

public class EmpDemo {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.display();
		
		Employee emp2 = new Employee("ABC",1,1,2001,101,2456.567);
		emp2.display();
		
		Person p = new Employee("Amit",1,1,1998,1002,15000.0);
		p.display();
	}
}

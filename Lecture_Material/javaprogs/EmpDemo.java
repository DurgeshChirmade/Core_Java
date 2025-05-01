package apps;

import office.staff.Employee;
import office.staff.Person;

public class EmpDemo {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.display();		
		
		System.out.println("----------------");
		Employee emp2 = new Employee("Bakul",12,11,2000,1001, 10000.0);
		//emp2.display();
		System.out.println(emp2);    //emp2.toString()
		System.out.println("-------------");
		
		Person p = new Employee("Amit",1,1,1998,1002,15000.0);
		p.display(); //dynamic binding, display() - Employee
		System.out.println("**************");
		Object o = new Person("Prasad",12,4,1997);
		System.out.println(o.toString());

	}

}

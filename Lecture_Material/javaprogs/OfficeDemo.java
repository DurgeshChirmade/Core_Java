package apps;

import office.staff.Admin;
import office.staff.Employee;
import office.staff.Programmer;
import office.staff.SalesManager;
import office.utility.ITraveller;

public class OfficeDemo {

	public static void main(String[] args) {
		Employee [] allemps = new Employee[3];
		allemps[0] = new SalesManager("Vaibhav", 1, 1, 2000, 1001, 10000.0, 100000.0, 4.5, 10);
		allemps[1] = new Programmer("Bakul", 2, 2, 1999, 1002, 12000.0, 45.6, 1000.0, 8);
		allemps[2] = new Admin("Amit",3,3,1998,1003,9000.0,890.0);
		
		//advanced for loop or for each loop
		for(Employee e : allemps) {
			//e.display();
			System.out.println(e);  //object gets printed - toString()
			//System.out.println(e.toString());
			System.out.println("*****************");
		}
		System.out.println("------------------------");
		double total = 0;
		for(Employee e : allemps) {
			total += e.calSalary();
			System.out.println("Salary : "+e.calSalary());
		}
		System.out.println("Total salary : "+total);
		System.out.println("------------------------");
		for(Employee e : allemps) {
			if(e instanceof ITraveller) { //1. SM,  2. Pro, 3. Admin 
				System.out.print(e.getEmpid() + " : ");
				if(e instanceof SalesManager)
					System.out.print(((SalesManager)e).getDaysTravlled() + " : ");
				if(e instanceof Programmer)
					System.out.print(((Programmer)e).getDaysTravelled() + " : ");
			    System.out.print("TA - "+((ITraveller)e).calculateTA());
			    System.out.println();
			}
		}
		

	}

}

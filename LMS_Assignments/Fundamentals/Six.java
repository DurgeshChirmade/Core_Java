import java.io.*;

class Employee{
	int emp_id;
	String name;
	int salary;

	Employee(){
		this.emp_id=0;
		this.name="";
		this.salary=0;
	}
	Employee(int emp_id,String name,int salary){
		this.emp_id=emp_id;
		this.name=name;
		this.salary=salary;
	}
	void display(){
		System.out.println(emp_id+" "+name+" "+salary);
	}
}
public class Six{
	public static void main(String args[]){

		Employee emp[]=new Employee[5];

		emp[0]=new Employee(101,"Durgesh",45000);
		emp[1]=new Employee(102,"Ajay",54000);
		emp[2]=new Employee(103,"ABC",64000);
		emp[3]=new Employee(104,"ASD",78000);
		emp[4]=new Employee(105,"QWE",87000);

		for(int i=0;i<5;i++){
			emp[i].display();
		}
	}
}
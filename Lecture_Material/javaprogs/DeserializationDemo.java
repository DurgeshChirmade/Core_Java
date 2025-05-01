package apps;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import office.staff.Employee;

public class DeserializationDemo {

	public static void main(String[] args) throws Exception{
		
		/*Employee [] arr = new Employee[3];
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/myfiles/emps.dat"));

		for(int i=0;i<arr.length;i++) {
			Object o = ois.readObject();
			if(o instanceof Employee) {
			   arr[i] = (Employee)o;
			}
		}
		
		ois.close();
		
		System.out.println("showing all objects....");
		for(Employee e : arr)
			System.out.println(e);   //toString()
		*/
		//dynamic - add as many as required
		List<Employee> emps = new ArrayList<>();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/myfiles/emps.dat"));
		
		while(true) {
			try {
				Object o = ois.readObject();
				if(o instanceof Employee) {
				   Employee e = (Employee)o;
				   emps.add(e);
				}
			}
			catch(Exception e) {
				break;   //when readObject() method fails
			}
		}
		
		ois.close();
		
		for(Employee e : emps) {
			System.out.println(e);  //toString()
		}
	}

}





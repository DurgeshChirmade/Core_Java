package apps;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import customexceptions.InvalidNameException;
import office.staff.Admin;
import office.staff.Employee;
import office.staff.Programmer;
import office.staff.SalesManager;

public class SerializationApp {

	public static void main(String[] args){
		
		ObjectOutputStream oos = null;
		try {
			Employee [] allemps = new Employee[4];
			allemps[0] = new SalesManager("Vaibhav", 1, 1, 2000, 1001, 10000.0, 100000.0, 4.5, 10);
			allemps[1] = new Programmer("Bakul", 2, 2, 1999, 1002, 12000.0, 45.6, 1000.0, 8);
			allemps[2] = new Admin("Amit",3,3,1998,1003,9000.0,890.0);
			allemps[3] = new SalesManager("Vishal", 9, 9, 2000, 1001, 10000.0, 150000.0, 4.3, 9);
			
			System.out.println("creating streams");
			oos = new ObjectOutputStream(new FileOutputStream("C:\\myfiles\\emps.dat"));
			
			for(Employee e : allemps)
				oos.writeObject(e);
			
			System.out.println("object writing is done");
			
			oos.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(InvalidNameException e) {
			e.printStackTrace();
		}
		finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}

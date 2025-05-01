package com.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class TenClassB {

	public static void main(String[] args) throws Exception {
		
		Employee [] emp = new Employee[3];
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\CDAC\\PGDAC\\KNOW-IT_Pune\\Daily_Lab\\Core_Java\\LMS_Assignments\\data.dat"));
		
		for(int i=0;i<emp.length;i++) {
			Object o = ois.readObject();
			if(o instanceof Employee) {
				emp[i]=(Employee)o;
			}
		}
		
		ois.close();
		
		System.out.println("Showing all objects....");
		for(Employee e:emp) {
			System.out.println(e); //e.toString()
		}
		
		System.out.println("Reading operation done....");
		System.out.println("********************************************************************");
		
		List<Employee> l = new ArrayList<>();
		ObjectInputStream os = new ObjectInputStream(new FileInputStream("E:\\CDAC\\PGDAC\\KNOW-IT_Pune\\Daily_Lab\\Core_Java\\LMS_Assignments\\data.dat"));
		
		while(true) {
			try {
				Object o = os.readObject();
				if(o instanceof Employee) {
					Employee e = (Employee)o;
					l.add(e);
				}
			}
			catch(Exception e) {
				break;
			}
		}
		
		os.close();
		
		for(Employee e:l) {
			System.out.println(e); //e.toString();
		}
	}

}

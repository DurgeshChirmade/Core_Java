package com.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TenClass {

	public static void main(String[] args) {
		
		ObjectOutputStream oos=null;
		
		try {
		Employee [] emp = new Employee[3];
		emp[0]=new SalesManager("ABC",1,1,2001,101,45000.78,567.87,8.98,2202444,12);
		emp[1]=new Programmer("ABC",1,1,2001,102,45000.78,"QWERTY",78,897.87,2202490,15);
		emp[2]=new Administrator("ABC",1,1,2001,101,45000.78,786.67);
		
		oos=new ObjectOutputStream(new FileOutputStream("E:\\CDAC\\PGDAC\\KNOW-IT_Pune\\Daily_Lab\\Core_Java\\LMS_Assignments\\data.dat"));
		
		for(Employee e:emp) {
			oos.writeObject(e);
		}
		
		System.out.println("Object Writing is done.");
		
		oos.close();
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}

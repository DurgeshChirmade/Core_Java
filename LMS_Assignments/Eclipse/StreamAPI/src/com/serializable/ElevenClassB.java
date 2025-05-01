package com.serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ElevenClassB {

	public static void main(String[] args) {
		
		Student s[]=new Student[3];
		
		ObjectInputStream ois=null;
		
		try {
			ois=new ObjectInputStream(new FileInputStream("E:\\CDAC\\PGDAC\\KNOW-IT_Pune\\Daily_Lab\\Core_Java\\LMS_Assignments\\student.dat"));
			
			for(int i=0;i<s.length;i++) {
				Object o = ois.readObject();
				if(o instanceof Student) {
					s[i]=(Student)o;
				}
			}
			
			System.out.println("Student Data : ");
			for(Student st:s) {
				System.out.println(st);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

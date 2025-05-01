package com.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ElvenClass {

	public static void main(String[] args) {

		ObjectOutputStream oos = null;

		try {
			Student[] s = new Student[3];
			s[0] = new Student("233P2202444", 37, 101, "AAA", 45000.57);
			s[1] = new Student("233P2202445", 35, 102, "BBB", 46000.57);
			s[2] = new Student("233P2202490", 32, 103, "CCC", 47000.57);

			oos = new ObjectOutputStream(new FileOutputStream(
					"E:\\CDAC\\PGDAC\\KNOW-IT_Pune\\Daily_Lab\\Core_Java\\LMS_Assignments\\student.dat"));

			for (Student st : s) {
				oos.writeObject(st);
			}

			System.out.println("Object writing is done.");

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

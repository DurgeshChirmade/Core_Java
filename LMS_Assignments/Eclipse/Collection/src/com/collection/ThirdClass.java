package com.collection;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ThirdClass {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Customer c[] = new Customer[3];
		ObjectOutputStream oos = null;

		try {

			oos = new ObjectOutputStream(new FileOutputStream(
					"E:\\CDAC\\PGDAC\\KNOW-IT_Pune\\Daily_Lab\\Core_Java\\LMS_Assignments\\customer.dat"));

			for (int i = 0; i < c.length; i++) {

				// String name, String emailid, long contactno, int regno
				System.out.print("Enter Customer name : ");
				String name = br.readLine();

				System.out.print("Enter Customer mail : ");
				String emailid = br.readLine();

				System.out.print("Enter Customer contact no : ");
				long contactno = Long.parseLong(br.readLine());

				System.out.print("Enter Customer regno : ");
				int regno = Integer.parseInt(br.readLine());

				System.out.print("Enter 1 for customer instance 2 for register customer instance : ");
				int ch = Integer.parseInt(br.readLine());

				if (ch == 1) {
					c[i] = new Customer(name, emailid, contactno);
				} else if (ch == 2) {
					c[i] = new registeredCustomer(name, emailid, contactno, regno);
				}

				oos.writeObject(c[i]);
			}
			
			System.out.println("Object Writing is done.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

package com.collection;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class FourClass {

	public static void main(String[] args) {

		List<Customer> c = new ArrayList<>();
		List<registeredCustomer> rc = new ArrayList<>();

		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(
					"E:\\CDAC\\PGDAC\\KNOW-IT_Pune\\Daily_Lab\\Core_Java\\LMS_Assignments\\customer.dat"));
			while (true) {
				try {

					Object o = ois.readObject();
//					System.out.println(o);
					if (o instanceof registeredCustomer) {
						rc.add((registeredCustomer) o);
					} else if (o instanceof Customer) {
						c.add((Customer) o);
					}
				} catch (Exception e) {
					break; // break the while loop
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
//		System.out.println(c + " " + rc);
		System.out.println("Customer Details : ");
		for (Customer cs : c)
			System.out.println(cs);

		System.out.println("Register Customer Details : ");
		for (registeredCustomer rs : rc)
			System.out.println(rs);

		try {
			ois.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

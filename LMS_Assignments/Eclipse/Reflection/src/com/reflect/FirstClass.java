package com.reflect;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class FirstClass {

	public static void main(String[] args) throws Exception {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter your fully qualified name : ");
			String str = br.readLine();

			Class cls = Class.forName(str);

			System.out.println("Class Name : " + cls.getName());
			System.out.println("Package : " + cls.getPackage());
			System.out.println("Super Class : " + cls.getSuperclass());
			Class[] ifaces = cls.getInterfaces();
			System.out.println("Implemented interfaces : ");
			for (Class iface : ifaces) {
				System.out.println(iface);
			}

			System.out.println("Available Constructors : ");
			Constructor[] allcons = cls.getConstructors();
			for (Constructor con : allcons) {
				System.out.println(con);
			}

			// getMethods - all methods + methods from super class
			// getDeclaredMethods - own methods

			System.out.println("Available Methods : ");
			Method[] allMethods = cls.getMethods();

			for (Method m : allMethods) {
				System.out.println(m);
			}

			int n = cls.getModifiers();
			if (Modifier.isAbstract(n)) {
				System.out.println("class is abstract.");
			} else {
				System.out.println("class is not abstract.");
			}

			if (Modifier.isPublic(n)) {
				System.out.println("class is public.");
			} else {
				System.out.println("class is not public.");
			}

			if (Modifier.isFinal(n)) {
				System.out.println("class is final.");
			} else {
				System.out.println("class is not final.");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

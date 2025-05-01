package demos;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class KnowingAboutClass {

	public static void main(String[] args) throws ClassNotFoundException {
		//1. get the instance of class Class
		Class cls  = Class.forName("java.lang.String");
		
		//2. Call diff methods
		System.out.println("Package : "+cls.getPackage());
		System.out.println("Super class : "+cls.getSuperclass());
		Class [] ifaces = cls.getInterfaces();
		System.out.println("Implemented interafces...........");
		for(Class iface : ifaces)
			System.out.println(iface);
		
		System.out.println("Available constructors.........");
		Constructor [] allcons = cls.getConstructors();
		for(Constructor con :allcons)
			System.out.println(con);
		
		//getMethods - all methods + methods from super class
		//getDeclaredMethods - own methods
		System.out.println("Available methods.........");
		Method [] allMethods = cls.getMethods();
		for(Method m :allMethods)
			System.out.println(m);
		
		int n = cls.getModifiers();
		if(Modifier.isAbstract(n))
			System.out.println("class is abstract");
		else
			System.out.println("class is not abstract");
		
		if(Modifier.isPublic(n))
			System.out.println("class is public");
		else
			System.out.println("class is not public");
		
		if(Modifier.isFinal(n))
			System.out.println("class is final");
		else
			System.out.println("class is not final");

	}

}

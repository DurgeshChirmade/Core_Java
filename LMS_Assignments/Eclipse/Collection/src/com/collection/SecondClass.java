package com.collection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class SecondClass {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<String> al = new ArrayList<String>();
		
		System.out.print("How many Strings yout want to give : ");
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=n;i++) {
			System.out.print("Enter your string : ");
			String str=br.readLine();
			
			al.add(str);
		}
		
		System.out.println("List of Strings : ");
		System.out.println(al);
		
		System.out.println("Iterator Data : ");
		
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("List Iterator : ");
		
		ListIterator<String> it = al.listIterator();
		
		while(it.hasNext()) {
			it.next();
		}
		
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
		System.out.println("Size : "+al.size());
		
		for(String s:al) {
			System.out.println(s);
		}
		
		System.out.println(al.reversed());
		
		System.out.println("Enter which string you want to search : ");
		String str=br.readLine();
		
		int i=0;
		if((i=al.indexOf(str))!=-1) {
			System.out.println(str+" is found at "+i);
		}
		else {
			System.out.println("Index not found");
		}
		
		System.out.println(al.reversed());		
		
		Collections.sort(al);
		System.out.println(al);
				
		System.out.print("Enter which index element you want to remove : ");
		int index=Integer.parseInt(br.readLine());
		
		al.remove(index);
		
		System.out.println(al);

	}

}

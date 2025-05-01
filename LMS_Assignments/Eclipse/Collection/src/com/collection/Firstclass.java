package com.collection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Firstclass {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> al = new ArrayList<String>();
		
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
		
		System.out.print("Enter which index element you want to remove : ");
		int index=Integer.parseInt(br.readLine());
		
		al.remove(index);
		
		System.out.println(al);

	}

}

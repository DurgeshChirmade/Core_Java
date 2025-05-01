package com.thread;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SixClass {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter start number : ");
		int snum = Integer.parseInt(br.readLine());
		
		System.out.print("Enter end number : ");
		int enm = Integer.parseInt(br.readLine());
		
		PrimeNumberThread p1 = new PrimeNumberThread(snum,enm);
		
		p1.getT().start();

	}

}

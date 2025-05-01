package com.thread;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fiveclass {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter your source file path : ");
		String sname = br.readLine();

		System.out.print("Enter your destination file path : ");
		String dname = br.readLine();

		FileCopy fc = new FileCopy(sname, dname);
		fc.getT().start();

	}

}

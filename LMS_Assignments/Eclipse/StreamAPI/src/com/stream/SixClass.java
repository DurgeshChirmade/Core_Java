package com.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SixClass {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter file name : ");
		String fname = br.readLine();
		
		FileReader fr = new FileReader(fname);
		BufferedReader br1=new BufferedReader(fr);
		
		int cnt=0;
		String str="";
		while(!str.equals("EOF")) {
			str=br1.readLine();
			cnt++;
			System.out.println(cnt+" : "+str);
		}
		

	}

}

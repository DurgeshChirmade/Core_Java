package com.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EightClass {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter your file name : ");
		String fname = br.readLine();
		
		int maxlength=0;
		int lineno=0;
		int maxlineno=0;
		String maxstr="";
		
		FileReader fr = new FileReader(fname);
		BufferedReader br1 = new BufferedReader(fr);
		
		String str="";
		while((str=br1.readLine())!=null) {
			lineno++;
			if(str.length()>maxlength) {
				maxlength=str.length();
				maxstr=str;
				maxlineno=lineno;
			}
		}
		
		System.out.println("Max length line no "+"|"+" Max length string "+"|"+" Max length of the string ");
		System.out.println(maxlineno+"\t"+maxstr+"\t"+maxlength);

	}

}

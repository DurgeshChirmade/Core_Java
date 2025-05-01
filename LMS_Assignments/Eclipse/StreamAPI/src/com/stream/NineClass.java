package com.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NineClass {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your file name : ");
		String fname = br.readLine();
		
		File f = new File(fname);
		
		int maxlength=0;
		String maxstr="";
		
		FileReader fr = new FileReader(f);
		BufferedReader br1 = new BufferedReader(fr);
		
		String str="";
		System.out.println("String Str");
		while((str=br1.readLine())!=null) 
		{

			if(str.length()>maxlength) {
				maxlength=str.length();
				maxstr=str;
			}
		}
		System.out.println("*");
		
		BufferedReader br2 = new BufferedReader(new FileReader(f));
		
		String s="";
		while((s=br2.readLine())!=null) {
			
			int diff=maxlength-s.length();
			
			if(s.length()<maxlength) {
				for(int i=0;i<diff;i++) {
					System.out.print("-");
				}
				System.out.println(s);
				
			}
			if(s.length()==maxlength) {
				System.out.println(maxstr+":"+maxlength);
			}
			
		}
//		System.out.println(maxstr+":"+maxlength);
		

	}

}

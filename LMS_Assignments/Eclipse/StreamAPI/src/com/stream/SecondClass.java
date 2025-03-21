package com.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondClass {

	public static void main(String[] args) {
		
		BufferedReader br=null;
		
		try {
			br= new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter 'quit' to stop");
			
			String str;
			int maxlength=0;
			String maxstr="";
			
			while(!(str=br.readLine()).equals("quit")) {
				if(str.length()>maxlength) {
					maxlength=str.length();
					maxstr=str;
				}
				
			}
			System.out.println(maxstr+" : "+maxlength);
			System.out.println("Reading line is over.");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

package com.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FourClass {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter your file name : ");
		String fname=br.readLine();
		
		System.out.println("Enter 'EOF' for end of input for writing in file ");
		
		FileWriter fw = new FileWriter(fname);
		
		String str="";
		while(!str.equals("EOF")) {
			
			
			System.out.print("Enter your data : ");
			str=br.readLine();
			fw.write(str+"\n");
		}
		fw.close();
		
		FileReader fr = new FileReader(fname);
		BufferedReader br1 = new BufferedReader(fr);
		
		while(true) {
			String s=br1.readLine();
			
			if(s==null) {
				break;
			}
			System.out.println(s);
		}
		
		
		fr.close();

	}

}

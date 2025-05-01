package com.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SevenClass {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter your file name : ");
		String name=br.readLine();
		
		File f = new File(name);
		
		if(!f.exists()) {
			System.out.println(name+" file is not exist on given path.");
			System.exit(0);
		}
		
		if(f.isDirectory()) {
			
			String fnames[]=f.list();
			
			System.out.println("File count : "+fnames.length);
			for(String fe:fnames) {
				
				System.out.println("File in Directory : "+fe);
			}
		}
		
		if(f.isFile()) {
			long len=f.length();
			
			if(len>25) {
				
				FileReader fr = new FileReader(f);
				BufferedReader br1 = new BufferedReader(fr);
				
				String str="";
				System.out.println("File Content ");
				System.err.println("----------------------------");
				while(!str.equals("EOF")) {
					str=br1.readLine();
					
					System.out.println(str);
				}
			}
			else {
				FileReader fr = new FileReader(f);
				
				int i;
				while(!((i=fr.read())==-1)) {
					
					System.out.print(i);
				}
			}
		}

	}

}

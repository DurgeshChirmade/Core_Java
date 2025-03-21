package com.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstClass {

	public static void main(String[] args) {
		
		BufferedReader br=null;
		
		try {
		br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter q for quit ");
		
		int i;
		int alphacnt=0;
		int digitcnt=0;
		
		while((i=br.read())!='q') {
			//System.out.println((char)i);
			if(i>='A' && i<='Z' || i>='a' && i<='z') {
				alphacnt++;
			}
			if(i>='0' && i<='9') {
				digitcnt++;
			}
		}
		System.out.println("Aphabet Count : "+alphacnt);
		System.out.println("Digit Count : "+digitcnt);
		System.out.println("read-write operation is done.");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

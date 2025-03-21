package com.stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FiveClass {
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("a.txt");
		
		FileWriter fw = new FileWriter("b.txt");
		
		int ch=-1;
		
		while(true) {
			ch=fr.read();
			if(ch==-1) {
				break;
			}
			fw.write(ch);
		}
		System.out.println("Operation successful.");
		fr.close();
		fw.close();
	}

}

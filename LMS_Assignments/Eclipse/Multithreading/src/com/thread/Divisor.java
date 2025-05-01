package com.thread;

import java.io.FileWriter;
import java.io.IOException;

public class Divisor implements Runnable {
	
	private Thread t;
	private int num;
	
	public Divisor() {
		t=new Thread(this);
	}
	
	public Divisor(int num) {
		t=new Thread(this);
		this.num=num;
	}
	
	public synchronized void writeFile() throws Exception {
		
		FileWriter fw = new FileWriter("E:\\CDAC\\PGDAC\\KNOW-IT_Pune\\Daily_Lab\\Core_Java\\LMS_Assignments\\divisor.txt");
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				fw.write(String.valueOf(i)+" ");
			}
		}
	}
	
	public void run() {
		
	}
	
	public Thread getT() {
		return t;
	}
	

}

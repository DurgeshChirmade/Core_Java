package com.thread;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy implements Runnable {

	private Thread t;
	private String sname;
	private String dname;

	public FileCopy() {
		t = new Thread(this);
	}

	public FileCopy(String sname, String dname) {
		t = new Thread(this);
		this.sname = sname;
		this.dname = dname;
	}

	public void run() {
		try {
			FileReader fr = new FileReader(sname);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = null;
			try {
				fw = new FileWriter(dname);
			} catch (IOException e) {
				e.printStackTrace();
			}

			String str = "";
			try {
				while ((str = br.readLine()) != null) {

					System.out.println(str);

					fw.write(str+"\n");

				}

				System.out.println("File Write Successful.");
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("Code end is successfull.");

	}

	public Thread getT() {
		return t;
	}

}

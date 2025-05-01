package com.thread;

public class SevenClass {

	public static void main(String[] args) {

		Printer p = new Printer();

		PrinterThread pt1 = new PrinterThread("Message 1", p);
		PrinterThread pt2 = new PrinterThread("Message 2", p);
		PrinterThread pt3 = new PrinterThread("Message 3", p);

		pt1.getT().start();
		pt2.getT().start();
		pt3.getT().start();

	}

}

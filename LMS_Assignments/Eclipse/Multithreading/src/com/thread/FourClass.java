package com.thread;

public class FourClass {

	public static void main(String[] args) {

		CountNum cn1 = new CountNum(980, "First");
		CountNum cn2 = new CountNum(890, "Second");
		CountNum cn3 = new CountNum(789, "Third");

		System.out.println("Count down started from main ....");

		cn1.getT().start();
		cn2.getT().start();
		cn3.getT().start();

		try {
			cn1.getT().join();
			cn2.getT().join();
			cn3.getT().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Count down has completed from main ... bye");

	}

}

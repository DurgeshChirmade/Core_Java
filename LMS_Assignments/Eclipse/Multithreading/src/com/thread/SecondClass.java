package com.thread;

public class SecondClass {

	public static void main(String[] args) {

		/*
		Mythread t = new Mythread();
		t.start();
		*/
		
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		t.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Thread : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

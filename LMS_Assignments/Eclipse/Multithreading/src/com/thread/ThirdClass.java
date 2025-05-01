package com.thread;

public class ThirdClass {

	public static void main(String[] args) {

		MyRunn r = new MyRunn();
		r.getT().start();

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

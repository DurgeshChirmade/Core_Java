package com.thread;

public class MyRunn implements Runnable {

	private Thread t;

	public MyRunn() {
		t = new Thread(this);
	}

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println("MyRunn Class Thread : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public Thread getT() {
		return t;
	}

}

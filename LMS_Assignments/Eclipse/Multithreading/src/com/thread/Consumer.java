package com.thread;

public class Consumer implements Runnable {

	Thread t;
	Stock s;
	boolean bRun;

	public Consumer() {
		t = new Thread(this); // this.run
		bRun = true;
	}

	public Consumer(Stock s) {
		t = new Thread(this); // this.run
		this.s = s;
		bRun = true;
	}

	public void stopNow() {
		bRun = false;
	}

	public void run() {
		while (bRun)
			s.consume();
	}
}

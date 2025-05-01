package com.thread;

public class Producer implements Runnable {

	Thread t;
	Stock s;
	boolean bRun;

	public Producer() {
		t = new Thread(this);
		bRun = true;
	}

	public Producer(Stock s) {
		t = new Thread(this);
		this.s = s;
		bRun = true;
	}

	public void stopNow() {
		bRun = false;
	}

	public void run() {
		while (bRun)
			s.produce();
	}

}

package com.thread;

public class PrimeNumberThread implements Runnable {

	private Thread t;
	private int snum;
	private int enm;

	public PrimeNumberThread() {
		t = new Thread(this);
	}

	public PrimeNumberThread(int s, int e) {
		t = new Thread(this);
		this.snum = s;
		this.enm = e;
	}

	public void run() {

		if (enm < snum) {
			System.out.println("num2 is greater than num1");
			return;
		}

		else {
			System.out.print("Prime Numbers between " + snum + " and " + enm + " ");
			for (int i = snum; i <= enm; i++) {
				boolean flag = true;
				if (i < 2) {
					flag = false;
				} else {
					for (int j = 2; j <= i / 2; j++) {
						if (i % j == 0) {
							flag = false;
							break;
						}
					}

				}
				if (flag == true) {
					System.out.print(i + " ");
				}
			}
		}

	}

	public Thread getT() {
		return t;
	}

}

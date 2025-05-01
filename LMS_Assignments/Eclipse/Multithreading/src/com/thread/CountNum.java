package com.thread;

public class CountNum implements Runnable {

	private Thread t;
	private int num;
	private String name;

	public CountNum() {
		t = new Thread(this);
	}

	public CountNum(int num, String name) {
		t = new Thread(this);
		this.num = num;
		this.name = name;
	}

	@Override
	public void run() {
		while (num > 0) {
			System.out.println(name + " Thread count down " + num);
			num--;
		}
	}

	public Thread getT() {
		return t;
	}

}

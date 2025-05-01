package com.thread;

public class PrinterThread implements Runnable {

	private Thread t;
	private String data;
	private Printer printer;

	public PrinterThread(String data, Printer printer) {
		t = new Thread(this);
		this.data = data;
		this.printer = printer;
	}

	public void run() {
		synchronized (printer) {
			for (int i = 1; i <= 5; i++) {
				printer.print(data);

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public Thread getT() {
		return t;
	}

}

class Printer {
	public void print(String message) {
		System.out.println(message);
	}
}

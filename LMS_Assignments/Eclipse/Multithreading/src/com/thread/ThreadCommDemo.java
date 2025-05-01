package com.thread;

public class ThreadCommDemo {

	public static void main(String[] args) {

		// common object producer and consumer
		Stock s = new Stock();

		// threads
		// newly created
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);

		// runnable
		p.t.start();
		c.t.start();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// p.t.stop();
		// c.t.stop();

		p.stopNow();
		c.stopNow();

		try {
			p.t.join();
			c.t.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Total Produced : " + s.qtyProduced);
		System.out.println("Total Consumed : " + s.qtyConsumed);

	}

}

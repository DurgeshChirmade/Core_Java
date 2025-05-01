package threadcomm;

import java.util.function.Consumer;

public class ThreadCommDemp {

	public static void main(String[] args) {
		
		//common object producer and consumer
		Stock s = new Stock();
		//threads
		//newly created
		Producer p = new Producer(s);
		Conusmer c = new Conusmer(s);
		//runnable
		p.t.start();
		c.t.start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
		//p.t.stop();
		//c.t.stop();
		p.stopNow();
		c.stopNow();
		
		try {
			p.t.join();
			c.t.join();
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
		
		System.out.println("Total produced : "+s.qtyProduced);
		System.out.println("Total consumed : "+s.qtyConsumed);
		

	}

}

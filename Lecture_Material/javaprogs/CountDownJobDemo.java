package apps;

import customthreads.CountDownJob;

public class CountDownJobDemo {

	public static void main(String[] args) {
		//newly created
		CountDownJob j1 = new CountDownJob(980, "first");
		CountDownJob j2 = new CountDownJob(890, "second");
		CountDownJob j3 = new CountDownJob(760, "third");
		
		System.out.println("Counting down job begins....");
		//runnable
		j1.getT().start();
		j2.getT().start();
		j3.getT().start();
		
		//main thread - wait
		//timed waiting
		//connditional waiting - dependent on other threads
		//running state - waiting state
		//thread interruption method
		try {
			j1.getT().join();   //main thread waits till j1 finishes
			j2.getT().join();
			j3.getT().join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		//main thread comes out of waiting -
		System.out.println("Counting down job ends....");
	}

}







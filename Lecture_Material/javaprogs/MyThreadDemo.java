package apps;

import customthreads.MyThread;

public class MyThreadDemo {

	public static void main(String[] args) {
		
		Thread t = new MyThread();   //newly created state
		t.start();  //runnable - run
		
		//main thread
		//thread t
		//GC
		
		for(int i=1;i<=5;i++) {
			System.out.println("main thread : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			};
		}

	}

}

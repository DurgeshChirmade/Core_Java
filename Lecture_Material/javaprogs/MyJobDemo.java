package apps;

import customthreads.MyJob;

public class MyJobDemo {

	public static void main(String[] args) {
		//task and controller
		MyJob j1 = new MyJob();  //thread - newly created state
		j1.getT().start();
		//j1.getT().start();
		//j1.run();
		
		for(int i=1;i<=5;i++) {
			System.out.println("Main thread : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			};
		}

	}

}

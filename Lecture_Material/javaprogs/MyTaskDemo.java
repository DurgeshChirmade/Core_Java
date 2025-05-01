package apps;

import customthreads.MyTask;

public class MyTaskDemo {

	public static void main(String[] args) {		
		
		MyTask task = new MyTask();
		//task.start();
		Thread t = new Thread(task);
		t.start();   //task.run()
		
		//main thread
		//t thread
		//GC thread
		
		for(int i=1;i<=5;i++) {
			System.out.println("Child thread : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			};
		}

	}

}

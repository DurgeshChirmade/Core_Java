package customthreads;

//behave as thread
public class MyThread extends Thread {
	
	//defining the task
	//can not use throws cluase
	//overridden method from Thread class
	public void run() {
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

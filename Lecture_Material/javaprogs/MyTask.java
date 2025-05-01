package customthreads;

public class MyTask implements Runnable {

	//task by thread
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

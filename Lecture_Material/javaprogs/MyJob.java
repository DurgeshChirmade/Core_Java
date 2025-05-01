package customthreads;

//1. implements Runnable
public class MyJob implements Runnable {
	
	//2. declaring thread instance (data member)
	private Thread t;
	
	public MyJob() {
		//3. creating thread instance - repeat step in all constructors
		t = new Thread(this);
	}	

	//4. implementing run method
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
	
	//5. provide getter method for thread instance
	public Thread getT() {
		return t;
	}

}

package threadcomm;

//thread
//1
public class Producer implements Runnable {

	//2
	Thread t;
	Stock s;
	boolean bRun;
	
	//3
	public Producer() {
		t = new Thread(this);
		bRun = true;
	}
		
	public Producer(Stock s) {
		t = new Thread(this);
		this.s = s;
		bRun = true;
	}
	
	public void stopNow() {
		bRun = false;
	}
	
	//4
	public void run() {
		while(bRun)
			s.produce();
	}
	
	//5 - t - package scope

}

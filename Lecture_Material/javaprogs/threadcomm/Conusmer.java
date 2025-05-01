package threadcomm;

//thread
//1
public class Conusmer implements Runnable {

	//2
	Thread t;
	Stock s;
	boolean bRun;
	
	public Conusmer() {
		t=new Thread(this);  //this.run
		bRun = true;
	}
	
	public Conusmer(Stock s) {
		t=new Thread(this);   //this.run
		this.s = s;
		bRun = true;
	}
	
	public void stopNow() {
		bRun = false;
	}
	
	//4
	public void run() {
		while(bRun)
			s.consume();
	}
	
	//5 - t access is package

}

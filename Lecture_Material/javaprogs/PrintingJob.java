package threadsync;

//1
public class PrintingJob implements Runnable {

	//2
	private Thread t;
	private Printer p;
	private String header;
	private String body;
	private String footer;
	
	//3
	public PrintingJob() {
		t = new Thread(this);
	}
	
	//3
	public PrintingJob(Printer p, String header, String body, String footer) {
		t = new Thread(this);
		this.p= p;
		this.header = header;
		this.body = body;
		this.footer = footer;
	}
	
	//4
	public void run() {		
		//p.print(header, body, footer); //asynchronous
		p.syncPrint(header, body, footer);  //synchrounous
	}
	
	//5
	public Thread getT() {
		return t;
	}
	

}

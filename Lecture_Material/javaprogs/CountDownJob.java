package customthreads;

//1
public class CountDownJob implements Runnable {
	//2
	private Thread t;
	private int num;
	private String name;
	
	//3
	public CountDownJob() {
		t=new Thread(this);
	}
	
	//3
	public CountDownJob(int num, String name) {
		t = new Thread(this);
		this.num = num;
		this.name = name;
	}

	//4
	public void run() {
		while(num > 0 ) {
			System.out.println(name+" count down "+num);
			num--;
		}
	}
	
	//5
	public Thread getT() {
		return t;
	}

}

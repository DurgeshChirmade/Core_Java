package threadcomm;

//shared resource
public class Stock {
	boolean bProduced;
	int qtyProduced;
	int qtyConsumed;
	
	/*public Stock() {
		//bProduced = false
		//qtyProduced = qtyconsumed = 0
	}*/
	//producer
	public synchronized void produce() {
		//thread should wait
		if(bProduced) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//continue its task
		//bProduced is false
		qtyProduced++;
		System.out.println("Produced : "+qtyProduced);
		notify();
		bProduced = true;
	}
	//consumer
	public synchronized void consume() {
		//thread should wait
		if(!bProduced) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//continue its task
		//bProduced is true
		qtyConsumed++;
		System.out.println("Consumed : "+qtyConsumed);
		notify();
		bProduced = false;
	}
	
	
	

}

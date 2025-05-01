package threadsync;

public class Printer {
	
	//all threads use simultaneously
	public void print(String header, String body, String footer) {
		try {
			System.out.println(header);
			Thread.sleep(500);
			System.out.println(body);
			Thread.sleep(500);
			System.out.println(footer);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	//can be used by one thread at a time
	/*public synchronized void syncPrint(String header, String body, String footer) {
		try {
			System.out.println();
			System.out.print(header);
			Thread.sleep(500);
			System.out.print(body);
			Thread.sleep(500);
			System.out.print(footer);
			
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}*/
	
	public void syncPrint(String header, String body, String footer) {
		synchronized (this) {
			try {
				System.out.println();
				System.out.print(header);
				Thread.sleep(500);
				System.out.print(body);
				Thread.sleep(500);
				System.out.print(footer);
				
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}

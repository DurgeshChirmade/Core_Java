package apps;

public class DefaultThreadDemo {

	public static void main(String[] args) {
		//t thread gets automatically created
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getPriority());  //1 - 10
		
		t.setName("application thread");
		t.setPriority(Thread.MAX_PRIORITY);  //10

		System.out.println("After modification....");
		System.out.println(t.getName());
		System.out.println(t.getPriority());
	}

}

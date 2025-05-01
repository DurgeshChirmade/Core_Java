package apps;

class A{
	
	public void m1() {
		
		//method local inner class
		class B{
			public void f1() {
				
			}
		}
		B obj = new B();
		obj.f1();
		
	}
	
}


public class LocalInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

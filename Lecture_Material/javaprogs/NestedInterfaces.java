package apps;

//Map.Entry

interface OuterIface {
	interface InnerIface {
		public void m2();
	}
	
	public void m1();
}

class Imple implements OuterIface {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
}

class Imple1 implements OuterIface.InnerIface {

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}

public class NestedInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

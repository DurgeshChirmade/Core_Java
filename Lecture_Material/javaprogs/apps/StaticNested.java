package apps;

class Outer {
	int ins_var;
	static int static_var;
	private static int static_var1;
	
	//static - other static
	static class Inner {
		public void display() {
			//non-static member - gives compilation error
			//System.out.println(ins_var);
			System.out.println(static_var);
			System.out.println(static_var1);			
		}		
	}	
}


public class StaticNested {
	public static void main(String[] args) {
		Outer.Inner obj = new Outer.Inner();
		obj.display();
	}
}







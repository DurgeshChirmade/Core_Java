package demos;

class A{
	int i;
	final int j; //blank final field - needs to be initialized in each constructor
	A() {
		j=10;
	}
	A(int n){
		j=20;
	}
	
}






public class TestApp {

	public static void main(String[] args) {
		final double PI;   //blank final variable
		PI = 3.142;
		System.out.println(PI);
		//PI = 3.142;
	}
	
	

}

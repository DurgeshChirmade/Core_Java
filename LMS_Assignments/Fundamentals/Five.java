import java.io.*;

class Calculator{
	private int a;
	private int b;

	public Calculator(int a,int b){
		this.a=a;
		this.b=b;
	}

	public int addition(){
		return a+b;
	}

	public int subtraction(){
		return a-b;
	}

	public int multiplication(){
		return a*b;
	}

	public int division(){
		return a/b;
	}
}

public class Five{
	public static void main(String args[]){

		Calculator c = new Calculator(40,20);

		System.out.println("Addition : "+c.addition());
		System.out.println("Subtraction : "+c.subtraction());
		System.out.println("Multiplication : "+c.multiplication());
		System.out.println("Division : "+c.division());
	}
}
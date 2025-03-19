import java.io.*;

class MyNumber{
	private int num;

	MyNumber(){
		this.num=0;
	}
	MyNumber(int num){
		this.num=num;
	}
	boolean isNegative(){
		return num<0;
	}
	boolean isPositive(){
		return num>0;
	}
	boolean isZero(){
		return num==0;
	}
	boolean isOdd(){
		return num%2==1;
	}
	boolean isEven(){
		return num%2==0;
	}
}

public class First{
	public static void main(String args[]){

		MyNumber mn = new MyNumber(10);

		if(mn.isNegative()){
			System.out.println("Number is negative number.");
		}
		if(mn.isPositive()){
			System.out.println("Number is Positive number.");
		}
		if(mn.isZero()){
			System.out.println("Number is zero.");
		}
		if(mn.isOdd()){
			System.out.println("Number is odd number.");
		}
		if(mn.isEven()){
			System.out.println("Number is even number.");
		}
	}
}
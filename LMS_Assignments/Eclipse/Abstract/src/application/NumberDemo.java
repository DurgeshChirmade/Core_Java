package application;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.operation.MyNumber;

public class NumberDemo {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		MyNumber mn = new MyNumber();
		
		System.out.print("Enter your number : ");
		int num = Integer.parseInt(br.readLine());
		
		System.out.println("Odd Number : "+mn.isOdd(num));
		System.out.println("Even Number : "+mn.isEven(num));
		System.out.println("Prime Number : "+mn.isPrime(num));
		System.out.println("Factorial : "+mn.calFactorial(num));
	}

}

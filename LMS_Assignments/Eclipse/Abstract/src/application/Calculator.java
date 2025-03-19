package application;

import com.calculate.SimpleCalculator;

public class Calculator {
	public static void main(String[] args) {

		SimpleCalculator s = new SimpleCalculator();

		System.out.println("Addition : " + s.add(10, 20));
		System.out.println("Subtraction : " + s.subtract(30, 20));
		System.out.println("Multiply : " + s.multiply(10, 20));
		System.out.println("Division : " + s.divide(60, 15));
	}

}

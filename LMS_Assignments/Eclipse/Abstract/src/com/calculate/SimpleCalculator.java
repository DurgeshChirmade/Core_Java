package com.calculate;

public class SimpleCalculator implements iCalculator {

	@Override
	public double add(int a, int b) {
		return a+b;
	}

	@Override
	public double subtract(int a, int b) {
		if(a>b) {
			return a-b;
		}
		else {
			return b-a;
		}
	}

	@Override
	public double multiply(int a, int b) {
		return a*b;
	}

	@Override
	public double divide(int a, int b) {
		return a/b;
	}

}

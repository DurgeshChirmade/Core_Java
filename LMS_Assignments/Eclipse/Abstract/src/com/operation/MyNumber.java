package com.operation;

public class MyNumber implements basicIntOperation,AdvIntOperations {

	@Override
	public boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

	@Override
	public double calFactorial(int num) {
		double fact=1;
		for(int i=1;i<=num;i++) {
			fact *= i;
		}
		return fact;
	}

	@Override
	public boolean isOdd(int num) {
		if(num%2==1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}
		return false;
	}

}

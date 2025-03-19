package application;

import com.scientific.ScientificCalculator;

public class ScientificCalculate {

	public static void main(String[] args) {
		
		ScientificCalculator sc = new ScientificCalculator();
		
		System.out.println("Sin : "+sc.sin(45));
		System.out.println("Cos : "+sc.cos(45));
		System.out.println("Tan : "+sc.tan(45));
	}

}

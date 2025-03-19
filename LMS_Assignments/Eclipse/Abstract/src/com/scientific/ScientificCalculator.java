package com.scientific;

public class ScientificCalculator implements iScientificCalculator {

	@Override
	public double sin(double angle) {
		return Math.sin(angle);
	}

	@Override
	public double cos(double angle) {
		return Math.cos(angle);
	}

	@Override
	public double tan(double angle) {
		return Math.tan(angle);
	}

}

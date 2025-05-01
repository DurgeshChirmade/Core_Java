package com.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class EightteenClass {

	public static void main(String[] args) {

		Set<Customers> c = new LinkedHashSet<>();

		c.add(new Customers("CCC", 7500));
		c.add(new Customers("BBB", 12000));
		c.add(new Customers("BBB", 12000));
		c.add(new Customers("GGG", 14300));
		c.add(new Customers("AAA", 15000));
		c.add(new Customers("AAA", 15000));
		c.add(new Customers("DDD", 17500));
		c.add(new Customers("EEE", 21500));
		c.add(new Customers("EEE", 21500));
		c.add(new Customers("FFF", 29000));

		for (Customers cs : c) {
			System.out.println("Output --> " + cs);
		}

	}

}

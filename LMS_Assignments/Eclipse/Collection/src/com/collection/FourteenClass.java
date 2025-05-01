package com.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class FourteenClass {

	public static void main(String[] args) {

		Queue<String> q = new PriorityQueue<String>();

		q.add("sdf");
		q.add("abc");
		q.add("qwr");
		q.add("qsdrt");
		q.add("azxcft");

		System.out.println(q);
		System.out.println("Size : " + q.size());

		System.out.println(q.poll());

		System.out.println("Size : " + q.size());

		System.out.println(q.poll());

		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());

		System.out.println("Size : " + q.size());

	}

}

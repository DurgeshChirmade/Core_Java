package com.thread;

public class FirstClass {

	public static void main(String[] args) {

		Thread tob = Thread.currentThread();

		System.out.println("Name : " + tob.getName());
		System.out.println("Priority : " + tob.getPriority());
		System.out.println("Group : " + tob.getThreadGroup());
		System.out.println(tob);
	}

}

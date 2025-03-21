package com.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StackOverflowException extends Exception{
	private String msg;
	
	public StackOverflowException(String m) {
		super(m);
		this.msg=m;
	}
}

class StackUnderflowException extends Exception{
	private String msg;
	
	public StackUnderflowException(String m) {
		super(m);
		this.msg=m;
	}
}

class Stack{
	private int arr[];
	private int size;
	private int top;
	
	public Stack() {
		super();
	}

	public Stack(int[] arr, int size, int top) {
		super();
		this.arr = arr;
		this.size = size;
		this.top = top;
	}
	
	public void push(int data) throws StackOverflowException {
		if(!(top==size-1)) {
			arr[top++]=data;
		}
		else {
			throw new StackOverflowException("Stack is full already");
		}
	}
	
	public int pop() throws StackUnderflowException {
		if(!(top==-1)) {
			return arr[--top];
		}
		else {
			throw new StackUnderflowException("Stack is empty already."); 
		}
	}
	
	public void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
}

public class SevenClass {
	
	public static void main(String[] args) {
		
		try {
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		int size;
		
		System.out.print("Enter your size of array : ");
		size = Integer.parseInt(br.readLine());
		
		int arr[]=new int[size];
		
		for(int i=0;i<6;i++) {
			System.out.print("Enter Data : ");
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		
		Stack st = new Stack(arr,size,6);
		
		st.push(25);
		st.push(35);
		st.pop();
		st.pop();
		}
		catch(StackOverflowException e) {
			e.printStackTrace();
		}
		catch (StackUnderflowException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}

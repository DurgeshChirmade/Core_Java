package myclasses;

public class Stack<T> {
	T[] arr;
	int top;
	int size;
	
	public Stack() {
		
	}
	
	public Stack(int size) {
		
	}
	
	public void push(T ele) {
		if(top == size-1)
			throw new RuntimeException("Stack full");
		arr[++top] = ele;
	}
	
	public T pop() {
		if(top == -1)
			throw new RuntimeException("Stack empty");
		return arr[top--];
	}

}

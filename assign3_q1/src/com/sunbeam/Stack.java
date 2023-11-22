package com.sunbeam;

public class Stack {
	private int[] arr;
	private int top;
	private final int SIZE;
	private int max;
	
	public Stack(int size) {
		this.SIZE = size;
		arr = new int[SIZE];
		top = SIZE;
		max = -84651465;
	}
	
	public void push(int num) {
		top--;
		arr[top]=num;
		if(num>max) {
			max=num;
		}
	}
	
	public int pop() {
		return arr[top++];
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top==SIZE;
	}
	
	public boolean isFull() {
		return top==0;
	}
	
	public int getMax() {
		return max;
	}
}

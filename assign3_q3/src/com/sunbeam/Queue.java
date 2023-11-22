package com.sunbeam;

public class Queue {
	private int arr[];
	private int rear,front;
	private final int SIZE;
	public Queue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = 0;
	}
	
	public void push(int num) {
		arr[rear] = num;
		rear++;
	}
	
	public int pop() {
	    int num = arr[front];
	    front++;
	    return num;
	}

	public int peek() {
	    return arr[front];
	}
	
	public boolean isEmpty() {
		return front==rear;
	}
	
	public boolean isFull() {
	    return rear == SIZE;
	}
}

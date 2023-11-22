package com.sunbeam;

public class CircularQueue {
	private int arr[];
	private int rear,front,counter;
	private final int SIZE;
	public CircularQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = -1;
		counter=0;
	}
	
	public void push(int num) {
		rear = (rear+1)%SIZE;
		arr[rear] = num;
		counter++;
	}
	
	public int pop() {
		int num = arr[(front+1)%SIZE];
		front = (front+1)%SIZE;
		if(front==rear) {
			front=rear=-1;
		}
		counter--;
		return num;
	}

	public int peek() {
	    return arr[(front+1)%SIZE];
	}
	
	public boolean isEmpty() {
//		return front==rear && rear==-1;
		return counter==0;
	}
	
	public boolean isFull() {
//	    return (front==-1 && rear == SIZE-1) || (front==rear&&rear!=-1);
		return counter==SIZE;
	}

}

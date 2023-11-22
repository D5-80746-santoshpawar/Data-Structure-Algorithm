package com.sunbeam;

import java.util.Scanner;

public class MainStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack st = new Stack(3);
		int choice;
		do {
			System.out.println("0. Exit \n1. Push\n2. Pop\n3. Peek\n4. Get Max");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (!st.isFull()) {
				System.out.println("Enter the number : ");
				int num = sc.nextInt();
				st.push(num);
				System.out.println("Element added to the stack");}
				else {
					System.out.println("Stack is full");
				}
				break;
			case 2:
				if(!st.isEmpty()) {
				int ele = st.pop();
				System.out.println("Popped Element : "+ele);}
				else {
					System.out.println("Stack is empty");
				}
				break;
			case 3:
				if(!st.isEmpty()) {
					int peek = st.peek();
					System.out.println("Top element : "+peek);
				} else {
					System.out.println("Stack is empty");
				}
				break;
			case 4:
				if(!st.isEmpty()) {
					int res = st.getMax();
					System.out.println("Max element : "+res);
				} else {
					System.out.println("Stack is empty");
				}
				break;
			default:
				break;
			}
		}while(choice!=0);
		

	}

}

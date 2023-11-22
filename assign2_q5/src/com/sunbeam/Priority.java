package com.sunbeam;

import java.util.Scanner;

public class Priority {
	
	public static int priority(char opr) {
		switch(opr) {
		case '$': return 10;
		case '/': return 9;
		case '*': return 9;
		case '%': return 9;
		case '+': return 8;
		case '-': return 8;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operator (+-/*%$) : ");
		char c = sc.next().charAt(0); 
		int res = priority(c);
		System.out.println(res);
		

	}

}

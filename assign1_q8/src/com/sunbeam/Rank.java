package com.sunbeam;

import java.util.Scanner;

public class Rank {
	
	public static int rankOfInteger(int[] arr,int n) {
		int count = 0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]<=n) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 15, 3, 4, 4, 1 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int rank = rankOfInteger(arr, num);
		System.out.println("Rank of "+ num +" is: "+rank);
	}

}

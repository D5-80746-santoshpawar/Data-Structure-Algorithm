package com.sunbeam;

import java.util.Scanner;

public class SearchAlgorithm {
	
	public static int linearSearch(int[] arr,int key,int n) {
		int count = 0;
		for (int i=0;i<arr.length-1;i++) {
			if (key==arr[i]) {
				count++;
				if (count==n) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {11,22,16,15,54,85,11,36,79,11,54,16,14,57,11,52,11};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key : ");
		int key = sc.nextInt();
		System.out.println("Enter the occurence : ");
		int n = sc.nextInt();
		int index = linearSearch(arr, key, n);
		if (index!=-1) {
			System.out.println("Found : Index = "+index);
		} else {
			System.out.println("Not found");
		}
	}

}

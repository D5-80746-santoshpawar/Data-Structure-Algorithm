package com.sunbeam;

import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearch(int[] arr, int key) {
		int left = 0,right = arr.length-1;
		while (left<=right) {
			int mid = (left+right)/2;
			if (key==arr[mid]) {
				return mid;
			} else if (key>arr[mid]) {
				right = mid-1;
			} else {
				left = mid+1;
			}
		}
		
		
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {90,80,70,60,50,40,30,20,10};
		System.out.println("Enter the key : ");
		int key = sc.nextInt();
		int index = binarySearch(arr, key);
		if (index!=-1) {
			System.out.println("Index : "+index);
		} else {
			System.out.println("Key not found");
		}

	}

}

package com.sunbeam;

import java.util.Scanner;

public class Comparisons {
	private static int index;
	
	public static int linearSearch(int[] arr, int key) {
		index = -1;
		int count=0;
		for (int i=0;i<arr.length;i++) {
			count++;
			if (key==arr[i]) {
				index = i;
				return count;
			}
		}
		return count;
	}
	
	public static int binarySearch(int[] arr, int key) {
		index=-1;
		int count=0;
		int left=0,right=arr.length-1;
		while(left<=right) {
			count++;
			int mid = (left+right)/2;
			if (key==arr[mid]) {
				index = mid;
				return count;
			} else if (key>arr[mid]) {
				left = mid+1;
			} else {
				right = mid-1;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {55,88,54,65,87,69,41,25}; // Linear Search Array
		int[] arr1 = {11,22,33,44,55,66,77,88,99}; // Binary search array
		
		System.out.println("Enter a number for search : ");
		int key1 = sc.nextInt();
		
		
		int count = linearSearch(arr, key1); 
		
		
		
		System.out.println("Linear Search : ");
		if (index!=-1) {
			System.out.println("Key found..");
			System.out.println("Number of Comparisons : "+count);
		} else {
			System.out.println("Key not found..");
			System.out.println("Number of Comparisons : "+count);
		}
		
		int count1 = binarySearch(arr, key1);
		System.out.println("Binary Search : ");
		if (index!=-1) {
			System.out.println("Key found..");
			System.out.println("Number of Comparisons : "+count1);
		} else {
			System.out.println("Key not found..");
			System.out.println("Number of Comparisons : "+count1);
		}
		
		
	}

}

package com.sunbeam;

import java.util.Arrays;

public class SelectionSort {
	private static int count;
	
	public static int[] selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for (int j=i+1;j<arr.length;j++) {
				count++;
				if (arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 15, 3, 4, 4, 1 };
		arr = selectionSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("No. of comparisons = "+count);

	}

}

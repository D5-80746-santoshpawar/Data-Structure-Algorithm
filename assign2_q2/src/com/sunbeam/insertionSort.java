package com.sunbeam;

import java.util.Arrays;

public class insertionSort {

	public static void insertionSort(int[] arr) {
		int count=0;
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i];
			int j;
			for(j=i-1;j>=0 && arr[j]<temp;j--) {
				count++;
				arr[j+1]=arr[j];
			}
			arr[j+1] = temp;
		}
		System.out.println("No. of comparisons = "+count);
	}

	public static void main(String[] args) {
		int[] arr = {25,34,69,12,54,78,52,41,12};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));

		insertionSort(arr);
		
		System.out.println("Array after sort : " + Arrays.toString(arr));

	}

}

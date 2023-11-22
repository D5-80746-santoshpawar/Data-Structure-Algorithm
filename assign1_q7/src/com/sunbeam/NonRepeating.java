package com.sunbeam;

public class NonRepeating {
	
	public static int nonRepeating(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			int count = 0;
			for (int j=0;j<arr.length-1;j++) {
				if (arr[i]==arr[j]) {
					count++;
				}
			}
			if (count==1) {
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, -1, 4, 1, 0, 4, -1, 7, 8 };
		int ele = nonRepeating(arr);
		if (ele!=-1) {
			System.out.println(ele);
		} else {
			System.out.println("not found");
		}

	}

}

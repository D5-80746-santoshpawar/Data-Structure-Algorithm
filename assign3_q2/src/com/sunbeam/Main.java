package com.sunbeam;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55,66,77,88};
		
		System.out.println("Before : ");
		System.out.println("Array = "+Arrays.toString(arr));
		Stack st = new Stack(arr.length);
		for(int i=0;i<arr.length;i++) {
			st.push(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = st.pop();
		}
		
		System.out.println("After : ");
		System.out.println("Array = "+Arrays.toString(arr));
		
		

	}

}

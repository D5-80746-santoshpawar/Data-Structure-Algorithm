package assign1_q2;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int[] arr,int key) {
		for(int i=arr.length-1;i>=0;i--) {
			if (key==arr[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {55,88,54,65,87,69,41,25};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key : ");
		int key = sc.nextInt();
		int index = linearSearch(arr,key);
		if (index!=-1) {
			System.out.println("Key found : Index = "+index);
		} else {
			System.out.println("Key not found");
		}
	}

}

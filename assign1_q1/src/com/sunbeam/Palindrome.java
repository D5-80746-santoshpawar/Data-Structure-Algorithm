package com.sunbeam;

public class Palindrome {
	
	public static boolean method1(String str) {
		StringBuilder sb = new StringBuilder(str);
		String s = sb.reverse().toString();
		if (s.equals(str)) {
			System.out.println("Palindrome");
			return true;
		}
		System.out.println("Not a palindrome");
		return false;
	}
	
	public static boolean method2(StringBuilder str) {
		int left = 0;
		int right = str.length()-1;
		while (left<=right) {
			if (str.charAt(left)!=str.charAt(right)) {
				System.out.println("Not a palindrome");
				return false;
			}
			left++;
			right--;
		}
		System.out.println("A palindrome");
		return true;
	}

	public static void main(String[] args) {
		method1("Madam"); //Time complexity - O(n) , Space complexity - O(n)
		StringBuilder s = new StringBuilder("Bhanu");
		System.out.println(s.charAt(0));
		method2(new StringBuilder("madam")); // Time complexity - O(n) , Space complexity - O(1)
	}

}

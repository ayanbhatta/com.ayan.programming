package com.ayan.programming.string;

public class checkPalindrome {
	public static void main(String[] args) {
		String str="aba";
		System.out.println(isPalindrome(str));
		
	}
	static boolean isPalindrome(String str) {
		int start=0;
		int end=str.length()-1;
		while(start<end) {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}return true;
	}
}

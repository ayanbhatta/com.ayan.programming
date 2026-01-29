package com.ayan.programming.array;

public class checkAsce {
	public static void main(String[] args) {
		int[] a = {2,3,4};
		System.out.println(isAsce(a));
		System.out.println(isSorted(a));
	}
	static boolean isAsce(int[] a) {
		for (int i = 0; i < a.length -1 ; i++) {
			if(a[i]> a[i+1]) 
				return false;
		}
		return true;
	}
	static boolean isDesc(int[] a) {
		for (int i = 0; i < a.length -1 ; i++) {
			if(a[i] < a[i+1]) 
				return false;
		}
		return true;
	}
	static boolean isSorted(int[] a) {
		if(isAsce(a))	return true;
		else if(isDesc(a))	return true;
		else
			return false;
	}
	
}

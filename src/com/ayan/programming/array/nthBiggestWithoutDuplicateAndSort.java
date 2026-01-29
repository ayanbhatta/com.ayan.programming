package com.ayan.programming.array;

public class nthBiggestWithoutDuplicateAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,3,1,6,5,9,8};
		int n=2;
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]>a[j])
					count++;
			}if(count == a.length - n) {
				System.out.println(a[i]);
				break;
			}
		}
	}

}

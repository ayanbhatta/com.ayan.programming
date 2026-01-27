package com.ayan.programming.array;

import java.util.Arrays;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int[] a = {10,20,20,30,30};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i] != a[j])
					count++;
			}
		}
		int[] b = new int[count];
		System.out.println(Arrays.toString(b));
	}

}

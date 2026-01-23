package com.ayan.programming.array;

import java.util.Arrays;

public class moveZeros2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5,0,2,0,1,0};
		int index=a.length-1;
		//sorting non-zero element
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0) {
				a[index] = a[i];
				index--;
			}
		}
		while (index >= 0) {
		    a[index] = 0;
		    index--;
		}
		System.out.println(Arrays.toString(a));
	}

}

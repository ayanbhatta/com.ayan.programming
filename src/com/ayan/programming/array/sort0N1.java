package com.ayan.programming.array;

import java.util.Arrays;

public class sort0N1 {
	public static void main(String[] args) {
		int[] a = {0,0,1,1,0,1,0,1,1,1};
		int index = a.length-1;
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0) {
				a[index] = a[i];
				index--;
			}
		}
		for(int i = a.length-1; i >= 0;i--) {
			a[index]=0;
			index--;
		}
		
		System.out.println(Arrays.toString(a));
	}
}

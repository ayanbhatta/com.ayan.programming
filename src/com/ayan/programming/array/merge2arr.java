package com.ayan.programming.array;

import java.util.Arrays;

public class merge2arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20};
		int b[]= {10,20};
		int newArr[] = merge(a,b);
		System.out.println(Arrays.toString(newArr));
	}
	public static int[] merge(int[] a,int[] b) {
		int c[]=new int[a.length+b.length];
		for(int i=0;i<=a.length-1;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<=b.length-1;i++) {
			c[a.length+i] = b[i];
		}
		return c;
	}

}

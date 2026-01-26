package com.ayan.programming.array;

import java.util.Arrays;

public class mergeZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,20,30};
		int[] b = {100,200,300,400};
		System.out.println(Arrays.toString(zigZac(a,b)));
		System.out.println(Arrays.toString(mergeInSort(a,b)));
		
	}
	public static int[] zigZac(int[] a, int[] b) {
		int[] c = new int[a.length+b.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<= a.length-1 && j <= b.length-1) {
			c[k++] = a[i++];
//			k++;i++;
			
			c[k++] = b[j++];
//			k++;j++;
		}
		while(i<= a.length-1) {
			c[k++] = a[i++];
//			k++;i++;
		}
		while(j<= b.length-1) {
			c[k++] = b[j++];
//			k++;j++;
		}
		return c;
	}
	public static int[] mergeInSort(int[] a,int[] b) {
		int[] c = new int[a.length + b.length];
		int i=0,j=0,k=0;
		while(i<= a.length-1 && j <= b.length-1) {
			if(a[i]<b[j]) {
				c[k] = a[i];
				k++;i++;
			}else {
				c[k]=b[j];
				k++;j++;
			}
		}
		while(i<= a.length-1) {
			c[k++] = a[i++];
//			k++;i++;
		}
		while(j<= b.length-1) {
			c[k++] = b[j++];
//			k++;j++;
		}
		return c;
	}
}

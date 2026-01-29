package com.ayan.programming.arraywithhashset;

import java.util.Arrays;
import java.util.HashSet;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,80,20,20,40,30,30,30,30};
		int[] newArr=getHashSet(a);
		System.out.println(Arrays.toString(newArr));
		System.out.println(nthLargest(newArr,1));
		System.out.println(nthSmallest(newArr,1));
	}
	
	public static int[] getHashSet(int[] a) {
			HashSet<Integer> hs = new HashSet<Integer>();
			for (int i = 0; i < a.length; i++) {
				hs.add(a[i]);
			}
			
			int[] b = new int[hs.size()];
			int i =0;
			for(int ele : hs) {
				b[i] = ele;
				i++;
			}
			Arrays.sort(b);
			return b;
		
	}
	public static int nthLargest(int[] a,int n) {
		int res =0;	
		if(n<0 && n>=a.length) {
				System.out.println("Invalid Input");
			}
			else {
				res = a[a.length-n];
				
			}return res;
	}
	public static int nthSmallest(int[] a,int n) {
		int res =0;	
		if(n<0 && n>=a.length) {
			System.out.println("Invalid Input");
		}
		else {
			res = a[n-1];
			
		}return res;
	}

}

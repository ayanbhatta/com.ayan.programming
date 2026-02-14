package com.ayan.programming.array;

import java.util.Arrays;
import java.util.HashSet;

public class nthMaxEleWithoutDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,20,30,50,40,30,20,10};
		;
		int[] newArr= removeDuplicate(a);
		System.out.println(nthMax(newArr));
	}
	static int[] removeDuplicate(int[] a) {
		HashSet<Integer> hs = new HashSet<>();
		for(int ele : a) {
			hs.add(ele);
		}
		int[] b = new int[hs.size()];
		int i=0;
		for(int ele: hs) {
			b[i] = ele;
			i++;
		}
		return b;
	}
	static int nthMax(int[] a) {
		int n=2;int max=0;
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if(a[i] > a[j])
					count++;
			}
			if(count == a.length - n)
				return a[i];
		}
		return -1;
	}

}

package com.ayan.programming.array;

import java.util.Iterator;

public class missingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,1,10,7};
		int small=a[0], big=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<small)
				small=a[i];
			if(a[i]>big)
				big=a[i];
		}
		
		for(int i=small;i<=big;i++) {
			if(isMissing(i,a))
				System.out.println(i);
		}
	}

	 static boolean isMissing(int target, int[] a) {
		// TODO Auto-generated method stub
		 for (int i = 0; i < a.length; i++) {
			if(a[i]==target)
				return false;
		}
		return true;
	}

}

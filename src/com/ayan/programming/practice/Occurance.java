package com.ayan.programming.practice;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,2,1,3,3};
		boolean[] b = new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			int count = 1;
			if(b[i] == false) {
				for (int j = i+1; j < a.length; j++) {
					if(a[i]==a[j]) {
						count++;
						b[j] = true;
					}
				}
			}
			System.out.println(a[i]+"-> "+ count);
		}
	}

}

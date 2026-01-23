package com.ayan.programming.array;

public class maxSumOfSubArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,-2,3,-1,2,1};
		int res=a[0];
		for (int i = 0; i < a.length; i++) {
			int currSum=0;
			for (int j = i; j < a.length; j++) {
				currSum+=a[j];
				res=Math.max(currSum, res);
				//System.out.print(currSum+" ");
				//System.out.print(res+" ");
				
			}
			
		}
		System.out.println(res);
	}

}

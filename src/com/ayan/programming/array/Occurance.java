package com.ayan.programming.array;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,10,30,20};
//		for(int i=0;i<arr.length;i++) {
//			int count = 1;
//			for(int j=i+1;j< arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					count++;
//				}
//			}System.out.println(arr[i]+" -> "+count);
//		}
		boolean[] b = new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(b[i]==false) {
				int count = 1;
				for(int j=i+1;j< arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
						b[j]=true;
					}
				}
				System.out.println(arr[i]+" -> "+count);
			}		
		}
	}

}

package com.ayan.programming.array;

import java.util.HashMap;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,10,30,20};
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
		occuranceUsingHashMap(arr);;
	}

	private static void occuranceUsingHashMap(int[] a) {
		// TODO Auto-generated method stub
//		System.out.println(" 12");
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int ele : a) {
			if(map.containsKey(ele))
				map.put(ele, map.get(ele)+1);
			else
				map.put(ele, 1);
		}
		System.out.println(map);
	}

}

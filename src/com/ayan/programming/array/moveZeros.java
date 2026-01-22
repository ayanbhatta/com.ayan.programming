package com.ayan.programming.array;

import java.util.Arrays;

public class moveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5,0,2,0,1,0};
		
		
		//TRY
//		for (int i = 0; i < a.length; i++) {
//			if(a[i]==0 && a[i]<a.length-2)
//				swap(a[i],a[i+1] ,a);
//		}
//		System.out.println(Arrays.toString(a));
		
		int index=0;
		//sorting non-zero element
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0) {
				a[index] = a[i];
				index++;
			}
		}
		for (int i = index; i < a.length; i++) {
			a[i]=0;
		}
		System.out.println(Arrays.toString(a));
	}

	
	
	
	
	 static void swap(int i, int j,int[] a) {
		// TODO Auto-generated method stub
		 int temp=a[i];
		 a[i]=a[j];
		 a[j]=temp;
		 
		
	}

}

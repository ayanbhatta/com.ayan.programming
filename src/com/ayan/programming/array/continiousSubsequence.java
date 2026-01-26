package com.ayan.programming.array;

public class continiousSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,11,12, 22, 9, 33, 21, 50, 60, 80, 5};
       int maxCount = 0;
       int count = 1;
       for (int i = 0; i < a.length-2; i++) {
    	   if(a[i]+1 == a[i+1])
    		   count++;
    	   else {
    		   count=1;
    	   }
    		   if(count>maxCount) {
    			   maxCount=count;
    		   }
    	
    	   
       }
       System.out.println(maxCount);
	}

}

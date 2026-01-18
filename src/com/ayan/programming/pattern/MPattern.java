package com.ayan.programming.pattern;

public class MPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j&&(i<=(n/2)+1)|| j==1 || j==n ||i+j==n+1&&(i<=(n/2)))	System.out.print("* ");
				else	System.out.print("  ");
			}
			System.out.println();
		}
	
	}

}

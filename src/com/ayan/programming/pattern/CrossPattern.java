package com.ayan.programming.pattern;

public class CrossPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j||i+j==n+1)	System.out.print("* ");
				else	System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("---------------------------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j||i+j==n+1 ||i==1||j==1||i==n||j==n)	System.out.print("* ");
				else	System.out.print("  ");
			}
			System.out.println();
		}
	}
	

}

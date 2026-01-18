package com.ayan.programming.pattern;

public class AdvancePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n/2+1 || j==n/2+1 || j==1&&i<=n/2+1 || i==1 && j>=n/2+1 || i==n &&j<=n/2+1 || j==n&&i>=n/2+1)    System.out.print("* ");
                else    System.out.print("  ");
            }System.out.println();
        }
	}

}

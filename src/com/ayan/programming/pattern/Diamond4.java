package com.ayan.programming.pattern;

public class Diamond4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i =1;i<=4;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=2*i-1;k++) {
				if(i%2==0) {
					System.out.print((char)(k+64)+" ");
				}
				else {
					System.out.print((char)(k+96)+" ");
				}
			}System.out.println();
		}
		for(int i =n-1;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=2*i-1;k++) {
				if(i%2==0) {
					System.out.print((char)(k+64)+" ");
				}
				else {
					System.out.print((char)(k+96)+" ");
				}
			}
			System.out.println();
		}
	}

}

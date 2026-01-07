package com.ayan.programming.pattern;

public class PatternPyramid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
		
			for(int j=1;j<=n-i;j++ ) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");	
			}
			for(int k=i-1;k>=1;k--) {
				System.out.print(k+" ");
			}
				
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------");
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n-i;j++ ) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print((char)(k+96)+" ");	
			}
			for(int k=i-1;k>=1;k--) {
				System.out.print((char)(k+96)+" ");
			}
				
			System.out.println();
		}
	}

}

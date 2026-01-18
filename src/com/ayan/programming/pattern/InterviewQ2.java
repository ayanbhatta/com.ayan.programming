package com.ayan.programming.pattern;

public class InterviewQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int st=(n/2)+1;
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=st;j++) {
				System.out.print("* ");
			}
			if(i<=n/2) st--;
			else st++;
			System.out.println();	
		}
	}

}

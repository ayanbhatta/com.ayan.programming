package com.ayan.programming.string;

public class countVowelAndConsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcd";
		System.out.println(countVowel(str));
		System.out.println(countConsonent(str));
	}
	static int countVowel(String str) {
		int count =0;
		for (int i = 0; i < str.length(); i++) {
			if(("aeiouAEIOU").indexOf(i) != -1) {
				count++;
			}
		}
		return count;
	}
	static int countConsonent(String str) {
		int count =0;
//		if(countVowel(str)) 
			
		
		return count;
	}

}

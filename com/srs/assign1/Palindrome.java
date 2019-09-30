package com.srs.assign1;

import java.util.Scanner;

public class Palindrome {
	public static boolean isPalindrome(String word ){
		boolean flag=true;
		for(int i=0;i<word.length()/2;i++){
			if(word.charAt(i)!=word.charAt(word.length()-1-i)){
				flag=false;
				break;
			}
		}
		return flag;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String you want to check:");
		String s=sc.next();
		System.out.println(isPalindrome(s)?"yes":"no");
		
	}

}

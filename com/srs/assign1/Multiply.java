package com.srs.assign1;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int n=sc.nextInt();
		if(n>=2 && n<=20){
			for(int i=1;i<=10;i++){
				System.out.println(n+"*"+i+"="+n*i);
			}
		}
		System.out.println("No should be greater than 1");
}
}


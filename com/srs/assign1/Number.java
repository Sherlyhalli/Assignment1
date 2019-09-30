package com.srs.assign1;

public class Number {
		int x=10;
		int y=20;
		public static void main(String[] args) {
			int x=10;
			int y=20;
			System.out.println("Before Swapping");
			System.out.println("Value of x" + x);
			System.out.println("Value of y" + y);
			x=x+y;
			y=x-y;
			x=x-y;
			System.out.println("After Swapping");
			System.out.println("Value of x" + x);
			System.out.println("Value of y" + y);
		}
}


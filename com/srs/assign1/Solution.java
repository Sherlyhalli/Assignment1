package com.srs.assign1;

class Arithemetic{
	int sum=0;
	int add(int a,int b ){
		return sum=a+b;
	}
	public String toString(){
		return "Arithemetic";
	}
}
class Adder extends Arithemetic{
	
}
public class Solution {

	public static void main(String[] args) {
		Adder adder=new Adder();
		System.out.println("My Superclass is " + adder.getClass().getSuperclass().getName());
		int x=adder.add(10,32);
		int y=adder.add(10,3);
		int z=adder.add(10,10);
		System.out.println(x+" "+y+" "+z);

	}

}

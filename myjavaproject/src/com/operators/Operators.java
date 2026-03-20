package com.operators;

public class Operators {

	public static void main(String[] args) {
		int a=5;
		int b=3;
		
		System.out.println(a & b);

		System.out.println(a | b);

		System.out.println(a ^ b);
		System.out.println("******************************");
		
		int x=10;
		System.out.println(x ^ 3); 
		System.out.println("******************************");
		
		int x1=3;
		int y= x1 << 2+1;
		System.out.println(y);
		System.out.println("******************************");
		System.out.println(1 << 2 << 3);
		System.out.println("******************************");
		int x2=5;
		int y2=(x2 > 3)?x2++ : ++x2;
		System.out.println(x2 + " " + y2);
		
		System.out.println("******************************");
		int a1=8;
		int b1=2;
		int c1=a1 >> b1 << 1;
		System.out.println(c1);
		
		

	}

}

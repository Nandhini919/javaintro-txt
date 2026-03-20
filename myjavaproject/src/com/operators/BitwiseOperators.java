package com.operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		System.out.println("Main Started");
		
		int a=10;
		int b=20;
		int c=10;
		
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);
		
		System.out.println(a == c & a != b);
		System.out.println("************************");
		System.out.println(72 & 10);//8
		System.out.println(36 & 4);//4
		System.out.println(65 & 6);//0
		System.out.println(24 & 3);//0
		
		
		System.out.println("************************");
		System.out.println(72 | 10);//74
		System.out.println(36 | 4);//36
		System.out.println(65 | 6);//71
		System.out.println(24 | 3);//27
		
		
		
		System.out.println("************************");
		System.out.println(true | true);
		System.out.println(true | false);
		System.out.println(false | true);
		System.out.println(false | false);
		
		System.out.println("************************");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("************************");
		
		System.out.println(72 ^ 10);//66
		System.out.println(36 ^ 4);//32
		System.out.println(65 ^ 6);//71
		System.out.println(24 ^ 3);//27
		
		System.out.println("************************");
		
		System.out.println(~10);
		System.out.println(~66);
		
	}

}

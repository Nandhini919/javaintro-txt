package com.operators;

public class UnaryOperators {

	public static void main(String[] args) {
		System.out.println("Main!!!!!!!!!!!");
		int m= +10;
		System.out.println(m);
		
		int n= -10;
		System.out.println(n);
		
		int o= 10;
		int p=5;
		System.out.println(++o);//11
		System.out.println(++p);//6
		System.out.println(o++);//11
		System.out.println(p++);//6
		System.out.println(++o);//13
		System.out.println(p++);//7
		System.out.println(o++);//13
		System.out.println(++p);//9
		System.out.println("n value:"+n);
		System.out.println("o value:"+o);
		
		

	}

}

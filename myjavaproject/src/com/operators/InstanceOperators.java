package com.operators;

public class InstanceOperators {

	public static void main(String[] args) {
		Integer i1=10;
		
		System.out.println(i1 instanceof Integer);
		System.out.println(i1 instanceof Number);
		System.out.println(i1 instanceof Object);
		
		String s1="nandhu";
		//incompactable conditional operand type string and integer
		//System.out.println(s1 instanceof Integer);
		
		Number n=214356;
		System.out.println(n instanceof Integer);
		System.out.println(n instanceof Number);
		
		Number n1=null;
		System.out.println(n instanceof Integer);
		System.out.println(n instanceof Number);
		
		
	}

}

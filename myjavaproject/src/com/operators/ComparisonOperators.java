package com.operators;

public class ComparisonOperators {

	public static void main(String[] args) {
		System.out.println("Main!!!!!!!!!!!");
		
		
		Integer i1=100;
		Integer i2=100;
		Integer i3=100;
		Integer i4=100;
		System.out.println(i1==i2);
		System.out.println(i3==i4);
		System.out.println("**************************************");
		
		
		String s1="Nandhu";
		String s2="Nandhu";
		System.out.println(s1==s2);
		System.out.println("**************************************");
		
		
		String s3= new String("Vamsii");
		String s4=new String("Vamsii");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println("**************************************");
		
		
		int i=10;
		int j=10;
		System.out.println(i==j);
		System.out.println("**************************************");
		
		
		float f1=10.5F;
		double f2=10.5;
		System.out.println(f1==f2);
		System.out.println("**************************************");
		
		
		char c='A';
		char c1='A';
		System.out.println(c==c1);
		
	}

}

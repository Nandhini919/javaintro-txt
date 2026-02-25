package com.languagefundamentals;
//char literals
//string literals
//boolean literals
//null literals
public class Literals3 {

	public static void main(String[] args) {
		System.out.println("Main method started!!");
		
		//int a=null;//invalid//type mismatch:cannot convert null to int.
		//null is a literal,we can store for only object data types whenever we don't want
		//the purpose,whenever we want to change the value later than we give a starting
		 String s=null;
		 Integer i=null;
		 Literals3 l=new Literals3();
		 System.out.println(s);
		 System.out.println(i);
		 System.out.println(l);
		
		//boolean we can store either true or false 
		boolean boo=true;
		boolean booo=false;
		if (boo) {
			System.out.println("become a java developer!!");
		}
		
		if (booo) {
			System.out.println("become a java full stack developer!!");
		}
		
		//collection of characters storing into a double quotes will consider as a string.
		String s1="Nandhu";//string constant pool
		String s2="Nandhu";
		String s3=new String("Nandhu");//heap directly
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		
		
		
		char c1='A';//single characters
		char c2=65;//ASCII values
		char c3='\u0040';//uni code characters
		char c4=126;
		char c5=1234;//junk characters
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println();
		
	}

}

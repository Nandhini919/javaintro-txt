package com.languagefundamentals;

public class Literals1 {

	public static void main(String[] args) {
		
		//binary literals -->base 2-->0 to 1
		int a13=0b1010;
		int a14=0b10111;
		int a15=0b1100;
		
		System.out.println(a13);//10
		System.out.println(a14);//12
		System.out.println(a15);//23
		
		System.out.println("*******************************");
		//hexa decimal literals:base is 16--> 0 to 9 or a-f& A-F -->a=10,b=11,c=12,d=13,e=14,f=15
		//hexa decimal we can represent with 0x or 0X
		int a7=0x123;
		int a8=0x567;
		int a9=0x6789;
		int a10=0xabc;
		int a11=0x1a2b3c;
		int a12=0xDAD;
		System.out.println(a7);//291
		System.out.println(a8);//26505
		System.out.println(a9);//2749
		System.out.println(a10);//1715004
		System.out.println(a11);//123
		System.out.println(a12);//4567
		System.out.println("*******************************");
		
		//decimal literals:base is 10-->0 to 9 numbers we can store here.
		int a1=123;
		int a2=4567;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println("*******************************");
		
		//octal literals:any number start with 0 will consider as octal.
		//base is 8--> 0 to 7 numbers can store here.
		int a3=0123;
		int a4=0345;
		System.out.println(a3);//83
		System.out.println(a4);//229
		int a5=0674;
		int a6=0765;
		System.out.println(a5);
		System.out.println(a6);
		
		
	}

}

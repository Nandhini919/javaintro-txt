package com.languagefundamentals;

public class DataTypes1 {
	byte b = 127;
	byte b2 = -128;
	byte b3 =(byte)256;
	
	short s=(short)32767 ;

	int n =b ;
	int i =100 ;
	int t =(int)214765788L;
	
	long l  ;

	float f  ;
	double d ;

	char  c='A';
	char  c1=97;
	boolean boo=false;
    int i3='A';
	public static void main(String[] args) {
		System.out.println("main!!!!");
		DataTypes1 t1 = new DataTypes1();
		
		System.out.println("byte value:" + t1.b);
		System.out.println("byte value:" + t1.b2);
		System.out.println("byte value:" + t1.b3);
		System.out.println("short value:" + t1.s);
		
		System.out.println("int value:" + t1.n);
		System.out.println("int value:" + t1.i);
		System.out.println("int value:" + t1.t);
		System.out.println("long value:" + t1.l);
		
		System.out.println("float value:" + t1.f);
		System.out.println("double value:" + t1.d);
		
		System.out.println("char value:" + t1.c);
		System.out.println("char value:" + t1.c1);
		System.out.println("boolean value:" + t1.boo);
		
		System.out.println("char value:" + t1.i3);

	}
}

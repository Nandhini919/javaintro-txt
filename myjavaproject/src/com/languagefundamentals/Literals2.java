package com.languagefundamentals;

public class Literals2 {
//Floating literals
//byte-->short-->long-->float-->double
	public static void main(String[] args) {
		
		float f1=100;
		//float f2=0123;
		float f3=123F;
		//float f4=123.5;
		//float f5=123.5F;
		float f6=0x123;//hexa-->int-->float
		//float f7=0123.5;
		float f7a=0123.5F;//float-->123.5
		float f8=0123.5F;//invalid:hex literal number
		float f9=0x123F;
		float f10=1230.5F;
		float f11=456.67F;
		
		System.out.println(f1);//100.0
		//System.out.println(f2);//83.0
		System.out.println(f3);//123.0
		//System.out.println(f4);//invalid:double cannot convert to float
		//System.out.println(f5);//123.5
		System.out.println(f6);//291.0 
		//System.out.println(f7);//invalid:double cannot convert to float
		System.out.println(f7a);//123.5
		System.out.println(f8);//123.5
		System.out.println(f9);//4671.0
		System.out.println(f10);//1230.5
		System.out.println(f11);
		
	}

}

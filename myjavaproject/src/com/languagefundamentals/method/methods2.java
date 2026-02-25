package com.languagefundamentals.method;
//no args + no return type
//calculation of 2 numbers and print same.
//addition()--> +
//subtraction()--> -
//multiplication--> *
//division()--> /
//modulus-->n%

public class methods2 {
	
void addition() {
	int a=10;
	int b=20;
	String s="abc";
	String t="def";
	System.out.println(a+b);
	System.out.println(s+t);
}
void subtraction() {
	int a=16;
	int b=20;
	System.out.println(a-b);
}
void multiplication() {
	int x=9;
	int y=78;
	System.out.println(x*y);
} 
void division() {
	int m=45;
	int n=43;
	System.out.println(m/n);
}
void modulus(){
	int u=100;
	int v=65;
	System.out.println(u%v);
}

	 void main() {
		System.out.println("Main method started!!");
		//methods called
		addition();
		subtraction();
		multiplication();
		division();
		modulus();

	}

}

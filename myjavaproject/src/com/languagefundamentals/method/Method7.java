package com.languagefundamentals.method;
//with args + with return type

import java.util.Scanner;

public class Method7 {

	public static void main(String[] args) {
		System.out.println("Main!!!!!");
		//Area of Triangle
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base:");
		double base=sc.nextDouble();
		
		System.out.println("Enter height");
		float height=sc.nextFloat();
		double aot=findAreaOfTriangle(base,height);
		System.out.println("Area of Triangle is"+aot);
		
		//Area of Circle
		System.out.println("Enter the PI:");
		double pi=sc.nextDouble();
		
		System.out.println("Enter the Radius:");
		double r=sc.nextDouble();
		double aoc=FindAreaOfCircle(pi,r);
		System.out.println("Area of circle is:"+aoc);
		
		//Area of Rectangle
		System.out.println("Enter the Length:");
		int length=sc.nextInt();
		System.out.println("enter the Breadth:");
		int breadth1=sc.nextInt();
		System.out.println("enter the Height:");
		int hight=sc.nextInt();
		FindAreaOfRectangle(length,breadth1,hight);
		System.out.println("Area of Rectangle");
		
		
		
		

	}
	static double findAreaOfTriangle(double b,double h) {
		double aot=0.5*b*h;
		return aot;
	}
	static double FindAreaOfCircle(double pi,double r) {
		double aoc=pi*r*r;
		return aoc;
	}
	static int FindAreaOfRectangle(int length,int breadth,int hight) {
		int aor=length*breadth*hight;
		return aor;
	}

}

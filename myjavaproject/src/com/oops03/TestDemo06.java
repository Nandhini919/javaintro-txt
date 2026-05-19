package com.oops03;

public class TestDemo06 {

	public static void main(String[] args) {
		System.out.println("main started");
		TestDemo06 td = new TestDemo06();
		td.add("");
		td.add("",10);
		td.add("",10,20);
		td.add("",10,20,30);
		td.add("",10,20,30,40);
		td.add("",10,20,30,40,50);
		
	}
	void add(String s,int ...values) {
		int sum = 0;
		for(int i : values) {
			sum = sum + i;
		}
		System.out.println("sum:"+ sum);
	}
	

}

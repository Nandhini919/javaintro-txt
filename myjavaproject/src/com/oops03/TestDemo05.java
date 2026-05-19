package com.oops03;

public class TestDemo05 {

	public static void main(String[] args) {
		System.out.println("Main Method!!!");
		hello("nandhuuuuu");
		hello(null);
	}
	static void hello(String str) {
		System.out.println("str called");
		System.out.println(str);
	}
	static void hello(Object obj) {
		System.out.println("obj called");
		System.out.println(obj);
	}

}

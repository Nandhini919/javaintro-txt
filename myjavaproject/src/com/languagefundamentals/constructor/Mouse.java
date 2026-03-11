package com.languagefundamentals.constructor;

class Donkey{
	String name;
	int age;
	public Donkey() {
		System.out.println("Donkey no-arg constructor called");
	}
	
	
}
class Monkey extends Donkey{
	public Monkey() {
	super();
	System.out.println("Monkey no-arg constructor called");
	}
	
}

public class Mouse {

	public static void main(String[] args) {
		System.out.println("Main  called");
		Monkey m=new Monkey();
		System.out.println("Main ended");
		

	}

}

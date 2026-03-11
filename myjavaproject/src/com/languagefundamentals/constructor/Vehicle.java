package com.languagefundamentals.constructor;


public class Vehicle {
	String model;
	String brand;
	Vehicle(){
		System.out.println("Vehicle no-arg constructor called");
	}
	public Vehicle(String model,String Brand) {
	super();
	System.out.println("Vehicle class parameterized constructor called");
	this.model=model;
	this.brand=brand;
		
	}

	public static void main(String[] args) {
		System.out.println("Vehicle class Main!!!!");

	}

}
class Duke extends Vehicle{
	public static void main(String[] args) {
		System.out.println("Duke class Main!!!!");
		Duke d=new Duke();

	}
}


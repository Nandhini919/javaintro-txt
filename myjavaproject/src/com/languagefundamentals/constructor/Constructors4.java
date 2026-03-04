package com.languagefundamentals.constructor;

public class Constructors4 {
	String model;
	String brand;
	double price;
	String color;
	Constructors4(String model,String brand,double price,String color) {
		System.out.println("Parameterized Constructor called!!");
		this.model=model;
		this.brand=brand;
		this.price=price;
		this.color=color;
	}

	public static void main(String[] args) {
		System.out.println("Main Method started");
		Constructors4 c4=new Constructors4("Scooty","ACtiva",100000.0,"black");
		c4.bikeinfo();
		
	}
	void bikeinfo() {
		System.out.println("MODEL IS  :"+model);
		System.out.println("BRAND IS  :"+brand);
		System.out.println("PRICE IS  :"+price);
		System.out.println("COLOR IS  :"+color);
	}

}

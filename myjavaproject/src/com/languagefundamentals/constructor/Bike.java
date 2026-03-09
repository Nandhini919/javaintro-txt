package com.languagefundamentals.constructor;

public class Bike {
//calling one constructor into another constructor is called constructor chaining.
	//why we need is for reusing the code to avoid duplication,we can use con ch.
	//if it is in within the class,will use this
	//if it is parent and child classes from child we can call
	//parent class constructor using super()
	//this is a keyword used to invoke current class members.
	//super is a keyword used to invoke parent class members.
	//NOTE: both can used for methods and constructors.
	
	//this() : this() is used to call current class constructors only.
	//super() : super() is used to call super or parent  class  only.
	String brand;
	String model;
	String color;
	double milage;
	double price;
	
	
	Bike(String model,String brand){
		this(brand,model,100000.0);
		System.out.println("two-arg Constructor called !!!");
		this.model=model;
		this.brand=brand;
		
	}
	Bike(String model,String brand,double price,String color){
		System.out.println("four-arg Constructor called !!!");
		this.model=model;
		this.brand=brand;
		this.price=price;
		this.color=color;
		
	}
	Bike(String model,String brand,double price){
		System.out.println("Three-arg Constructor called !!!");
		this.model=model;
		this.brand=brand;
		this.price=price;
		
	}
	
	Bike(String brand){
		this(brand,"unknown");
		System.out.println("one-arg Constructor called !!!");
		this.brand=brand;
	}
	Bike() {
		this("Unknown");
		System.out.println("No-arg Constructor called from bike!!!");
	}
	public static void main(String[] args) {
		System.out.println("Main Started!!!");
	Bike b=new Bike();
		Bike b1=new Bike("ROYAL ENFILED");
		System.out.println(b1.brand);//null
		System.out.println("**************************");
		Bike b2=new Bike("KTM","Classic");
		System.out.println("Brand :"+b2.brand);
		System.out.println("Model :"+b2.model);
		System.out.println("**************************");
		Bike b3=new Bike("Yamaha","FZ-s",200000.0);
		System.out.println("Brand :"+b3.brand);
		System.out.println("Model :"+b3.model);
	    System.out.println("Price :"+b3.price);
	    System.out.println("**************************");
	    
		Bike b4=new Bike("RE","Himalaya",250000,"Black");
		System.out.println("Brand :"+b4.brand);
	System.out.println("Model :"+b4.model);
	System.out.println("Price :"+b4.price);
	System.out.println("Color :"+b4.color);	
	System.out.println("**************************");
		
		
	}

}

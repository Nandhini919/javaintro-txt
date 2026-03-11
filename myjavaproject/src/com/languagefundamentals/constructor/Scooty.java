package com.languagefundamentals.constructor;

//super or Parent
public class Scooty {
	String name;
	int age;
	long phone;
	public Scooty() {
		System.out.println("Scooty from no-arg constructor called!!!!");	
	}
	Scooty(String name,int age,long phone){
		System.out.println("Scooty 3 arguments called!!!!");
		this.name=name;
		this.age=age;
		this.phone=phone;
	
	}

	public static void main(String[] args) {
	System.out.println("Main From Scooty!!!!");	

	}
}
//Sub Class or Child Class
	class Customer extends Scooty{
		public Customer() {
			System.out.println("Customer from no-arg constructor called!!!!");	
		}
		Customer(String name,int age,long phone){
			super(name,age,phone);
			System.out.println("Customer 3 arguments called!!!!");	
		
		}

		public static void main(String[] args) {
			System.out.println("Main From Customer!!!!");	
			Customer c1=new Customer();
			c1.show();
			Customer c2=new Customer("Nandhu",21,123456789L);
			c2.show();
			System.out.println("Ended From Customer!!!!");	
			

		}
		void show() {
			System.out.println("******************CUSTOMER INFO ******************");
			System.out.println("Name of the Customer:"+name);
			System.out.println("Age of the Customer:"+age);
			System.out.println("Phone of the Customer:"+phone);
			System.out.println("****************************************************");
			
		}
		
	}



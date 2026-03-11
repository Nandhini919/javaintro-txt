package com.languagefundamentals.constructor;
class Animal{
	String name="Flora";
	void show() {
		System.out.println("Animal Name:"+name);
	}
}
class Dog extends Animal{
	String name="Nicy";
	//NOTE:this ,super can in instance area but not in static area
	@Override
	void show() {
		System.out.println("Dog Name:"+this.name);
		
	}
	
}

public class Flower {

	public static void main(String[] args) {
		System.out.println("Main!!!!!!!");
		Dog d=new Dog();
		d.show();
		
		System.out.println("Ended!!!!!!!");
	}

}

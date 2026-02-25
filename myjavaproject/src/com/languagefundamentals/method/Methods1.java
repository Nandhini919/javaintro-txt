package com.languagefundamentals.method;

public class Methods1 {
	//WHAT:A Method is a collection of statements and logics in a block.
    //WHY:Methods are used to maintain reusable code or Reusability.
	//EX: addiction(),subtraction(),multiplication()
	//Methods can create in 2 types:User-defined,Pre-defined
	//User-defined are created by developers.
	//Pre-defined are already available in java.
	//NOTE:overall in this methods we used static and instance,abstract and final,factory and synchronized.
	//NOTE: Above all methods can write in 4 ways they are:1.No arguments + No return type 2.no argumnets + with return type 3.with arguments + no return type 4.with argumenmts + with return type
	
	//instance method
	//no return type + no arguments
	void meet(){
		System.out.println("hello!!");
	}
	static void show() {
		System.out.println("show me methods");
	}
	public static void main(String[] args) {
		System.out.println("main method started!!");

		//meet();//Cannot make a static reference to the non-static method meet() from the type Methods1
	   Methods1 m=new Methods1();
	   m.meet();
	   //static methods can call directly
	   show();
	   //m.show();//The static method show() from the type Methods1 should be accessed in a static way
	   System.out.println("main method ended!!");
	   
	}
	

}

package com.languagefundamentals.constructor;

import java.util.Scanner;

//constructor is a special method but it is not a method.
//will not return anything not even void.
//3 types of constructors
//default/no-argument/parameterized constructors
//in additional: copy constructor/constructor chaining
// in java program if the program doesn't contain any explict constructor.
//Then java Compiler will create a default constructor.
//public Constructors1{} is the syntax
public class Constructors1 {
	int sdno;
	String name;
	//No arg constructor
	Constructors1(){
		System.out.println("No arg Constructor called!!");
		{
			System.out.println("instance called!!");
		}
	}

	public static void main(String[] args) {
		System.out.println("Main started!!");
		//NOTE:1
		//the below object is created with help of default constructor.
		//in java program if the program doesn't contain any explict constructor.
		//Then java Compiler will create a default constructor.
		
		//NOTE:2
		//the below object is created with help of no-arg construtor
		//whenever the class contain any constructor then java compiler will not create.
		//default constructor ,now we have explict no-arg constructor. so, the below object is craeted
		Constructors1 c1=new Constructors1();//constructor calling
		System.out.println(c1.sdno);
		System.out.println(c1.name);
		
//the constructor scanner is undefined
		//Scanner sc=new Scanner();
		System.out.println("Main ended!!");
		
		

	}

}

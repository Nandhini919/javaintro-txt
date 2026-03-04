package com.languagefundamentals.constructor;

public class Constructors3 {
	String wid;
	String wname;
	double salary;
	
	Constructors3() {
		System.out.println("no-args called!!!");
		wid="JFS-060";
		wname="Nandhu";
		salary=50000.0;
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		
	}
	//to avoid ambiguity problems,we must provide same name for constructor parameter and
	//when we have same name,we must need to use this to invoke current class object data members
	
	Constructors3(String wid,String wname,double salary) {
		System.out.println("parameterized constructor called");
		this.wid=wid;
		this.wname=wname;
		this.salary=salary;
		
	}
	

	public static void main(String[] args) {
		System.out.println("Main method called!!!");
		Constructors3 c3=new Constructors3();
		c3.display();
		Constructors3 c4=new Constructors3("JFS-061","Vamsiii",400000.0);
		c4.display();
		
		System.out.println("Main method ended!!!");
		

	}
	void display() {
		System.out.println("WORKER ID  :"+wid);
		System.out.println("WORKER NAME  :"+wname);
		System.out.println("WORKER SALARY  :"+salary);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
	}

}

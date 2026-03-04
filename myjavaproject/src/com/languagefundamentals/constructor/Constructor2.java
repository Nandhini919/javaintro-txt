package com.languagefundamentals.constructor;

public class Constructor2 {
	String sid;
	String sname;
	int sage;
	
	
	Constructor2() {
		System.out.println("No-args called");
	}

	//Parameterized constructors
	Constructor2(String sid, String sname, int sage) {
		System.out.println("parameterized called");
		//using of this keyword is used to
		this.sid=sid;
		this.sname=sname;
		this.sage=sage;
		System.out.println("************************************");
	}

	public static void main(String[] args) {
		System.out.println("Main!!!!");
		Constructor2 c2=new Constructor2("JFS-060","nandhu",21);
		c2.show();
		
		
		Constructor2 c3=new Constructor2("JFS-061","Vamsi",22);
		c3.show();
		System.out.println("Ended!!!!");

	}
	void show() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(sage);
		
		
	}
}


package com.languagefundamentals;

public class TypesOfVariables1 {
	//primitive + instance variable
	int id;
	
	//object + instance variable
	String name;
	
	//primitive + static variable
	 static int collegeId=55;
	
	//object + static variable
	 static String collegeName="DVR";

	public static void main(String[] args) {
		System.out.println("main started!!");
		//object creation to access instance data members
		TypesOfVariables1 tov=new TypesOfVariables1();
		
		System.out.println(tov.id);//0
		System.out.println(tov.name);//null
		
		//accessing static data directly
		System.out.println(collegeId);
		System.out.println(collegeName);
		
		
		

	}

}

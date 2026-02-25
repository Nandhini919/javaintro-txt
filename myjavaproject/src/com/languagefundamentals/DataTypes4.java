package com.languagefundamentals;
class Student{
	int id=100;
	String name="nandhu";
}
class Address{
	int flat=123;
	String street="VIJ";
}

public class DataTypes4 {

	public static void main(String[] args) {
		System.out.println("main mathod started!!");
		
		Student s=new  Student();
		System.out.println(s.id);
		System.out.println(s.name);
		
		Address a =new Address();
		System.out.println(a.flat);
		System.out.println(a.street);
	}

}

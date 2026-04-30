package com.opps;
class student{
	int age;
	String name;
	Address add;
	public student(int age,String name,Address add) {
		super();
		this.age = age;
		this.name = name;
		this.add = add;
	}
	public  student(Student student) {
		this.age = student.sid;
		this.name =student. sname;
		this.add = new Address(student.sname);
	}
}

class Address01 {
	String city;
	public Address01(String city) {
		super();
		this.city = city;
	}
	public Address01(Address01 add01) {
		this.city = add01.city;
	}


}

public class DeepCopyDemo {

	public static void main(String[] args) {
		System.out.println("main");
		
		Address add = new Address("Vijayawada");
		Student s1 = new Student(60,"Nandhu",add);
		
        Student s2  = (Student) s1;
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		
		System.out.println(s1);
		
		System.out.println("****************************");
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s1.address.city);
		System.out.println(s2);
		System.out.println("****************************");
		s2.sid = 64;
		System.out.println(s1.sid);
		System.out.println(s2.sid);
		System.out.println("****************************");
		s2.address.city = "chennai";
		System.out.println(s1.address.city);
		System.out.println(s2.address.city);
	}

}

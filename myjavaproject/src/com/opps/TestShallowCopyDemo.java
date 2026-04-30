package com.opps;
//A class implements the Cloneable interface to indicate to the java.lang.Object.clone() method that it is legal for that method to make a field-for-field copy of instances of that class.
//
//Invoking Object's clone method on an instance that does not implement the Cloneable interface results in the exception CloneNotSupportedException being thrown.
//
//By convention, classes that implement this interface should override Object.clone (which is protected) with a public method. See java.lang.Object.clone() for details on overriding this method.
//
//Note that this interface does not contain the clone method. Therefore, it is not possible to clone an object merely by virtue of the fact that it implements this interface. Even if the clone method is invoked reflectively, there is no guarantee that it will succeed.
//
//Since:
//1.0
//See Also:
//java.lang.CloneNotSupportedException
//java.lang.Object.clone()

class Student implements Cloneable{
	int sid;
	String sname;
 Address address;
	
public  Student(int sid,String sname,Address add01){
	super();
	this.sid = sid;
	this.sname = sname;
	this.address = add01;
}
@Override
protected Object clone() throws CloneNotSupportedException{
	return super.clone();
}
}
class Address{
	String city;
	public Address(String city) {
		super();
		this.city = city;
	}
}

public class TestShallowCopyDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Main!");
		Address address = new Address("vijayawada");
		Student s1  = new Student(60, "nandhu",address);
		
		Student s2  = (Student) s1.clone();
		
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

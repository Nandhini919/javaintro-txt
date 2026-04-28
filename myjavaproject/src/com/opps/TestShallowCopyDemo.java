package com.opps;

class Student implements Cloneable{
	int sid;
	String sname;
	
public  Student(int sid,String sname){
	super();
	this.sid = sid;
	this.sname = sname;
}
@Override
protected Object clone() throws CloneNotSupportedException{
	return super.clone();
}
}

public class TestShallowCopyDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Main!");
		Student s1  = new Student(60, "nandhu");
		
		Student s2  = (Student) s1.clone();
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println("****************************");
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		
		
		

	}

}

package com.languagefundamentals.method;

public class Method4 {

	    void main() {
		System.out.println("main method started!!");
		System.out.println("Student Information");
		 Method4 m = new  Method4();
		 System.out.println("Student Id:" + m.getStudentId());
		 System.out.println("Student Age:" + m.getStudentAge());
		 System.out.println("Student Rank:" + m.getStudentRank());
		 System.out.println("Student Height:" + m.getStudentHeight());
		 System.out.println("Student Weight:" + m.getStudentWeight());
		 System.out.println("Student Gender:" + m.getStudentGender());
		 System.out.println("Student Pass:" + m.getStudentPass());
		 
	}
	byte getStudentId() {
		return 100;
	}
	int  getStudentAge() {
		short age=23;
		return age;
	}
	int getStudentRank() {
		int rank=3;
		return rank;
	}
	float getStudentHeight() {
		float height=5;
		return height;
	}
	double getStudentWeight() {
		double weight=74.5;
		return weight;
	}
	char getStudentGender() {
		char gender='F';
		return gender;
	}
	boolean getStudentPass() {
		boolean pass=true;
		return pass;
	}

}

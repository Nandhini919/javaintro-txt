package com.languagefundamentals.method;
//no args + with return type
//
public class Method3 {
	static {
		System.out.println("Static block");
	}

	 void main() {
		System.out.println("main method started!!");
		System.out.println("The Employee Id is:" + getEmployeeId());
		double sal= getSalary();
		double bon= getBonus();
		System.out.println("Total Salary is:" +(sal+bon));//using BODMAS RULE
	}
    int getEmployeeId() {
    	int id=789;
    	return id;
    }
    double getSalary() {
    	double salary=500000.00;
    	return salary;
    }
    double getBonus() {
    	double bonus=30000.00;
    	return bonus;
    }

}

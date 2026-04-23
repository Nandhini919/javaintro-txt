package com.opps;

public class TestEmployee {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpid(07);
		emp.setEmpname("DHONI");
		emp.setEmpphone(7981596131L);
		
		
		System.out.println(emp.getEmpid());
		System.out.println(emp.getEmpname());
		System.out.println(emp.getEmpphone());
		
		
//		emp.empid = 07;
//		emp.empname = "Dhoni";
//		emp.empphone = 7981596131L;
//		
//		System.out.println( "Employee ID:"+emp.empid);
//		System.out.println("Employee Name:"+emp.empname);
//		System.out.println("Employee Phone:"+emp.empphone);
	}

}

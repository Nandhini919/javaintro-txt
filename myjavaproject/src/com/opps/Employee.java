package com.opps;
//DTO:data transfer object
//POJO:plain old java object
//Model Object:same like your data base table
//variables + methods we can use only data members.
public class Employee {
	private int empid;
	private String empname;
	private long empphone;
	
	 void setEmpid(int empid){
		this.empid = empid;
	}
	 int getEmpid() {
		 return empid;
	 }
	 
	 void setEmpname(String empname) {
		 this.empname =  empname;
	 }
	 String getEmpname() {
		 return empname;
	 }
	 public long getEmpphone() {
		return empphone;
	 }
	 public void setEmpphone(long empphone) {
		this.empphone = empphone;
	 }
	

}

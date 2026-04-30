package com.opps;

public class Passenger {
        
 private final String passportNumber;

	    private String name;
	    private String contact;
	    private String email;

	     public Passenger(String passportNumber, String name,String contact, String email) {
	        this.passportNumber = passportNumber;
	        this.name    = name;
	        this.contact = contact;
	        this.email   = email;
	    }

	    
	    public String getPassportNumber() {
	    	return passportNumber;
	    	}

	    
	    public String getName() {
	    	return name; 
	    	}
	    public void setName(String name) { 
	    	this.name = name;
	    	}

	    public String getContact() {
	    	return contact;
	    	}
	    public void  setContact(String contact){ 
	    	this.contact = contact; 
	    	}

	    public String getEmail(){ 
	    	return email; 
	    	}
	    public void  setEmail(String email){
	    	this.email = email; 
	    	}

public static void main(String[] args) {
	
	Passenger p = new Passenger("P78963547", "Nandhu", "9876543210", "nandhureddy@mail.com");
	
	System.out.println("-----------------------------------");

	 System.out.println("Passport : " + p.getPassportNumber());
	        
	 System.out.println("Name : " + p.getName());
	 
	 System.out.println("Contact : " + p.getContact());
	 
	 System.out.println("Email : " + p.getEmail());
	 
	
	  System.out.println("-----------------------------------");
	 

	  p.setName("Nandhu Reddy"); 
	   System.out.println("Updated : " + p.getName());
	   
	   p.setContact("7981596131"); 
	   System.out.println("Updated : " + p.getContact());
	   
	   
	   
	    }
	}
	


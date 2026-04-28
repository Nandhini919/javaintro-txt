package com.opps;

public class Customer {
	private String  cid;
	private String  cname;
	
	
//	public Customer(String cid, String cname) {
//		super();
		
//	}
	public void setCid(String cid) {
		this.cid = "JFS-B70-"+cid;
		
	}
	public String getCid() {
		return cid;
	}
	
	public void setCname(String cname) {
		this.cname = cname;
		
	}
	public String getCname() {
		return cname;
	}

}

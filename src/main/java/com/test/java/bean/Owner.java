package com.test.java.bean;

// Owner Pojo
public class Owner {
	
	int ownerId;
	String ownerName; 
	String address;
	// companyId
	int compId;	
	
	public Owner() {
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCompId() {
		return compId;
	}

	public void setCompId(int compId) {
		this.compId = compId;
	}

	public Owner(int ownerId, String ownerName, String address, int compId) {
		super();
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.address = address;
		this.compId = compId;
	}
	
	

	
}
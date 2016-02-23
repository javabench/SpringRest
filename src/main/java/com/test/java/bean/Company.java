package com.test.java.bean;

import java.util.List;

public class Company {
	
	int compId;
	String compName; 
	String address;
	String city;
	String country;
	List<String> owners;
	
	String email;
	String phone;
	
	
	
	public Company() {
	}

	public Company (int compId, String name, String address, String city,
			String country, List<String> owners) {

		super();
		this.compId = compId;
		this.compName = name;
		this.address = address;
		this.city = city;
		this.country = country;
		this.owners = owners;
	}

	public int getCompId() {
		return compId;
	}

	public void setCompId(int compId) {
		this.compId = compId;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String name) {
		this.compName = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<String> getOwners() {
		return owners;
	}

	public void setOwners(List<String> owners) {
		this.owners = owners;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phoneNo) {
		this.phone = phoneNo;
	}
	
	
}
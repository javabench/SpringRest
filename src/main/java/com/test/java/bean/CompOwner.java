package com.test.java.bean;

// Owner Pojo
public class CompOwner {
	
	int cownId;
	int ownId; 
	int compId;	
	
	public CompOwner() {
	}

	public CompOwner (int compId, int cownId, int ownId) {

		super();
		this.ownId = compId;
		this.cownId = cownId;
		this.compId = compId;
	}

	public int getCownId() {
		return cownId;
	}

	public void setCownId(int cownId) {
		this.cownId = cownId;
	}

	public int getOwnId() {
		return ownId;
	}

	public void setOwnId(int ownId) {
		this.ownId = ownId;
	}

	public int getCompId() {
		return compId;
	}

	public void setCompId(int compId) {
		this.compId = compId;
	}

	
}
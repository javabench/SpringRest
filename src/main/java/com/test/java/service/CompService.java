package com.test.java.service;

import java.util.List;

import com.test.java.bean.Company;
import com.test.java.bean.Owner;

public interface CompService {
	
	Company getCompanyDB (int id);
	
	int createCompanyDB(Company comp);
	
	List<Company> findAllCompaniesDB();
	
	void addOwner(Owner o);
	
	Owner getOwnerDB (int id);
	
	List<Owner> findAllOwnersDB();
}

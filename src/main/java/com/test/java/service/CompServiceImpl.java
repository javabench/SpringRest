package com.test.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.java.bean.Company;
import com.test.java.bean.Owner;
import com.test.java.db.DataAccess;

@Service("companyService")
public class CompServiceImpl implements CompService{
	
	@Autowired
	DataAccess dataAccess;

	public int createCompanyDB(Company comp) {
		dataAccess.saveCompanyDB(comp);
		return 0;
	}

	@Override
	public List<Company> findAllCompaniesDB() {
		return dataAccess.getAllCompaniesDB();
	}

	@Override
	public Company getCompanyDB(int id) {
		return dataAccess.getCompanyDB(id);
	}

	@Override
	public void addOwner(Owner o) {
		dataAccess.addOwner(o);
	}
	
	@Override
	public List<Owner> findAllOwnersDB() {
		return dataAccess.getAllOwnersDB();
	}

	@Override
	public Owner getOwnerDB(int id) {
		return dataAccess.getOwnerDB(id);
	}

	
}

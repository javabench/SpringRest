package com.test.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.java.bean.Company;
import com.test.java.bean.Owner;
import com.test.java.service.CompService;

@RestController
public class CompanyController {
	
	@Autowired
	CompService companyService;
	
	// Create new company - testable from soapui
	@RequestMapping(value = "/dbcompany", method = RequestMethod.POST)
	public int createCompDB(@RequestBody Company comp)
	{
		return companyService.createCompanyDB(comp);
	}
	
	// Get a list of all companies - browser testable
	@RequestMapping(value = "/dbcompanies", method = RequestMethod.GET,headers="Accept=application/json")
	public List<Company> getCompanies()
	{
		return companyService.findAllCompaniesDB();
	}
	
	// Get details about a company - browser testable
	@RequestMapping(value = "/dbcompany/{id}", method = RequestMethod.GET,headers="Accept=application/json")
	public Company getCompanyDB(@PathVariable int id) {
		return companyService.getCompanyDB(id);
	}

	// Create new company - testable from soapui
	@RequestMapping(value = "/dbowner", method = RequestMethod.POST)
	public void addOwnerDB(@RequestBody Owner o)
	{
		companyService.addOwner(o);;
	}
	
	
	// Get a list of all owners - browser testable
		@RequestMapping(value = "/dbowners", method = RequestMethod.GET,headers="Accept=application/json")
		public List<Owner> getOwners()
		{
			return companyService.findAllOwnersDB();
		}
		
		// Get details about a Owner - browser testable
		@RequestMapping(value = "/dbowner/{id}", method = RequestMethod.GET,headers="Accept=application/json")
		public Owner getOwnerDB(@PathVariable int id) {
			return companyService.getOwnerDB(id);
		}
	
	
}

package com.grocerygogetters.services;

import org.springframework.stereotype.Service;

import com.grocerygogetters.dao.CompaniesDaoImpl;
import com.grocerygogetters.model.Companies;

@Service
public class CompaniesServices {

private static CompaniesServices companiesServices;
	
	private CompaniesServices() {
	}
	
	public static CompaniesServices getInstance() {
		if (companiesServices == null) {
			companiesServices = new CompaniesServices();
		}
		return companiesServices;
	}
	
	public int createCompany(Companies com) {
		return CompaniesDaoImpl.getInstance().createCompany(com);
		
	}
}

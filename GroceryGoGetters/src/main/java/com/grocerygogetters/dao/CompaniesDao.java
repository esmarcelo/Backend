package com.grocerygogetters.dao;

import java.util.List;

import com.grocerygogetters.model.Companies;

public interface CompaniesDao {

	public List<Companies> getCompanies();
	public Companies getCompanyById(int id);
	public int createCompany(Companies c);
	public void updateCompany(Companies c);
	public void deleteCompanyById(int id);
}

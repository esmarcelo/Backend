package com.grocerygogetters.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.grocerygogetters.model.Companies;
import com.grocerygogetters.services.CompaniesServices;

@Controller
@CrossOrigin(origins="*", allowedHeaders="*")
public class CompaniesController {

	@Autowired
	CompaniesServices companiesServices;
	
	@PostMapping("/companies/createCompany")
	public void createCompany(@RequestBody Companies companies) {
		Companies com = companies;
		companiesServices.createCompany(com);
		
	}
	
//	@PostMapping("/companies/createCompany")
//	public void createCompany(@RequestParam("name") String name ) {
//		System.out.println(name);
//		Companies com = new Companies();
//		companiesServices.createCompany(com);
//		
//	}
	
	@GetMapping("/company/{id}")
	@ResponseBody
	public Companies getCompanyById(@PathVariable("id")int id) {
		return companiesServices.getCompanyById(id);
	}

}

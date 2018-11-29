package com.grocerygogetters.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.grocerygogetters.model.Companies;
import com.grocerygogetters.services.CompaniesServices;

@Controller
@CrossOrigin(origins="*", allowedHeaders="*")
public class CompaniesController {

	@Autowired
	CompaniesServices companiesServices;
	
	@PostMapping("/createCompany")
	public void createCompany(@RequestParam("companyName")String compName, @RequestParam("companyState")String compState, @RequestParam("companyCity")String city,
			@RequestParam("companyAddress")String address) {
		Companies com = new Companies();
		com.setComp_address(address);
		com.setComp_city(city);
		com.setComp_name(compName);
		com.setComp_state(compState);
		companiesServices.createCompany(com);
		
	}

}

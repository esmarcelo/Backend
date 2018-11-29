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
	public void createCompany(@RequestParam("comp_name") String comp_name, @RequestParam("comp_state") String comp_state, @RequestParam("comp_city") String comp_city, 
			@RequestParam("comp_address")String comp_address) {
		Companies com = new Companies();
		com.setComp_address(comp_address);
		com.setComp_city(comp_city);
		com.setComp_name(comp_name);
		com.setComp_state(comp_state);
		companiesServices.createCompany(com);
		
	}

}

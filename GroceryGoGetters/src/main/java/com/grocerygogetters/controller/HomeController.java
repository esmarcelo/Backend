package com.grocerygogetters.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@CrossOrigin(origins="*", allowedHeaders="*")
public class HomeController {

	@RequestMapping(method=RequestMethod.GET, value="/home")
	public String getHomePage() {
		return "Home";
	}
}

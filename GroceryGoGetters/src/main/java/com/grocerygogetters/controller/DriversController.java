package com.grocerygogetters.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.grocerygogetters.model.Users;
import com.grocerygogetters.services.UserServices;

@Controller
public class DriversController {
	
	@Autowired
	UserServices userServices;
	
	
	@GetMapping("/driver/{id}")
	@ResponseBody
	public Users getDriver(@PathVariable("id")int id) {
		Users u = userServices.getDriver(id);
		return u;
	}
	
	@GetMapping("/drivers")
	@ResponseBody
	public List<Users> getAllDrivers() {
		List<Users> ust = userServices.getAllDrivers();
		return ust;
	}

}

package com.grocerygogetters.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.grocerygogetters.model.LineItems;
import com.grocerygogetters.model.Orders;
import com.grocerygogetters.model.Role;
import com.grocerygogetters.model.Users;
import com.grocerygogetters.services.LineItemsServices;
import com.grocerygogetters.services.OrdersServices;
import com.grocerygogetters.services.UserServices;

@Controller
@CrossOrigin(origins="*", allowedHeaders="*")
public class DriversController {
	
	@Autowired
	UserServices userServices;
	
	@Autowired
	OrdersServices ordersServices;
	
	@Autowired
	LineItemsServices lineItemsServices;
	
	
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
	
	@GetMapping("/driverorders/{id}")
	@ResponseBody
	public List<Orders> getDriverOrders(@PathVariable("id")int id){
		List<Orders> ordlist = ordersServices.getOrdersByDriverID(id);
		return ordlist;
	}
	
	@GetMapping("/driversAllItemsbyOrders/{id}")
	@ResponseBody
	public List<LineItems> getLineItemsByOrder(@PathVariable("id")int id){
		List<LineItems> itemlist = lineItemsServices.getLineItemsByOrder(id);
		return itemlist;
	}
	
	@PostMapping("/createDriver")
	public void createUser( @RequestBody Users user) {
		Role r = new Role();
		r.setRole_id(3);
		Users u = new Users();
		u.setUser_address(user.getUser_address());
		u.setUser_city(user.getUser_city());
		u.setUser_email(user.getUser_email());
		u.setUser_fname(user.getUser_fname());
		u.setUser_lname(user.getUser_lname());
		u.setUser_username(user.getUser_username());
		u.setUser_zipcode(user.getUser_zipcode());
		u.setUser_password(user.getUser_password());
		u.setComp_id(null);
		u.setRole_id(r);
		userServices.creatUser(u);
	}
	

	
}

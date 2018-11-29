package com.grocerygogetters.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.grocerygogetters.model.Orders;
import com.grocerygogetters.services.OrdersServices;

@Controller
@CrossOrigin(origins="*", allowedHeaders="*")
public class OrdersController {
	
	@Autowired
	OrdersServices ordersServices;
	
	@GetMapping("/allOrders")
	@ResponseBody
	public List<Orders> getAllUsers() {
		List<Orders> u = ordersServices.getAllOrders();
		return u;
	}

}

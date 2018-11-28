package com.grocerygogetters.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.grocerygogetters.model.Orders;
import com.grocerygogetters.model.ShoppingCart;
import com.grocerygogetters.model.Users;
import com.grocerygogetters.services.UserServices;

@Controller
public class UsersController {

	@Autowired
	UserServices userServices;
	
	@GetMapping("/users/{id}")
	@ResponseBody
	public Users getUsers(@PathVariable("id")int id) {
		Users u = userServices.getUserById(id);
		return u;
	}
	
	@GetMapping("/users")
	@ResponseBody
	public List<Users> getAllUsers() {
		List<Users> u = userServices.getUsers();
		return u;
	}
	
	@GetMapping("/shoppingcarts")
	@ResponseBody
	public List<ShoppingCart> getUserShoppingCart(){
		Users u = userServices.getUserById(1);
		List<ShoppingCart> sc = userServices.getUsersCart(u);
		return sc;
	}
	
	@GetMapping("/orders")
	@ResponseBody
	public List<Orders> getUserOrders(){
		Users u = userServices.getUserById(1);
		List<Orders> o = userServices.getUserOrders(u);
		return o;
	}
}

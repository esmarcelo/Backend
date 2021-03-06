package com.grocerygogetters.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.grocerygogetters.model.ShoppingCart;
import com.grocerygogetters.services.ShoppingCartServices;

@Controller
@CrossOrigin(origins="*", allowedHeaders="*")
public class ShoppingCartController {
	
	@Autowired
	ShoppingCartServices shoppingCartServices;
	
	@GetMapping("/shoppingcart/{id}")
	@ResponseBody
	public ShoppingCart getShoppingCartById(@PathVariable("id")int id) {
		ShoppingCart sc = shoppingCartServices.getShoppingCart(id);
		return sc;
	}
	
	@PostMapping("/createShoppingCart")
	public void createShoppingCart(@RequestBody ShoppingCart sc) {
		shoppingCartServices.createShoppingCart(sc);
	}
	
	
}

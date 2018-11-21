package com.grocerygogetters.services;

import org.springframework.stereotype.Service;

import com.grocerygogetters.dao.ShoppingCartDaoImpl;
import com.grocerygogetters.model.ShoppingCart;
@Service
public class ShoppingCartServices {
	private static ShoppingCartServices shoppingCartServices;
	
	private ShoppingCartServices() {
		
	}
	
	public static ShoppingCartServices getInstance() {
		if(shoppingCartServices == null) {
			shoppingCartServices = new ShoppingCartServices();
		}
		return shoppingCartServices;
	}
	
	public ShoppingCart getShoppingCart(int id) {
		return ShoppingCartDaoImpl.getInstance().getShoppingCartById(id);
	}
	
	
}

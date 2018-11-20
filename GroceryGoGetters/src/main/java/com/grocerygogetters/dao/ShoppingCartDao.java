package com.grocerygogetters.dao;

import java.util.List;

import com.grocerygogetters.model.ShoppingCart;

public interface ShoppingCartDao {

	public List<ShoppingCart> getShoppingCarts();
	public ShoppingCart getShoppingCartById(int id);
	public int createShoppingCart(ShoppingCart sc);
	public void updateShoppingCart(ShoppingCart sc);
	public void deleteShoppingCartById(int id);

}

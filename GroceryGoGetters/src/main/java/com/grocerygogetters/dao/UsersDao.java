package com.grocerygogetters.dao;

import java.util.List;

import com.grocerygogetters.model.Orders;
import com.grocerygogetters.model.ShoppingCart;
import com.grocerygogetters.model.Users;

public interface UsersDao {
	public int createUser(Users u);
	public List<Users> getUsers();
	public Users getUserById(Users u);
	public List<ShoppingCart> getUsersCart(Users u);
	public List<Orders> getUserOrders(Users u);
	

}

package com.grocerygogetters.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.grocerygogetters.dao.UsersDaoImpl;
import com.grocerygogetters.model.Orders;
import com.grocerygogetters.model.ShoppingCart;
import com.grocerygogetters.model.Users;
@Service
public class UserServices {
	private static UserServices userServices;
	
	private UserServices() {
	}
	
	public static UserServices getInstance() {
		if (userServices == null) {
			userServices = new UserServices();
		}
		return userServices;
	}
	
	public int creatUser(Users u) {
		return UsersDaoImpl.getInstance().createUser(u);
	}
	
	public List<Users>  getUsers(){
		return UsersDaoImpl.getInstance().getUsers();
	}
	
	public Users getUserById(int id) {
		Users u = new Users();
		u.setUser_id(id);
		return UsersDaoImpl.getInstance().getUserById(u);
		
	}
	
	public List<ShoppingCart> getUsersCart(Users u){
		return UsersDaoImpl.getInstance().getUsersCart(u);	
	}
	
	public List<Orders> getUserOrders(Users u){
		return UsersDaoImpl.getInstance().getUserOrders(u);
	}
	
	public List<Users> getAllDrivers(){
		return UsersDaoImpl.getInstance().getAllDrivers();
	}
	
	public Users getDriver(int id) {
		Users u = new Users();
		u.setUser_id(id);
		return UsersDaoImpl.getInstance().getDriver(u);
	}

}

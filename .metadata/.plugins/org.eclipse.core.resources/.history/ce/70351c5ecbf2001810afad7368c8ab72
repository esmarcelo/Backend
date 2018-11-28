package com.grocerygogetters.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.grocerygogetters.dao.OrdersDaoImpl;
import com.grocerygogetters.model.Orders;
import com.grocerygogetters.model.Users;
@Service
public class OrdersServices {

private static OrdersServices ordersServices;
	
	private OrdersServices() {
	}
	
	public static OrdersServices getInstance() {
		if (ordersServices == null) {
			ordersServices = new OrdersServices();
		}
		return ordersServices;
	}
	
	public List<Orders> getOrdersByDriverID(int id){
		Users u = new Users();
		u.setUser_id(id);
		return OrdersDaoImpl.getInstance().getOrdersByDriverID(u);
	}
}

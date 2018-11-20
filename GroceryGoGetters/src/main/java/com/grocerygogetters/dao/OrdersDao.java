package com.grocerygogetters.dao;

import java.util.List;

import com.grocerygogetters.model.Orders;

public interface OrdersDao {

	public List<Orders> getOrders();
	public Orders getOrderById(int id);
	public int createOrder(Orders o);
	public void updateOrder(Orders o);
	public void deleteOrderById(int id);
}

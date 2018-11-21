package com.grocerygogetters.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.grocerygogetters.model.Orders;
import com.grocerygogetters.util.HibernateUtil;

public class OrdersDaoImpl implements OrdersDao {

	@Override
	public List<Orders> getOrders() {
		Session s = HibernateUtil.getSession();
		List<Orders> orders = s.createQuery("from Orders", Orders.class).list();
		s.close();
		return orders;
	}

	@Override
	public Orders getOrderById(int id) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.getSession();
		Orders o = s.load(Orders.class, id);
		s.close();
		return o;
	}

	@Override
	public int createOrder(Orders o) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		int ordersPK = (int) s.save(o);
		tx.commit();
		s.close();
		return ordersPK;
	}

	@Override
	public void updateOrder(Orders o) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.update(o);
		tx.commit();
		s.close();
	}

	@Override
	public void deleteOrderById(int id) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		Orders o = s.get(Orders.class, id);
		if(o != null) {
			s.delete(o);
		}
		tx.commit();
		s.close();
	}
}

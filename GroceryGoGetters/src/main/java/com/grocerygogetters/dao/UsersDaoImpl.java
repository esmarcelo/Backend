package com.grocerygogetters.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.grocerygogetters.model.Orders;
import com.grocerygogetters.model.ShoppingCart;
import com.grocerygogetters.model.Users;
import com.grocerygogetters.util.HibernateUtil;

public class UsersDaoImpl implements UsersDao{
	
	public int createUser(Users u) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		int userPK =  (Integer) s.save(u);
		tx.commit();
		s.close();
		return userPK;
	}

	public List<Users> getUsers() {
		Session s = HibernateUtil.getSession();
		List<Users> userlst = s.createQuery("from Users", Users.class).list();
		s.close();
		return userlst;
	}

	public Users getUserById(Users u) {
		// TODO Auto-generated method stub
		return null;
	}

	public ShoppingCart getUsersCart(Users u) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ShoppingCart> getUsersCartById(ShoppingCart sc) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Orders> getUserOrders(Users u) {
		// TODO Auto-generated method stub
		return null;
	}


	

}

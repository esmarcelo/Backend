package com.grocerygogetters.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

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
		Session s = HibernateUtil.getSession();
		Users usr = s.load(Users.class, u.getUser_id());
		s.close();
		return usr;
	}

	public List<ShoppingCart> getUsersCart(Users u) {
		Session s = HibernateUtil.getSession();
		String hql = "from ShoppingCart where USER_ID = :UID";
		Query<ShoppingCart> scq = s.createQuery(hql,ShoppingCart.class);
		scq.setParameter("UID",u.getUser_id());
		List<ShoppingCart> sc = scq.list();
		s.close();
		return sc;
	}

	public List<Orders> getUserOrders(Users u) {
		Session s = HibernateUtil.getSession();
		String hql = "from Orders where USER_ID = :UID";
		Query<Orders> scq = s.createQuery(hql,Orders.class);
		scq.setParameter("UID",u.getUser_id());
		List<Orders> sc = scq.list();
		s.close();
		return sc;
	}


	

}

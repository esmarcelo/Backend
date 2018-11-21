package com.grocerygogetters.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.grocerygogetters.model.ShoppingCart;
import com.grocerygogetters.util.HibernateUtil;

public class ShoppingCartDaoImpl implements ShoppingCartDao {

	@Override
	public List<ShoppingCart> getShoppingCarts() {
		Session s = HibernateUtil.getSession();
		List<ShoppingCart> shoppingcarts = s.createQuery("from ShoppingCart", ShoppingCart.class).list();
		s.close();
		return shoppingcarts;
	}

	@Override
	public ShoppingCart getShoppingCartById(int id) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.getSession();
		ShoppingCart sc = s.load(ShoppingCart.class, id);
		s.close();
		return sc;
	}

	@Override
	public int createShoppingCart(ShoppingCart sc) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		int shoppingcartPK = (int) s.save(sc);
		tx.commit();
		s.close();
		return shoppingcartPK;
	}

	@Override
	public void updateShoppingCart(ShoppingCart sc) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.update(sc);
		tx.commit();
		s.close();
	}

	@Override
	public void deleteShoppingCartById(int id) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		ShoppingCart sc = s.get(ShoppingCart.class, id);
		if(sc != null) {
			s.delete(sc);
		}
		tx.commit();
		s.close();
	}
}

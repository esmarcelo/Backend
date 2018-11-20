package com.grocerygogetters.util;

import java.util.List;

import org.hibernate.Session;

import com.grocerygogetters.dao.ShoppingCartDao;
import com.grocerygogetters.dao.ShoppingCartDaoImpl;
import com.grocerygogetters.model.ShoppingCart;

public class Driver {

	public static void main(String[] args) {
//		Session s = HibernateUtil.getSession();
//		s.close();
//		
		ShoppingCartDao dao = new ShoppingCartDaoImpl();
		
		List<ShoppingCart> list = dao.getShoppingCarts();
		for(ShoppingCart obj : list) {
			System.out.println(obj);
		}
		

	}

}

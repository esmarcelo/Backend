package com.grocerygogetters.util;

import java.sql.Date;

import org.hibernate.Session;

import com.grocerygogetters.dao.OrdersDao;
import com.grocerygogetters.dao.OrdersDaoImpl;
import com.grocerygogetters.dao.ShoppingCartDao;
import com.grocerygogetters.dao.ShoppingCartDaoImpl;
import com.grocerygogetters.dao.UsersDao;
import com.grocerygogetters.dao.UsersDaoImpl;
import com.grocerygogetters.model.Orders;
import com.grocerygogetters.model.Users;



public class Driver {

	public static void main(String[] args) {
		Session s = HibernateUtil.getSession();
		s.close();

		
//		UsersDao user = new UsersDaoImpl();
//		ShoppingCartDao scd = new ShoppingCartDaoImpl();
//		OrdersDao od = new OrdersDaoImpl();
//		
//		Users u = new Users();
//		u.setUser_id(1);
//		u.setUser_fname("Jessica");
//		u.setUser_lname("Jones");
//		u.setUser_email("jjones@email.com");
//		u.setUser_password("1234");
//		u.setUser_username("jjones");
//		u.setComp_id(null);
//		
//		UsersDaoImpl.getInstance().createUser(u);
		
//		ShoppingCart sc = new ShoppingCart();
//		sc.setUser_id(u);
//		sc.setCart_created_date(Date.valueOf("1999-03-08"));
//		sc.setOrder_id(null);
//		sc.setCart_name("user3");
//		sc.setCart_status("Pending");
//		
//		scd.createShoppingCart(sc);		

//		Orders o = new Orders();
//		o.setUser_id(u);
//		o.setOrder_amount(500);
//		o.setOrder_status("Pending");
//		o.setOrder_submitted(Date.valueOf("2018-03-04"));
//		od.createOrder(o);
//		
//		for(Orders nsc : od.getOrdersByUserID(u)) {
//			System.out.println(nsc);
//		}
//		System.out.println( user.getUserById(u));
		
//		System.out.println(nu);

	

	}

}

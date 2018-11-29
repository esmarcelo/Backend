package com.grocerygogetters.util;

import org.hibernate.Session;

import com.grocerygogetters.dao.RecurrenceDaoImpl;
import com.grocerygogetters.model.LineItems;
import com.grocerygogetters.model.Orders;
import com.grocerygogetters.model.Recurrence;
import com.grocerygogetters.model.Role;
import com.grocerygogetters.model.Users;



public class Driver {

	public static void main(String[] args) {
		Session s = HibernateUtil.getSession();
		s.close();

		
//		UsersDao user = new UsersDaoImpl();
//		ShoppingCartDao scd = new ShoppingCartDaoImpl();
//		OrdersDao od = new OrdersDaoImpl();
//		Role rc = new Role();
//		rc.setRole_type("Client");
		
//		Role rcu = new Role();
//		rcu.setRole_type("Customer");
		
		Role rd = new Role();
		rd.setRole_id(2);
		
//////	0.	Creating a new user
		Users u = new Users();
		u.setUser_id(1);
		u.setRole_id(rd);
		u.setUser_fname("John");
		u.setUser_lname("Smith");
		u.setUser_email("jsmith@email.com");
		u.setUser_password("1234");
		u.setUser_username("jsmith");
		u.setComp_id(null);
//		u.setRole_id(rd);
//		UsersDaoImpl.getInstance().createUser(u);
//		UsersDaoImpl.getInstance().updateUser(u);

		Recurrence r = new Recurrence();
		r.setRecur_type("Daily");
		r.setRecur_descr("Every Day");
		
//		RecurrenceDaoImpl.getInstance().createRecurrence(r);

//		Users d = new Users();
//		d.setUser_id(3);
		
//////// 1. Setting up shopping cart				
//		ShoppingCart sc = new ShoppingCart();
//		sc.setCart_id(3);
//		sc.setUser_id(u);
//		sc.setCart_created_date(Date.valueOf("2018-11-27"));
//		sc.setOrder_id(null);
//		sc.setCart_name("user4");
//		sc.setCart_status("Checked Out");
//		sc.setCart_items(cart_items);
//		ShoppingCartDaoImpl.getInstance().createShoppingCart(sc);	
		
		
		Orders o = new Orders();
		o.setOrder_id(2);
/////// 2. Setting List Items for shopping cart
//		Products p = new Products();
//		p.setProduct_id(6);
//		p.setProduct_stock(20);
//			LineItems li = new LineItems();
//			li.setLitem_id(1);
//			li.setOrder_id(o);
//			li.setProduct_id(p);
//			li.setLitem_qty(20);
//			li.setCart_id(sc);
		
//		Products p2 = new Products();
//		p2.setProduct_id(1);
//		p2.setProduct_stock(20);
			LineItems li2 = new LineItems();
			li2.setLitem_id(2);
			li2.setOrder_id(o);
//			li2.setProduct_id(p2);
//			li2.setLitem_qty(20);
//			li2.setCart_id(sc);
			
//			List<LineItems> lst = new ArrayList<>();
//			lst.add(li);
//			lst.add(li2);
			
//			LineItemsDaoImpl.getInstance().createLineItem(li);
//			LineItemsDaoImpl.getInstance().createLineItem(li2);
//			LineItemsDaoImpl.getInstance().updateLineItemOrder(li);
//			LineItemsDaoImpl.getInstance().updateLineItemOrder(li2);
		
//////  3. Setting up order for shopping cart
//		Orders o = new Orders();
//		o.setOrder_id(3);
//		o.setUser_id(u);
////		o.setOrder_amount(500);
//		o.setOrder_status("Check Out");
//		o.setOrder_submitted(Date.valueOf("2018-11-27"));
//		o.setDriver_id(d);
//		o.setCart_id(sc);
//		OrdersDaoImpl.getInstance().createOrder(o);

//		Adding products
//		Products p = new Products();
//		p.setProduct_price(1.48);
//		p.setProduct_addeddate(Date.valueOf("2018-11-27"));
//		p.setProduct_stock(100);
//		p.setProduct_descr("Campbell's Condensed Healthy Request Cream of Mushroom Soup");
//		ProductsDaoImpl.getInstance().createProduct(p);
		
//		Products p2 = new Products();
//		p2.setProduct_id(3);
		

		
		
//		Creating Roles
//		RoleDaoImpl.getInstance().createRole(rc);
//		RoleDaoImpl.getInstance().createRole(rcu);
//		RoleDaoImpl.getInstance().createRole(rd);

	}

}

package com.grocerygogetters.util;

import java.util.List;

import org.hibernate.Session;

<<<<<<< HEAD
import com.grocerygogetters.dao.UsersDao;
import com.grocerygogetters.dao.UsersDaoImpl;
import com.grocerygogetters.model.Users;
=======
import com.grocerygogetters.dao.ShoppingCartDao;
import com.grocerygogetters.dao.ShoppingCartDaoImpl;
import com.grocerygogetters.model.ShoppingCart;
>>>>>>> 4f53fe4d7afefe709dd1e7411e0a342a8a91816b

public class Driver {

	public static void main(String[] args) {
//		Session s = HibernateUtil.getSession();
//		s.close();
<<<<<<< HEAD
		
		UsersDao user = new UsersDaoImpl();
		Users u = new Users();
		u.setUser_fname("John");
		u.setUser_lname("Smith");
		u.setUser_email("jsmith@email.com");
		u.setUser_password("1234");
		u.setUser_username("jsmith");
		u.setComp_id(0);
		
		user.createUser(u);
=======
//		
		ShoppingCartDao dao = new ShoppingCartDaoImpl();
		
		List<ShoppingCart> list = dao.getShoppingCarts();
		for(ShoppingCart obj : list) {
			System.out.println(obj);
		}
		
>>>>>>> 4f53fe4d7afefe709dd1e7411e0a342a8a91816b

	}

}

package com.grocerygogetters.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.grocerygogetters.model.Companies;
import com.grocerygogetters.model.Orders;
import com.grocerygogetters.model.Role;
import com.grocerygogetters.model.ShoppingCart;
import com.grocerygogetters.model.Users;
import com.grocerygogetters.services.UserServices;

@Controller
@CrossOrigin(origins="*", allowedHeaders="*")
public class UsersController {

	@Autowired
	UserServices userServices;
	
	@GetMapping("/users/{id}")
	@ResponseBody
	public Users getUsers(@PathVariable("id")int id) {
		Users u = userServices.getUserById(id);
		return u;
	}
	
	@GetMapping("/users")
	@ResponseBody
	public List<Users> getAllUsers() {
		List<Users> u = userServices.getUsers();
		return u;
	}
	
	@GetMapping("/shoppingcarts/{id}")
	@ResponseBody
	public List<ShoppingCart> getUserShoppingCart(@PathVariable("id")int id){
		Users u = userServices.getUserById(id);
		List<ShoppingCart> sc = userServices.getUsersCart(u);
		return sc;
	}
	
	@GetMapping("/orders/{id}")
	@ResponseBody
	public List<Orders> getUserOrders(@PathVariable("id")int id){
		Users u = userServices.getUserById(id);
		List<Orders> o = userServices.getUserOrders(u);
		return o;
	}
	
	@GetMapping("/userLogin")
	@ResponseBody
	public Users loginUser(HttpServletRequest request, HttpServletResponse response) {
		Users u = new Users();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		u.setUser_username(username);
		u.setUser_password(password);
		Users vuser = userServices.getUserByUsernamePass(u);
		return vuser;
	}
	
	@PostMapping("/userUpdate")
	public void updateUser(@RequestBody Users user) {
		Users u = new Users();
		u.setUser_id(user.getUser_id());
		u.setUser_address(user.getUser_address());
		u.setUser_city(user.getUser_city());
		u.setUser_email(user.getUser_email());
		u.setUser_fname(user.getUser_fname());
		u.setUser_lname(user.getUser_lname());
		u.setUser_username(user.getUser_username());
		u.setUser_zipcode(user.getUser_zipcode());
		userServices.updateUser(u);
	}
	
	@PostMapping("/createCustomer")
	public void createUser( @RequestBody Users user) {
		Role r = new Role();
		r.setRole_id(2);
		Users u = new Users();
		u.setUser_address(user.getUser_address());
		u.setUser_city(user.getUser_city());
		u.setUser_email(user.getUser_email());
		u.setUser_fname(user.getUser_fname());
		u.setUser_lname(user.getUser_lname());
		u.setUser_username(user.getUser_username());
		u.setUser_zipcode(user.getUser_zipcode());
		u.setUser_password(user.getUser_password());
		u.setComp_id(null);
		u.setRole_id(r);
		userServices.creatUser(u);
	}
	
	@PostMapping("/createClientCustomer")
	public void createClientUser(@RequestBody Users user) {
		Role r = new Role();
		r.setRole_id(1);
//		Companies c = new Companies();
//		c.setComp_id(compid);
		Users u = new Users();
		u.setUser_address(user.getUser_address());
		u.setUser_city(user.getUser_city());
		u.setUser_email(user.getUser_email());
		u.setUser_fname(user.getUser_fname());
		u.setUser_lname(user.getUser_lname());
		u.setUser_username(user.getUser_username());
		u.setUser_zipcode(user.getUser_zipcode());
		u.setUser_password(user.getUser_password());
		u.setComp_id(user.getComp_id());
		u.setRole_id(r);
		userServices.creatUser(u);
	}
}

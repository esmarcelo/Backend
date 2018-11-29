package com.grocerygogetters.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.grocerygogetters.model.Events;
import com.grocerygogetters.model.Recurrence;
import com.grocerygogetters.model.ShoppingCart;
import com.grocerygogetters.model.Users;
import com.grocerygogetters.services.EventsServices;

@Controller
@CrossOrigin(origins="*", allowedHeaders="*")
public class EventsController {
	
	@Autowired
	EventsServices eventsServices;

	@PostMapping("/createEvent")
	public void createEvent(@RequestBody Events event ) {
//		Users u = new Users();
//		u.setUser_id(userid);
//		
//		ShoppingCart sc = new ShoppingCart();
//		sc.setCart_id(cartid);
//		
//		Recurrence r = new Recurrence();
//		r.setRecur_id(recurid);
		
		Events e = new Events();
		e.setCart_id(event.getCart_id());
		e.setEvent_createddate(event.getEvent_createddate());
		e.setRecur_id(event.getRecur_id());
		e.setUser_id(event.getUser_id());
		eventsServices.createEvent(e);
		
	}
}

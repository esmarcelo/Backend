package com.grocerygogetters.services;

import org.springframework.stereotype.Service;

import com.grocerygogetters.dao.EventsDaoImpl;
import com.grocerygogetters.model.Events;

@Service
public class EventsServices {

private static EventsServices eventsServices;
	
	private EventsServices() {
	}
	
	public static EventsServices getInstance() {
		if (eventsServices == null) {
			eventsServices = new EventsServices();
		}
		return eventsServices;
	}
	
	public int createEvent(Events e) {
		return EventsDaoImpl.getInstance().createEvent(e);
	}
}

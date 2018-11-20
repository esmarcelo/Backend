package com.grocerygogetters.dao;

import java.util.List;

import com.grocerygogetters.model.Events;

public interface EventsDao {

	public List<Events> getEvents();
	public Events getEventById(int id);
	public int createEvent(Events e);
	public void updateEvent(Events e);
	public void deleteEventById(int id);
}

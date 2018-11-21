package com.grocerygogetters.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.grocerygogetters.model.Events;
import com.grocerygogetters.util.HibernateUtil;

public class EventsDaoImpl implements EventsDao{
	
	private static EventsDaoImpl eventsDaoImpl;
	
	private EventsDaoImpl() {
	}
	
	public static EventsDaoImpl getInstance() {
		if (eventsDaoImpl == null) {
			eventsDaoImpl = new EventsDaoImpl();
		}
		return eventsDaoImpl;
	}
	
	@Override
	public List<Events> getEvents() {
		Session s = HibernateUtil.getSession();
		List<Events> events = s.createQuery("from Events", Events.class).list();
		s.close();
		return events;
	}

	@Override
	public Events getEventById(int id) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.getSession();
		Events e = s.load(Events.class, id);
		s.close();
		return e;
	}

	@Override
	public int createEvent(Events e) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		int eventsPK = (int) s.save(e);
		tx.commit();
		s.close();
		return eventsPK;
	}

	@Override
	public void updateEvent(Events e) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.update(e);
		tx.commit();
		s.close();
	}

	@Override
	public void deleteEventById(int id) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		Events e = s.get(Events.class, id);
		if(e != null) {
			s.delete(e);
		}
		tx.commit();
		s.close();
	}
}

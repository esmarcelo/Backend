package com.grocerygogetters.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.grocerygogetters.model.LineItems;
import com.grocerygogetters.util.HibernateUtil;

public class LineItemsDaoImpl implements LineItemsDao{
	
	private static LineItemsDaoImpl lineItemsDaoImpl;
	
	private LineItemsDaoImpl() {
	}
	
	public static LineItemsDaoImpl getInstance() {
		if (lineItemsDaoImpl == null) {
			lineItemsDaoImpl = new LineItemsDaoImpl();
		}
		return lineItemsDaoImpl;
	}

	@Override
	public List<LineItems> getLineItems() {
		Session s = HibernateUtil.getSession();
		List<LineItems> lineitems = s.createQuery("from LineItems", LineItems.class).list();
		s.close();
		return lineitems;
	}

	@Override
	public LineItems getLineItemById(int id) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.getSession();
		LineItems l = s.load(LineItems.class, id);
		s.close();
		return l;
	}

	@Override
	public int createLineItem(LineItems l) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		int lineitemsPK = (int) s.save(l);
		tx.commit();
		s.close();
		return lineitemsPK;
	}

	@Override
	public void updateLineItem(LineItems l) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.update(l);
		tx.commit();
		s.close();
	}

	@Override
	public void deleteLineItemById(int id) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		LineItems l = s.get(LineItems.class, id);
		if(l != null) {
			s.delete(l);
		}
		tx.commit();
		s.close();
	}

	@Override
	public List<LineItems> AddListItemToList(LineItems li, List<LineItems> lst) {
		lst.add(li);
		return lst;
	}
	
	
}

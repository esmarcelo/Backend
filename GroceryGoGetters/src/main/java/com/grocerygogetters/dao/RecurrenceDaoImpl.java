package com.grocerygogetters.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.grocerygogetters.model.Recurrence;
import com.grocerygogetters.util.HibernateUtil;

public class RecurrenceDaoImpl implements RecurrenceDao{

	@Override
	public List<Recurrence> getRecurrences() {
		Session s = HibernateUtil.getSession();
		List<Recurrence> recurrences = s.createQuery("from Recurrence", Recurrence.class).list();
		s.close();
		return recurrences;
	}

	@Override
	public Recurrence getRecurrenceById(int id) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.getSession();
		Recurrence re = s.load(Recurrence.class, id);
		s.close();
		return re;
	}

	@Override
	public int createRecurrence(Recurrence re) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		int recurrencePK = (int) s.save(re);
		tx.commit();
		s.close();
		return recurrencePK;
	}

	@Override
	public void updateRecurrence(Recurrence re) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.update(re);
		tx.commit();
		s.close();
	}

	@Override
	public void deleteRecurrenceById(int id) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		Recurrence re = s.get(Recurrence.class, id);
		if(re != null) {
			s.delete(re);
		}
		tx.commit();
		s.close();
	}
}

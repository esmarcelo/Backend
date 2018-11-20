package com.grocerygogetters.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.grocerygogetters.model.Feedback;
import com.grocerygogetters.util.HibernateUtil;

public class FeedbackDaoImpl implements FeedbackDao {

	@Override
	public List<Feedback> getFeedbacks() {
		Session s = HibernateUtil.getSession();
		List<Feedback> feedbacks = s.createQuery("from Feedback", Feedback.class).list();
		s.close();
		return feedbacks;
	}

	@Override
	public Feedback getFeedbackById(int id) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.getSession();
		Feedback f = s.load(Feedback.class, id);
		//System.out.println(f);
		
		s.close();
		return f;
	}

	@Override
	public int createFeedback(Feedback f) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		int feedbackPK = (int) s.save(f);
		tx.commit();
		s.close();
		return feedbackPK;
	}

	@Override
	public void updateFeedback(Feedback f) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.update(f);
		tx.commit();
		s.close();
		
	}

	@Override
	public void deleteFeedbackById(int id) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		Feedback f = s.get(Feedback.class, id);
		if(f != null) {
			s.delete(f);
		}
		tx.commit();
		s.close();
		
	}

}

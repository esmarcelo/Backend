package com.grocerygogetters.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.grocerygogetters.model.Companies;
import com.grocerygogetters.util.HibernateUtil;

public class CompaniesDaoImpl implements CompaniesDao {

	@Override
	public List<Companies> getCompanies() {
		Session s = HibernateUtil.getSession();
		List<Companies> companies = s.createQuery("from Companies", Companies.class).list();
		s.close();
		return companies;
	}

	@Override
	public Companies getCompanyById(int id) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.getSession();
		Companies c = s.load(Companies.class, id);
		s.close();
		return c;
	}

	@Override
	public int createCompany(Companies c) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		int companiesPK = (int) s.save(c);
		tx.commit();
		s.close();
		return companiesPK;
	}

	@Override
	public void updateCompany(Companies c) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.update(c);
		tx.commit();
		s.close();
	}

	@Override
	public void deleteCompanyById(int id) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		Companies c = s.get(Companies.class, id);
		if(c != null) {
			s.delete(c);
		}
		tx.commit();
		s.close();
	}
}

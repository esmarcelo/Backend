package com.grocerygogetters.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.grocerygogetters.model.Role;
import com.grocerygogetters.util.HibernateUtil;

public class RoleDaoImpl implements RoleDao {

	@Override
	public List<Role> getRoles() {
		Session s = HibernateUtil.getSession();
		List<Role> roles = s.createQuery("from Role", Role.class).list();
		s.close();
		return roles;
	}

	@Override
	public Role getRoleById(int id) {
		// TODO Auto-generated method stub
		Session s = HibernateUtil.getSession();
		Role ro = s.load(Role.class, id);
		s.close();
		return ro;
	}

	@Override
	public int createRole(Role ro) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		int rolePK = (int) s.save(ro);
		tx.commit();
		s.close();
		return rolePK;
	}

	@Override
	public void updateRole(Role ro) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.update(ro);
		tx.commit();
		s.close();
	}

	@Override
	public void deleteRoleById(int id) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		Role ro = s.get(Role.class, id);
		if(ro != null) {
			s.delete(ro);
		}
		tx.commit();
		s.close();
	}
}

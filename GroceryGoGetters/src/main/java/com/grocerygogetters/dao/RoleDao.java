package com.grocerygogetters.dao;

import java.util.List;

import com.grocerygogetters.model.Role;

public interface RoleDao {

	public List<Role> getRoles();
	public Role getRoleById(int id);
	public int createRole(Role ro);
	public void updateRole(Role ro);
	public void deleteRoleById(int id);

}

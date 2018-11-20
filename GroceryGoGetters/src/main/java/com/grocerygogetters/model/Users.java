package com.grocerygogetters.model;

public class Users {
	private int user_id;
	private String user_fname;
	private String user_lname;
	private String user_username;
	private String user_email;
	private String user_password;
	private Companies comp_id;
	private int user_points;
	private String user_address;
	private String user_city;
	private String user_zipcode;
	private Role role_id;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		if (comp_id == null) {
			if (other.comp_id != null)
				return false;
		} else if (!comp_id.equals(other.comp_id))
			return false;
		if (role_id == null) {
			if (other.role_id != null)
				return false;
		} else if (!role_id.equals(other.role_id))
			return false;
		if (user_address == null) {
			if (other.user_address != null)
				return false;
		} else if (!user_address.equals(other.user_address))
			return false;
		if (user_city == null) {
			if (other.user_city != null)
				return false;
		} else if (!user_city.equals(other.user_city))
			return false;
		if (user_email == null) {
			if (other.user_email != null)
				return false;
		} else if (!user_email.equals(other.user_email))
			return false;
		if (user_fname == null) {
			if (other.user_fname != null)
				return false;
		} else if (!user_fname.equals(other.user_fname))
			return false;
		if (user_id != other.user_id)
			return false;
		if (user_lname == null) {
			if (other.user_lname != null)
				return false;
		} else if (!user_lname.equals(other.user_lname))
			return false;
		if (user_password == null) {
			if (other.user_password != null)
				return false;
		} else if (!user_password.equals(other.user_password))
			return false;
		if (user_points != other.user_points)
			return false;
		if (user_username == null) {
			if (other.user_username != null)
				return false;
		} else if (!user_username.equals(other.user_username))
			return false;
		if (user_zipcode == null) {
			if (other.user_zipcode != null)
				return false;
		} else if (!user_zipcode.equals(other.user_zipcode))
			return false;
		return true;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comp_id == null) ? 0 : comp_id.hashCode());
		result = prime * result + ((role_id == null) ? 0 : role_id.hashCode());
		result = prime * result + ((user_address == null) ? 0 : user_address.hashCode());
		result = prime * result + ((user_city == null) ? 0 : user_city.hashCode());
		result = prime * result + ((user_email == null) ? 0 : user_email.hashCode());
		result = prime * result + ((user_fname == null) ? 0 : user_fname.hashCode());
		result = prime * result + user_id;
		result = prime * result + ((user_lname == null) ? 0 : user_lname.hashCode());
		result = prime * result + ((user_password == null) ? 0 : user_password.hashCode());
		result = prime * result + user_points;
		result = prime * result + ((user_username == null) ? 0 : user_username.hashCode());
		result = prime * result + ((user_zipcode == null) ? 0 : user_zipcode.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", user_fname=" + user_fname + ", user_lname=" + user_lname
				+ ", user_username=" + user_username + ", user_email=" + user_email + ", user_password=" + user_password
				+ ", comp_id=" + comp_id + ", user_points=" + user_points + ", user_address=" + user_address
				+ ", user_city=" + user_city + ", user_zipcode=" + user_zipcode + ", role_id=" + role_id + "]";
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_fname() {
		return user_fname;
	}
	public void setUser_fname(String user_fname) {
		this.user_fname = user_fname;
	}
	public String getUser_lname() {
		return user_lname;
	}
	public void setUser_lname(String user_lname) {
		this.user_lname = user_lname;
	}
	public String getUser_username() {
		return user_username;
	}
	public void setUser_username(String user_username) {
		this.user_username = user_username;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public Companies getComp_id() {
		return comp_id;
	}
	public void setComp_id(Companies comp_id) {
		this.comp_id = comp_id;
	}
	public int getUser_points() {
		return user_points;
	}
	public void setUser_points(int user_points) {
		this.user_points = user_points;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getUser_city() {
		return user_city;
	}
	public void setUser_city(String user_city) {
		this.user_city = user_city;
	}
	public String getUser_zipcode() {
		return user_zipcode;
	}
	public void setUser_zipcode(String user_zipcode) {
		this.user_zipcode = user_zipcode;
	}
	public Role getRole_id() {
		return role_id;
	}
	public void setRole_id(Role role_id) {
		this.role_id = role_id;
	}
	public Users(int user_id, String user_fname, String user_lname, String user_username, String user_email,
			String user_password, Companies comp_id, int user_points, String user_address, String user_city,
			String user_zipcode, Role role_id) {
		super();
		this.user_id = user_id;
		this.user_fname = user_fname;
		this.user_lname = user_lname;
		this.user_username = user_username;
		this.user_email = user_email;
		this.user_password = user_password;
		this.comp_id = comp_id;
		this.user_points = user_points;
		this.user_address = user_address;
		this.user_city = user_city;
		this.user_zipcode = user_zipcode;
		this.role_id = role_id;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

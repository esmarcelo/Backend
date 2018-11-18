package com.grocerygogetters.model;

public class Companies {
	private int comp_id;
	private String comp_name;
	private String comp_state;
	private String comp_city;
	private String comp_address;
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
		Companies other = (Companies) obj;
		if (comp_address == null) {
			if (other.comp_address != null)
				return false;
		} else if (!comp_address.equals(other.comp_address))
			return false;
		if (comp_city == null) {
			if (other.comp_city != null)
				return false;
		} else if (!comp_city.equals(other.comp_city))
			return false;
		if (comp_id != other.comp_id)
			return false;
		if (comp_name == null) {
			if (other.comp_name != null)
				return false;
		} else if (!comp_name.equals(other.comp_name))
			return false;
		if (comp_state == null) {
			if (other.comp_state != null)
				return false;
		} else if (!comp_state.equals(other.comp_state))
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
		result = prime * result + ((comp_address == null) ? 0 : comp_address.hashCode());
		result = prime * result + ((comp_city == null) ? 0 : comp_city.hashCode());
		result = prime * result + comp_id;
		result = prime * result + ((comp_name == null) ? 0 : comp_name.hashCode());
		result = prime * result + ((comp_state == null) ? 0 : comp_state.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "Companies [comp_id=" + comp_id + ", comp_name=" + comp_name + ", comp_state=" + comp_state
				+ ", comp_city=" + comp_city + ", comp_address=" + comp_address + "]";
	}
	public int getComp_id() {
		return comp_id;
	}
	public void setComp_id(int comp_id) {
		this.comp_id = comp_id;
	}
	public String getComp_name() {
		return comp_name;
	}
	public void setComp_name(String comp_name) {
		this.comp_name = comp_name;
	}
	public String getComp_state() {
		return comp_state;
	}
	public void setComp_state(String comp_state) {
		this.comp_state = comp_state;
	}
	public String getComp_city() {
		return comp_city;
	}
	public void setComp_city(String comp_city) {
		this.comp_city = comp_city;
	}
	public String getComp_address() {
		return comp_address;
	}
	public void setComp_address(String comp_address) {
		this.comp_address = comp_address;
	}
	public Companies(int comp_id, String comp_name, String comp_state, String comp_city, String comp_address) {
		super();
		this.comp_id = comp_id;
		this.comp_name = comp_name;
		this.comp_state = comp_state;
		this.comp_city = comp_city;
		this.comp_address = comp_address;
	}
	public Companies() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

package com.grocerygogetters.model;

import org.springframework.stereotype.Component;

@Component
public class Recurrence {
	private int recur_id;
	private String recur_type;
	private String recur_descr;
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
		Recurrence other = (Recurrence) obj;
		if (recur_descr == null) {
			if (other.recur_descr != null)
				return false;
		} else if (!recur_descr.equals(other.recur_descr))
			return false;
		if (recur_id != other.recur_id)
			return false;
		if (recur_type == null) {
			if (other.recur_type != null)
				return false;
		} else if (!recur_type.equals(other.recur_type))
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
		result = prime * result + ((recur_descr == null) ? 0 : recur_descr.hashCode());
		result = prime * result + recur_id;
		result = prime * result + ((recur_type == null) ? 0 : recur_type.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "Recurrence [recur_id=" + recur_id + ", recur_type=" + recur_type + ", recur_descr=" + recur_descr + "]";
	}
	public int getRecur_id() {
		return recur_id;
	}
	public void setRecur_id(int recur_id) {
		this.recur_id = recur_id;
	}
	public String getRecur_type() {
		return recur_type;
	}
	public void setRecur_type(String recur_type) {
		this.recur_type = recur_type;
	}
	public String getRecur_descr() {
		return recur_descr;
	}
	public void setRecur_descr(String recur_descr) {
		this.recur_descr = recur_descr;
	}
	public Recurrence(int recur_id, String recur_type, String recur_descr) {
		super();
		this.recur_id = recur_id;
		this.recur_type = recur_type;
		this.recur_descr = recur_descr;
	}
	public Recurrence() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

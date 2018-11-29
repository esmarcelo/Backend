package com.grocerygogetters.model;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class Events {
	private int event_id;
	private Users user_id;
	private Recurrence recur_id;
	private Date event_createddate;
	private Date event_nextdate;
	private ShoppingCart cart_id;
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
		Events other = (Events) obj;
		if (cart_id == null) {
			if (other.cart_id != null)
				return false;
		} else if (!cart_id.equals(other.cart_id))
			return false;
		if (event_createddate == null) {
			if (other.event_createddate != null)
				return false;
		} else if (!event_createddate.equals(other.event_createddate))
			return false;
		if (event_id != other.event_id)
			return false;
		if (event_nextdate == null) {
			if (other.event_nextdate != null)
				return false;
		} else if (!event_nextdate.equals(other.event_nextdate))
			return false;
		if (recur_id == null) {
			if (other.recur_id != null)
				return false;
		} else if (!recur_id.equals(other.recur_id))
			return false;
		if (user_id == null) {
			if (other.user_id != null)
				return false;
		} else if (!user_id.equals(other.user_id))
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
		result = prime * result + ((cart_id == null) ? 0 : cart_id.hashCode());
		result = prime * result + ((event_createddate == null) ? 0 : event_createddate.hashCode());
		result = prime * result + event_id;
		result = prime * result + ((event_nextdate == null) ? 0 : event_nextdate.hashCode());
		result = prime * result + ((recur_id == null) ? 0 : recur_id.hashCode());
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "Events [event_id=" + event_id + ", user_id=" + user_id + ", recur_id=" + recur_id
				+ ", event_createddate=" + event_createddate + ", event_nextdate=" + event_nextdate + ", cart_id="
				+ cart_id + "]";
	}
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public Users getUser_id() {
		return user_id;
	}
	public void setUser_id(Users user_id) {
		this.user_id = user_id;
	}
	public Recurrence getRecur_id() {
		return recur_id;
	}
	public void setRecur_id(Recurrence recur_id) {
		this.recur_id = recur_id;
	}
	public Date getEvent_createddate() {
		return event_createddate;
	}
	public void setEvent_createddate(Date event_createddate) {
		this.event_createddate = event_createddate;
	}
	public Date getEvent_nextdate() {
		return event_nextdate;
	}
	public void setEvent_nextdate(Date event_nextdate) {
		this.event_nextdate = event_nextdate;
	}
	public ShoppingCart getCart_id() {
		return cart_id;
	}
	public void setCart_id(ShoppingCart cart_id) {
		this.cart_id = cart_id;
	}
	public Events(int event_id, Users user_id, Recurrence recur_id, Date event_createddate, Date event_nextdate,
			ShoppingCart cart_id) {
		super();
		this.event_id = event_id;
		this.user_id = user_id;
		this.recur_id = recur_id;
		this.event_createddate = event_createddate;
		this.event_nextdate = event_nextdate;
		this.cart_id = cart_id;
	}
	public Events() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	
}

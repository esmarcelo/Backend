package com.grocerygogetters.model;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class Orders {
	private int order_id;
	private Date order_created;
	private Date order_submitted;
	private Users user_id;
	private double order_amount;
	private Users driver_id;
	private String order_status;
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
		Orders other = (Orders) obj;
		if (cart_id == null) {
			if (other.cart_id != null)
				return false;
		} else if (!cart_id.equals(other.cart_id))
			return false;
		if (driver_id == null) {
			if (other.driver_id != null)
				return false;
		} else if (!driver_id.equals(other.driver_id))
			return false;
		if (Double.doubleToLongBits(order_amount) != Double.doubleToLongBits(other.order_amount))
			return false;
		if (order_created == null) {
			if (other.order_created != null)
				return false;
		} else if (!order_created.equals(other.order_created))
			return false;
		if (order_id != other.order_id)
			return false;
		if (order_status == null) {
			if (other.order_status != null)
				return false;
		} else if (!order_status.equals(other.order_status))
			return false;
		if (order_submitted == null) {
			if (other.order_submitted != null)
				return false;
		} else if (!order_submitted.equals(other.order_submitted))
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
		result = prime * result + ((driver_id == null) ? 0 : driver_id.hashCode());
		long temp;
		temp = Double.doubleToLongBits(order_amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((order_created == null) ? 0 : order_created.hashCode());
		result = prime * result + order_id;
		result = prime * result + ((order_status == null) ? 0 : order_status.hashCode());
		result = prime * result + ((order_submitted == null) ? 0 : order_submitted.hashCode());
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "Orders [order_id=" + order_id + ", order_created=" + order_created + ", order_submitted="
				+ order_submitted + ", user_id=" + user_id + ", order_amount=" + order_amount + ", driver_id="
				+ driver_id + ", order_status=" + order_status + ", cart_id=" + cart_id + "]";
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public Date getOrder_created() {
		return order_created;
	}
	public void setOrder_created(Date order_created) {
		this.order_created = order_created;
	}
	public Date getOrder_submitted() {
		return order_submitted;
	}
	public void setOrder_submitted(Date order_submitted) {
		this.order_submitted = order_submitted;
	}
	public Users getUser_id() {
		return user_id;
	}
	public void setUser_id(Users user_id) {
		this.user_id = user_id;
	}
	public double getOrder_amount() {
		return order_amount;
	}
	public void setOrder_amount(double order_amount) {
		this.order_amount = order_amount;
	}
	public Users getDriver_id() {
		return driver_id;
	}
	public void setDriver_id(Users driver_id) {
		this.driver_id = driver_id;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	public ShoppingCart getCart_id() {
		return cart_id;
	}
	public void setCart_id(ShoppingCart cart_id) {
		this.cart_id = cart_id;
	}
	public Orders(int order_id, Date order_created, Date order_submitted, Users user_id, double order_amount,
			Users driver_id, String order_status, ShoppingCart cart_id) {
		super();
		this.order_id = order_id;
		this.order_created = order_created;
		this.order_submitted = order_submitted;
		this.user_id = user_id;
		this.order_amount = order_amount;
		this.driver_id = driver_id;
		this.order_status = order_status;
		this.cart_id = cart_id;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		
}

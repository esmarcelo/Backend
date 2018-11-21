package com.grocerygogetters.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class ShoppingCart {
	private int cart_id;
	private Users user_id;
	private Date cart_created_date;
	private Orders order_id;
	private String cart_name;
	private String cart_status;
	private List<LineItems> cart_items = new ArrayList<>();
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
		ShoppingCart other = (ShoppingCart) obj;
		if (cart_created_date == null) {
			if (other.cart_created_date != null)
				return false;
		} else if (!cart_created_date.equals(other.cart_created_date))
			return false;
		if (cart_id != other.cart_id)
			return false;
		if (cart_items == null) {
			if (other.cart_items != null)
				return false;
		} else if (!cart_items.equals(other.cart_items))
			return false;
		if (cart_name == null) {
			if (other.cart_name != null)
				return false;
		} else if (!cart_name.equals(other.cart_name))
			return false;
		if (cart_status == null) {
			if (other.cart_status != null)
				return false;
		} else if (!cart_status.equals(other.cart_status))
			return false;
		if (order_id == null) {
			if (other.order_id != null)
				return false;
		} else if (!order_id.equals(other.order_id))
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
		result = prime * result + ((cart_created_date == null) ? 0 : cart_created_date.hashCode());
		result = prime * result + cart_id;
		result = prime * result + ((cart_items == null) ? 0 : cart_items.hashCode());
		result = prime * result + ((cart_name == null) ? 0 : cart_name.hashCode());
		result = prime * result + ((cart_status == null) ? 0 : cart_status.hashCode());
		result = prime * result + ((order_id == null) ? 0 : order_id.hashCode());
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "ShoppingCart [cart_id=" + cart_id + ", user_id=" + user_id + ", cart_created_date=" + cart_created_date
				+ ", order_id=" + order_id + ", cart_name=" + cart_name + ", cart_status=" + cart_status
				+ ", cart_items=" + cart_items + "]";
	}
	public int getCart_id() {
		return cart_id;
	}
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	public Users getUser_id() {
		return user_id;
	}
	public void setUser_id(Users user_id) {
		this.user_id = user_id;
	}
	public Date getCart_created_date() {
		return cart_created_date;
	}
	public void setCart_created_date(Date cart_created_date) {
		this.cart_created_date = cart_created_date;
	}
	public Orders getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Orders order_id) {
		this.order_id = order_id;
	}
	public String getCart_name() {
		return cart_name;
	}
	public void setCart_name(String cart_name) {
		this.cart_name = cart_name;
	}
	public String getCart_status() {
		return cart_status;
	}
	public void setCart_status(String cart_status) {
		this.cart_status = cart_status;
	}
	public List<LineItems> getCart_items() {
		return cart_items;
	}
	public void setCart_items(List<LineItems> cart_items) {
		this.cart_items = cart_items;
	}
	public ShoppingCart(int cart_id, Users user_id, Date cart_created_date, Orders order_id, String cart_name,
			String cart_status, List<LineItems> cart_items) {
		super();
		this.cart_id = cart_id;
		this.user_id = user_id;
		this.cart_created_date = cart_created_date;
		this.order_id = order_id;
		this.cart_name = cart_name;
		this.cart_status = cart_status;
		this.cart_items = cart_items;
	}
	public ShoppingCart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		

}

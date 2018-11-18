package com.grocerygogetters.model;

public class LineItems {
	private int litem_id;
	private int litem_qty;
	private int order_id;
	private int product_id;
	private int cart_id;
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
		LineItems other = (LineItems) obj;
		if (cart_id != other.cart_id)
			return false;
		if (litem_id != other.litem_id)
			return false;
		if (litem_qty != other.litem_qty)
			return false;
		if (order_id != other.order_id)
			return false;
		if (product_id != other.product_id)
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
		result = prime * result + cart_id;
		result = prime * result + litem_id;
		result = prime * result + litem_qty;
		result = prime * result + order_id;
		result = prime * result + product_id;
		return result;
	}
	@Override
	public String toString() {
		return "LineItems [litem_id=" + litem_id + ", litem_qty=" + litem_qty + ", order_id=" + order_id
				+ ", product_id=" + product_id + ", cart_id=" + cart_id + "]";
	}
	public int getLitem_id() {
		return litem_id;
	}
	public void setLitem_id(int litem_id) {
		this.litem_id = litem_id;
	}
	public int getLitem_qty() {
		return litem_qty;
	}
	public void setLitem_qty(int litem_qty) {
		this.litem_qty = litem_qty;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getCart_id() {
		return cart_id;
	}
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	public LineItems(int litem_id, int litem_qty, int order_id, int product_id, int cart_id) {
		super();
		this.litem_id = litem_id;
		this.litem_qty = litem_qty;
		this.order_id = order_id;
		this.product_id = product_id;
		this.cart_id = cart_id;
	}
	public LineItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

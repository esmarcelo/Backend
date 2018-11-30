package com.grocerygogetters.model;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class Products {
	private int product_id;
	private double product_price;
	private Date product_addeddate;
	private Companies comp_id;
	private int product_stock;
	private String product_descr;
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
		Products other = (Products) obj;
		if (comp_id == null) {
			if (other.comp_id != null)
				return false;
		} else if (!comp_id.equals(other.comp_id))
			return false;
		if (product_addeddate == null) {
			if (other.product_addeddate != null)
				return false;
		} else if (!product_addeddate.equals(other.product_addeddate))
			return false;
		if (product_descr == null) {
			if (other.product_descr != null)
				return false;
		} else if (!product_descr.equals(other.product_descr))
			return false;
		if (product_id != other.product_id)
			return false;
		if (Double.doubleToLongBits(product_price) != Double.doubleToLongBits(other.product_price))
			return false;
		if (product_stock != other.product_stock)
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
		result = prime * result + ((product_addeddate == null) ? 0 : product_addeddate.hashCode());
		result = prime * result + ((product_descr == null) ? 0 : product_descr.hashCode());
		result = prime * result + product_id;
		long temp;
		temp = Double.doubleToLongBits(product_price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + product_stock;
		return result;
	}
	@Override
	public String toString() {
		return "Products [product_id=" + product_id + ", product_price=" + product_price + ", product_addeddate="
				+ product_addeddate + ", comp_id=" + comp_id + ", product_stock=" + product_stock + ", product_descr="
				+ product_descr + "]";
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	public Date getProduct_addeddate() {
		return product_addeddate;
	}
	public void setProduct_addeddate(Date product_addeddate) {
		this.product_addeddate = product_addeddate;
	}
	public Companies getComp_id() {
		return comp_id;
	}
	public void setComp_id(Companies comp_id) {
		this.comp_id = comp_id;
	}
	public int getProduct_stock() {
		return product_stock;
	}
	public void setProduct_stock(int product_stock) {
		this.product_stock = product_stock;
	}
	public String getProduct_descr() {
		return product_descr;
	}
	public void setProduct_descr(String product_descr) {
		this.product_descr = product_descr;
	}
	public Products(int product_id, double product_price, Date product_addeddate, Companies comp_id, int product_stock,
			String product_descr) {
		super();
		this.product_id = product_id;
		this.product_price = product_price;
		this.product_addeddate = product_addeddate;
		this.comp_id = comp_id;
		this.product_stock = product_stock;
		this.product_descr = product_descr;
	}
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
		
}

package com.grocerygogetters.dao;

import java.util.List;

import com.grocerygogetters.model.Products;

public interface ProductsDao {

	public List<Products> getProducts();
	public Products getProductById(int id);
	public int createProduct(Products p);
	public void updateProduct(Products p);
	public void deleteProductById(int id);

}

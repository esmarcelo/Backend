package com.grocerygogetters.dao;

import java.util.List;

import com.grocerygogetters.model.Companies;
import com.grocerygogetters.model.LineItems;
import com.grocerygogetters.model.Products;

public interface ProductsDao {

	public List<Products> getProducts();
	public List<Products> getProductsByClient(Companies c);
	public Products getProductById(int id);
	public int createProduct(Products p);
	public void updateProduct(Products p);
	public void deleteProductById(int id);
	public LineItems CreateProductListItem(Products p, int itemNumber);

}

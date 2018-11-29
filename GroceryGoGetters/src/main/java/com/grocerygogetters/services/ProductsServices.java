package com.grocerygogetters.services;

import org.springframework.stereotype.Service;

import com.grocerygogetters.dao.ProductsDaoImpl;
import com.grocerygogetters.model.Products;

@Service
public class ProductsServices {

private static ProductsServices productsServices;
	
	private ProductsServices() {
	}
	
	public static ProductsServices getInstance() {
		if (productsServices == null) {
			productsServices = new ProductsServices();
		}
		return productsServices;
	}
	
	public int createProduct(Products p) {
		return ProductsDaoImpl.getInstance().createProduct(p);
	}
}

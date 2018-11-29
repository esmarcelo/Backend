package com.grocerygogetters.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.grocerygogetters.model.Companies;
import com.grocerygogetters.model.Products;
import com.grocerygogetters.services.ProductsServices;

@Controller
@CrossOrigin(origins="*", allowedHeaders="*")
public class ProductsController {

	@Autowired
	ProductsServices productsServices;
	
	@PostMapping("/createProduct")
	public void createProduct(@RequestParam("productPrice")double prodPrice, @RequestParam("productAdded")Date date, 
			@RequestParam("companyid")int compid, @RequestParam("productStock")int stock, @RequestParam("productDescr")String proddescr) {
		Companies com = new Companies();
		com.setComp_id(compid);
		Products p = new Products();
		p.setComp_id(com);
		p.setProduct_price(prodPrice);
		p.setProduct_addeddate(date);
		p.setProduct_stock(stock);
		p.setProduct_descr(proddescr);
		
		productsServices.createProduct(p);
		
	}
}
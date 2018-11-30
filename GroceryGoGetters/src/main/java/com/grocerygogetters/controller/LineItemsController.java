package com.grocerygogetters.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.grocerygogetters.model.LineItems;
import com.grocerygogetters.services.LineItemsServices;

@Controller
@CrossOrigin(origins="*", allowedHeaders="*")
public class LineItemsController {
	
	@Autowired
	LineItemsServices lineItemsServices;
	
	@GetMapping("/lineItemsbyOrders/{id}")
	@ResponseBody
	public List<LineItems> getLineItemsByOrder(@PathVariable("id")int id){
		List<LineItems> itemlist = lineItemsServices.getLineItemsByOrder(id);
		return itemlist;
	}
	
	@PostMapping("/createLineItem")
	public void createLineItem(@RequestBody LineItems li) {
		lineItemsServices.createLineItem(li);
	}
	
	@GetMapping("/deletLineItem/{id}")
	@ResponseBody
	public void deleLineItem(@PathVariable("id")int id) {
		lineItemsServices.deleteLineItemById(id);
	}

}

package com.grocerygogetters.dao;

import java.util.List;

import com.grocerygogetters.model.LineItems;
import com.grocerygogetters.model.Orders;

public interface LineItemsDao {

	public List<LineItems> getLineItems();
	public LineItems getLineItemById(int id);
	public int createLineItem(LineItems l);
	public void updateLineItem(LineItems l);
	public void deleteLineItemById(int id);
	public List<LineItems> AddListItemToList(LineItems li, List<LineItems> lst);
	public List<LineItems> getLineItemsByOrder(Orders o);
	public void updateLineItemOrder(LineItems l);

}

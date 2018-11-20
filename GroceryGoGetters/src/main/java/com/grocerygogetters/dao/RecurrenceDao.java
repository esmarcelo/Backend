package com.grocerygogetters.dao;

import java.util.List;

import com.grocerygogetters.model.Recurrence;

public interface RecurrenceDao {

	public List<Recurrence> getRecurrences();
	public Recurrence getRecurrenceById(int id);
	public int createRecurrence(Recurrence re);
	public void updateRecurrence(Recurrence re);
	public void deleteRecurrenceById(int id);

}

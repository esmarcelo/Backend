package com.grocerygogetters.dao;

import java.util.List;

import com.grocerygogetters.model.Feedback;

public interface FeedbackDao {

	public List<Feedback> getFeedbacks();
	public Feedback getFeedbackById(int id);
	public int createFeedback(Feedback f);
	public void updateFeedback(Feedback f);
	public void deleteFeedbackById(int id);
}

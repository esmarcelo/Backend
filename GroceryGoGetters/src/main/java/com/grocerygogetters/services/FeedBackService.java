package com.grocerygogetters.services;

import org.springframework.stereotype.Service;

import com.grocerygogetters.dao.FeedbackDaoImpl;
import com.grocerygogetters.model.Feedback;

@Service
public class FeedBackService {

private static FeedBackService feedBackService;
	
	private FeedBackService() {
	}
	
	public static FeedBackService getInstance() {
		if (feedBackService == null) {
			feedBackService = new FeedBackService();
		}
		return feedBackService;
	}
	
	public void createFeedBack(Feedback fb) {
		FeedbackDaoImpl.getInstance().createFeedback(fb);
	}
}

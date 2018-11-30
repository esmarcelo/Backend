package com.grocerygogetters.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.grocerygogetters.model.Feedback;
import com.grocerygogetters.services.FeedBackService;

@RestController
@CrossOrigin(origins="*", allowedHeaders="*")
public class FeedBackController {
	
	@Autowired
	FeedBackService feedBackService;

	@PostMapping("/createFeedBack")
	public void createFeedBack(@RequestBody Feedback fb) {
		feedBackService.createFeedBack(fb);
	}
}

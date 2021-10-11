package com.newscape.review.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.newscape.review.model.Review;
import com.newscape.review.model.ReviewService;

@RestController
public class ReviewController {
	
	private static final Logger log = LoggerFactory.getLogger(ReviewController.class);
	
	@Autowired
	private ReviewService reviewService;

	@GetMapping("/review/{productId}")
	public Review getReview(@PathVariable int productId) {
		log.info("In Review service");
		return reviewService.findById(productId);
	}
	
}

package com.newscape.review.model;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class ReviewService {
	
	private static List<Review> rv = new ArrayList<>();
	
	static {
		rv.add(new Review(1, 1, "It is an awesome product", "John Smith", new Date()));
		rv.add(new Review(2, 2, "Nice product", "Emily", new Date()));
		rv.add(new Review(3, 3, "Good one", "Maria", new Date()));
	}
	
	public Review findById(int id) {
		for(Review rev:rv) {
			if(rev.getProductId() == id) {
				return rev;
			}
		}
		return null;
	}
	
	public List<Review> getAll(){
		return rv;
	}
}

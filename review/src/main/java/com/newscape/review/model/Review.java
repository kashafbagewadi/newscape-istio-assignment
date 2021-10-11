package com.newscape.review.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Review {

	private int reviewId;
	private int productId;
	private String reviewBy;
	private String review;
	private Date reviewDate;
	
}

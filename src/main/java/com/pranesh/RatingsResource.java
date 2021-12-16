package com.pranesh;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable int movieId) {
		return new Rating(movieId, 10);
	}
	
	@RequestMapping("users/{userId}")
	public UserRating getUserRating(@PathVariable int userId) {
		List<Rating> ratings = Arrays.asList(
				new Rating(1, 1),
				new Rating(2, 2)
		);
		
		UserRating userRating = new UserRating();
		userRating.setUserRaating(ratings);
		return userRating;
	}
}

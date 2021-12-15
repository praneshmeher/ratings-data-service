package com.pranesh;

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
}

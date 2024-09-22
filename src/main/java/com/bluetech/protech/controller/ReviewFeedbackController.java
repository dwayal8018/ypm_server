package com.bluetech.protech.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bluetech.protech.pojo.ReviewFeedback;
import com.bluetech.protech.service.ReviewFeedbackService;

@RestController
@RequestMapping("/api/review-feedbacks")
public class ReviewFeedbackController {

	@Autowired
	private ReviewFeedbackService reviewFeedbackService;

	@PostMapping
	public List<ReviewFeedback> createReviewFeedback(@RequestBody List<ReviewFeedback> reviewFeedbackList) {
		return reviewFeedbackService.createReviewFeedback(reviewFeedbackList);
	}

	@GetMapping
	public List<ReviewFeedback> getAllReviewFeedbacks() {
		return reviewFeedbackService.getAllReviewFeedbacks();
	}

	@GetMapping("/{id}")
	public Optional<ReviewFeedback> getReviewFeedbackById(@PathVariable Integer id) {
		return reviewFeedbackService.getReviewFeedbackById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteReviewFeedback(@PathVariable Integer id) {
		reviewFeedbackService.deleteReviewFeedback(id);
	}
}

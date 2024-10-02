package com.bluetech.protech.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bluetech.protech.dto.ReviewFeedbackDTO;
import com.bluetech.protech.service.ReviewFeedbackService;

@RestController
@RequestMapping("/api/review-feedbacks")
public class ReviewFeedbackController {

	@Autowired
	private ReviewFeedbackService reviewFeedbackService;

	@PostMapping
	public ResponseEntity<List<ReviewFeedbackDTO>> createReviewFeedback(
			@RequestBody ReviewFeedbackDTO reviewFeedbackList) {
		List<ReviewFeedbackDTO> createdFeedbacks = reviewFeedbackService
				.createReviewFeedback(Arrays.asList(reviewFeedbackList));
		return new ResponseEntity<>(createdFeedbacks, HttpStatus.CREATED);
	}
//    
//    @PostMapping
//    public ResponseEntity<List<ReviewFeedbackDTO>> createReviewFeedbacks(@RequestBody List<ReviewFeedbackDTO> reviewFeedbackList) {
//    	List<ReviewFeedbackDTO> createdFeedbacks = reviewFeedbackService.createReviewFeedback(reviewFeedbackList);
//    	return new ResponseEntity<>(createdFeedbacks, HttpStatus.CREATED);
//    }

	@GetMapping
	public ResponseEntity<List<ReviewFeedbackDTO>> getAllReviewFeedbacks() {
		List<ReviewFeedbackDTO> feedbacks = reviewFeedbackService.getAllReviewFeedbacks();
		return new ResponseEntity<>(feedbacks, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ReviewFeedbackDTO> getReviewFeedbackById(@PathVariable Integer id) {
		Optional<ReviewFeedbackDTO> feedback = reviewFeedbackService.getReviewFeedbackById(id);
		return feedback.map(reviewFeedback -> new ResponseEntity<>(reviewFeedback, HttpStatus.OK))
				.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteReviewFeedback(@PathVariable Integer id) {
		reviewFeedbackService.deleteReviewFeedback(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}

package com.bluetech.protech.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluetech.protech.pojo.ReviewFeedback;
import com.bluetech.protech.repository.ReviewFeedbackRepository;
import com.bluetech.protech.service.ReviewFeedbackService;

@Service
public class ReviewFeedbackServiceImpl implements ReviewFeedbackService {

	  @Autowired
	    private ReviewFeedbackRepository reviewFeedbackRepository;

	    public List<ReviewFeedback> createReviewFeedback(List<ReviewFeedback> reviewFeedbackList) {
	        return reviewFeedbackRepository.saveAll(reviewFeedbackList);
	    }

	    public List<ReviewFeedback> getAllReviewFeedbacks() {
	        return reviewFeedbackRepository.findAll();
	    }

	    public Optional<ReviewFeedback> getReviewFeedbackById(Integer id) {
	        return reviewFeedbackRepository.findById(id);
	    }

	    public void deleteReviewFeedback(Integer id) {
	        reviewFeedbackRepository.deleteById(id);
	    }
}

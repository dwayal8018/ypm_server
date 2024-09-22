package com.bluetech.protech.service;

import java.util.List;
import java.util.Optional;

import com.bluetech.protech.pojo.ReviewFeedback;

public interface ReviewFeedbackService {

	List<ReviewFeedback> createReviewFeedback(List<ReviewFeedback> reviewFeedbackList);

	List<ReviewFeedback> getAllReviewFeedbacks();

	Optional<ReviewFeedback> getReviewFeedbackById(Integer id);

	void deleteReviewFeedback(Integer id);

}

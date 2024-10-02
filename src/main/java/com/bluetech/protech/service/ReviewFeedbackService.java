package com.bluetech.protech.service;

import java.util.List;
import java.util.Optional;

import com.bluetech.protech.dto.ReviewFeedbackDTO;

public interface ReviewFeedbackService {

	List<ReviewFeedbackDTO> createReviewFeedback(List<ReviewFeedbackDTO> reviewFeedbackList);

	List<ReviewFeedbackDTO> getAllReviewFeedbacks();

	Optional<ReviewFeedbackDTO> getReviewFeedbackById(Integer id);

	void deleteReviewFeedback(Integer id);

}

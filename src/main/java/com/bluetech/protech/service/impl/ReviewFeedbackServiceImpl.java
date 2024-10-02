package com.bluetech.protech.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluetech.protech.dto.ReviewFeedbackDTO;
import com.bluetech.protech.mapstruct.MapstructImplNew;
import com.bluetech.protech.pojo.ReviewFeedback;
import com.bluetech.protech.repository.ReviewFeedbackRepository;
import com.bluetech.protech.service.ReviewFeedbackService;

@Service
public class ReviewFeedbackServiceImpl implements ReviewFeedbackService {

	@Autowired
	private ReviewFeedbackRepository reviewFeedbackRepository;

	@Autowired
	private MapstructImplNew mapstructImplNew;

	public List<ReviewFeedbackDTO> createReviewFeedback(List<ReviewFeedbackDTO> reviewFeedbackDTOList) {

		List<ReviewFeedback> reviewFeedbackList = mapstructImplNew
				.reviewFeedbackDTOsToReviewFeedbacks(reviewFeedbackDTOList);
		reviewFeedbackList = reviewFeedbackRepository.saveAll(reviewFeedbackList);
		return mapstructImplNew.reviewFeedbacksToReviewFeedbackDTOs(reviewFeedbackList);
	}

	public List<ReviewFeedbackDTO> getAllReviewFeedbacks() {
		return reviewFeedbackRepository.findAll().stream().map(mapstructImplNew::reviewFeedbackToReviewFeedbackDTO)
				.collect(Collectors.toList());
	}

	public Optional<ReviewFeedbackDTO> getReviewFeedbackById(Integer id) {
		return reviewFeedbackRepository.findById(id).map(mapstructImplNew::reviewFeedbackToReviewFeedbackDTO);
	}

	public void deleteReviewFeedback(Integer id) {
		reviewFeedbackRepository.deleteById(id);
	}
}

package com.pluralsight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.model.Assessment;
import com.pluralsight.repository.AssessmentRepository;

@Service("assessmentService")
public class AssessmentServiceImpl implements AssessmentService {

	@Autowired
	private AssessmentRepository assessmentRepository;
	
	@Transactional
	public Assessment save(Assessment assessment) {
		
		assessment = assessmentRepository.save(assessment);
		
		return assessment;
	}
}

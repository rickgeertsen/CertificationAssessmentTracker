package com.pluralsight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Assessment;

@Repository("assessmentRepository")
public interface AssessmentRepository  extends JpaRepository<Assessment, Long>{

}

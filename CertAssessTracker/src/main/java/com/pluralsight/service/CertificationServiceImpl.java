package com.pluralsight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.model.Certification;
import com.pluralsight.repository.CertificationRepository;

@Service("certificationService")
public class CertificationServiceImpl implements CertificationService {
	
	@Autowired
	private CertificationRepository cerrificationRepository;
	
	@Transactional
	public Certification save(Certification certification) {
		
		certification = cerrificationRepository.save(certification);
		
		return certification;
	}

}

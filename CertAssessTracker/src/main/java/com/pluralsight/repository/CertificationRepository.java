package com.pluralsight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Certification;

@Repository("certificationRepository")
public interface CertificationRepository extends JpaRepository<Certification, Long> {

}

package com.validation.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.validation.test.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Integer> {
    boolean existsByLeadId(Integer leadId);
}


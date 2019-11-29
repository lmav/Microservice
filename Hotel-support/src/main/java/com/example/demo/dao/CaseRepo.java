package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.CaseSupport;

public interface CaseRepo extends JpaRepository<CaseSupport, Long> {

}

package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.CaseRepo;
import com.example.demo.models.CaseSupport;

@Service
@Transactional
public class CaseService {

	@Autowired
	CaseRepo Ratings;

	public List<CaseSupport> getAllCases() {
		return Ratings.findAll();
	}

	public Optional<CaseSupport> getCaseById(long id) {
		return Ratings.findById(id);
	}

}

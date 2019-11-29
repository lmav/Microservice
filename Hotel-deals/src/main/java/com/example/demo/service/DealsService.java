package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.DealsRepo;
import com.example.demo.models.Deal;

@Service
@Transactional
public class DealsService {

	@Autowired
	DealsRepo Deals;

	public List<Deal> getAllDeals() {
		return Deals.findAll();
	}

	public Optional<Deal> getDealsById(long id) {
		return Deals.findById(id);
	}

}

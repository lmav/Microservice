package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Deal;
import com.example.demo.service.DealsService;

@RestController
public class MainController {

	@Autowired
	DealsService service;

	@GetMapping(path = "/deals")
	public List<Deal> getAllDeals() {
		return service.getAllDeals();
	}

	@GetMapping(path = "/deals/{id}")
	public Optional<Deal> getDealsById(@PathVariable("id") long id) {
		return service.getDealsById(id);
	}

}

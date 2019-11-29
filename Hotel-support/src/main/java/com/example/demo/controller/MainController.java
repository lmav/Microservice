package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.CaseSupport;
import com.example.demo.service.CaseService;

@RestController
public class MainController {

	@Autowired
	CaseService service;

	@GetMapping(path = "/cases/{id}")
	public Optional<CaseSupport> getCaseById(@PathVariable("id") long id) {
		return service.getCaseById(id);
	}

	@GetMapping(path = "/cases")
	public List<CaseSupport> getAllCases() {
		return service.getAllCases();
	}

}

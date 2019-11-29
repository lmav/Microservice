package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Deal;

public interface DealsRepo extends JpaRepository<Deal, Long> {

}

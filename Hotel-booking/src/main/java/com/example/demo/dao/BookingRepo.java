package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Booking;

public interface BookingRepo extends JpaRepository<Booking, Long> {

}

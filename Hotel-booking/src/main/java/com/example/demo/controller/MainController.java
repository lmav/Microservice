package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Booking;
import com.example.demo.service.BookingService;

@RestController
public class MainController {

	@Autowired
	BookingService service;

	@GetMapping(path = "/bookings")
	public List<Booking> getAllBooking() {
		return service.getAllBooking();
	}

	@GetMapping(path = "/bookings/{id}")
	public Optional<Booking> getBookingById(@PathVariable("id") long id) {
		return service.getBookingById(id);
	}

}

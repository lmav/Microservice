package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.BookingRepo;
import com.example.demo.models.Booking;

@Service
@Transactional
public class BookingService {

	@Autowired
	BookingRepo Booking;

	public List<Booking> getAllBooking() {
		return Booking.findAll();
	}

	public Optional<Booking> getBookingById(long id) {
		return Booking.findById(id);
	}

}

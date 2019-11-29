
package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.models.Booking;
import com.example.demo.models.CaseSupport;
import com.example.demo.models.Deal;

@RestController
public class MainController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping(path = "/deals")
	public List<Deal> getDeals() {
		ResponseEntity<Deal[]> response = restTemplate.getForEntity("http://HOTEL-DEALS-MICROSERVICE/deals",
				Deal[].class);
		Deal[] deals = response.getBody();
		return Arrays.asList(deals);

	}

	@GetMapping(path = "/bookings")
	public List<Booking> getbookings() {
		ResponseEntity<Booking[]> response = restTemplate.getForEntity("http://HOTEL-BOOKING-MICROSERVICE/bookings",
				Booking[].class);
		Booking[] bookings = response.getBody();
		return Arrays.asList(bookings);

	}

	@GetMapping(path = "/cases")
	public List<CaseSupport> getCases() {
		ResponseEntity<CaseSupport[]> response = restTemplate.getForEntity("http://HOTEL-SUPPORT-MICROSERVICE/cases",
				CaseSupport[].class);
		CaseSupport[] cases = response.getBody();
		return Arrays.asList(cases);

	}

}

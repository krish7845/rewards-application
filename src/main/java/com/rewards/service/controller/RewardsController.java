package com.rewards.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rewards.service.model.CustomerRewards;
import com.rewards.service.repository.RewardsService;

@RestController
public class RewardsController {

	
	@Autowired
	private RewardsService rewardsService;
	
	
	@GetMapping("/customers")
	public List<CustomerRewards> findCustomerAll() {
		return rewardsService.getCustomerAll();
	}
	
	@GetMapping("/customers/{id}")
	public ResponseEntity<CustomerRewards> getCustomer(@PathVariable Integer id) {
		CustomerRewards customer = rewardsService.getCustomerById(id);
		if (customer == null) return new ResponseEntity<CustomerRewards>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<CustomerRewards>(customer, HttpStatus.OK);
	}
	
	
}

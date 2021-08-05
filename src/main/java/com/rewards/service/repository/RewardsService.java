package com.rewards.service.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rewards.service.model.CustomerRewards;

@Service
public class RewardsService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	public List<CustomerRewards> getCustomerAll() {
		return customerRepository.findAll();
	}
	
	public CustomerRewards getCustomerById(Integer customerId) {
		return customerRepository.findById(customerId).orElse(null);
	}
	
//	public ResponseEntity<Customer> getCustomerById(Integer customerId) {
//		Customer customer = customerRepository.findById(customerId).orElse(null);
//		return new ResponseEntity<Customer>(customer, HttpStatus.NOT_FOUND);
//	}

}

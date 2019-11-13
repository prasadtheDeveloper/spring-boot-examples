package com.example.customerRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.customerRegistration.DTO.Customer;
import com.example.customerRegistration.service.CustomerService;


@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping(path="/register", consumes="application/json")
	public void addCustomer(@RequestBody Customer customer) {
		customerService.save(customer);
	}
	
	@GetMapping(path="/customer")
	public String getCustomer() {
		return "First Day Successfully Done";
	}
}

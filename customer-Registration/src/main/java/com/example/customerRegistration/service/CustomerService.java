package com.example.customerRegistration.service;

import org.springframework.stereotype.Service;

import com.example.customerRegistration.DTO.Customer;

public interface CustomerService {
	public void save(Customer customer);
	
}

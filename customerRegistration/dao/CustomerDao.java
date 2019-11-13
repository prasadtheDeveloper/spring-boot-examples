package com.example.customerRegistration.dao;

import org.springframework.stereotype.Repository;

import com.example.customerRegistration.DTO.Customer;

public interface CustomerDao {
	public String save(Customer customer);
}

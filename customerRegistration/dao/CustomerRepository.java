package com.example.customerRegistration.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.customerRegistration.DTO.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Long>{
	
}

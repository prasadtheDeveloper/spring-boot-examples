package com.example.customerRegistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customerRegistration.DTO.Customer;
import com.example.customerRegistration.dao.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("-------- we are in Customer Service ----------");
		customerDao.save(customer);
	}
	
}

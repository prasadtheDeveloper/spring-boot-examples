package com.example.customerRegistration.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.customerRegistration.DTO.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	

	@Autowired
	private CustomerRepository custrepository;
	 @Autowired
	 private DataSource datasource;
	
	  
	
	@Override
	public String save(Customer customer) {
		// TODO Auto-generated method stub
//		Session session = this.sessionfactory.openSession();
//		Transaction tx = session.beginTransaction();
//		session.persist(customer);
//		tx.commit();
//		session.close();
		System.out.println(customer.getCid());
		
		custrepository.save(customer);
		return null;
		
	}

}

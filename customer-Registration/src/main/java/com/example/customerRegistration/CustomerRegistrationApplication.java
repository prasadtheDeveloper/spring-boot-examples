package com.example.customerRegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.example"})
public class CustomerRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerRegistrationApplication.class, args);
	} 

}

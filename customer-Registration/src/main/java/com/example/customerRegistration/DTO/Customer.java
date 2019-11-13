package com.example.customerRegistration.DTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class Customer implements Serializable {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long cid;

private String name;

private long contact_number;

private String city;

protected Customer() {
	
}

public Customer(String name, long contact_number, String city) {
	this.name = name;
	this.contact_number = contact_number;
	this.city = city;
}
public Long getCid() {
	return cid;
}
public void setCid(Long cid) {
	this.cid = cid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getContact_number() {
	return contact_number;
}
public void setContact_number(long contact_number) {
	this.contact_number = contact_number;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}


	
}

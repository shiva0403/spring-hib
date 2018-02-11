package com.spring.hib.dao;

import java.util.List;

import com.spring.hib.model.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();
}

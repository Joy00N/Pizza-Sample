package com.yoon.repository;

import java.util.ArrayList;
import java.util.List;

import com.yoon.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.yoon.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstname("Yoon");
		customer.setLastname("Jo");
		customers.add(customer);
		return customers;
	}
}

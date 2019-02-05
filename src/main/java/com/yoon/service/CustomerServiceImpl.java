package com.yoon.service;

import java.util.List;

import com.yoon.model.Customer;
import com.yoon.repository.CustomerRepository;
import com.yoon.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	/* (non-Javadoc)
	 * @see com.yoon.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
}

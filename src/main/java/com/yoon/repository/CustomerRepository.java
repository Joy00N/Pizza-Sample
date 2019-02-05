package com.yoon.repository;

import java.util.List;

import com.yoon.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}
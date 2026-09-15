package com.nexturn.bankapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexturn.bankapp.entity.Customer;
import com.nexturn.bankapp.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepo;

	private int customerId = 1987230;

	@Override
	public Customer createCustomer(Customer customer) {

		customer.setCustomerId(customerId++);

		return customerRepo.save(customer);
	}
}
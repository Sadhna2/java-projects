package com.nexturn.bankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nexturn.bankapp.entity.Customer;
import com.nexturn.bankapp.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@PostMapping("/create")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {

		Customer savedCustomer = customerService.createCustomer(customer);

		return new ResponseEntity<>(savedCustomer, HttpStatus.OK);
	}
}
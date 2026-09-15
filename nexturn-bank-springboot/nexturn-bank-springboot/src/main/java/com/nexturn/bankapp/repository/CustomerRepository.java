package com.nexturn.bankapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nexturn.bankapp.entity.Customer;

public interface CustomerRepository
        extends JpaRepository<Customer, Integer> {

}

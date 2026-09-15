package com.nexturn.bankapp.exceptions;

public class CustomerNotFoundException extends RuntimeException {

    public CustomerNotFoundException(int customerId) {
        super("Customer not found: " + customerId);
    }
}

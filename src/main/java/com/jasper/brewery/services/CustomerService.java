package com.jasper.brewery.services;

import com.jasper.brewery.web.model.Customer;

import java.util.UUID;

public interface CustomerService {
    Customer getCustomerById(UUID id);
    void deleteCustomer(UUID id);
    void updateCustomer(UUID id, Customer customer);
    Customer postCustomer(Customer customer);
}

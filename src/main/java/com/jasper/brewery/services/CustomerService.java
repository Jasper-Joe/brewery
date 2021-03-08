package com.jasper.brewery.services;

import com.jasper.brewery.web.model.Customer;

import java.util.UUID;

public interface CustomerService {
    Customer getCustomerById(UUID id);
}

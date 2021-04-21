package com.jasper.brewery.services;

import com.jasper.brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID id);
    void deleteCustomer(UUID id);
    void updateCustomer(UUID id, CustomerDto customerDto);
    CustomerDto postCustomer(CustomerDto customerDto);
}

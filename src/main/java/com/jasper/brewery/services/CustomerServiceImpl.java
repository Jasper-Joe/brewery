package com.jasper.brewery.services;

import com.jasper.brewery.web.model.Customer;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService{


    @Override
    public Customer getCustomerById(UUID id) {
        return Customer.builder().name("Jason").id(id).build();
    }
}

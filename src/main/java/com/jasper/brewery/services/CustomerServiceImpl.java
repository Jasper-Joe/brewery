package com.jasper.brewery.services;

import com.jasper.brewery.web.model.BeerDto;
import com.jasper.brewery.web.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{


    @Override
    public Customer getCustomerById(UUID id) {
        return Customer.builder().name("Jason").id(id).build();
    }

    @Override
    public void deleteCustomer(UUID id) {
        log.debug("Deleting");

    }

    @Override
    public void updateCustomer(UUID id, Customer customer) {
        log.debug("Updating");
    }

    @Override
    public Customer postCustomer(Customer customer) {
        return Customer.builder()
                .id(UUID.randomUUID())
                .build();
    }

}

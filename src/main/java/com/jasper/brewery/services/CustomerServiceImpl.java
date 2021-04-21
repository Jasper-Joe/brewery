package com.jasper.brewery.services;

import com.jasper.brewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{


    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder().name("Jason").id(id).build();
    }

    @Override
    public void deleteCustomer(UUID id) {
        log.debug("Deleting");

    }

    @Override
    public void updateCustomer(UUID id, CustomerDto customerDto) {
        log.debug("Updating");
    }

    @Override
    public CustomerDto postCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

}

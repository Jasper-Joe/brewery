package com.jasper.brewery.web.mapper;

import com.jasper.brewery.domain.Customer;
import com.jasper.brewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDto dto);
    CustomerDto customerToCustomerDto(Customer customer);
}

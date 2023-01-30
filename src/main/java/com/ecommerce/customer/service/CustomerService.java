package com.ecommerce.customer.service;

import com.ecommerce.customer.model.Customer;
import com.ecommerce.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer getCustomerbyId(String customerId){
        HashSet orderIds = new HashSet<>();
        orderIds.add("Order-1");
        return new Customer("12","John Doe","john_doe@gmail.com",
        "123 Carlson Road, TX",orderIds);
    }
}

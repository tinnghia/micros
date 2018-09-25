package com.nd.repositories;

import com.nd.models.Customer;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CustomerRespository {

    public List<Customer> finalAll() {
        Customer customer1 = new Customer();
        customer1.setAge(25);
        customer1.setName("Customer 1");
        customer1.setId("id1");
        Customer customer2 = new Customer();
        customer2.setAge(27);
        customer2.setName("Customer 2");
        customer2.setId("id2");

        return Arrays.asList(customer1,customer2);
    }
}
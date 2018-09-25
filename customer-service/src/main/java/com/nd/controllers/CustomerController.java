package com.nd.controllers;

import com.nd.models.Customer;
import com.nd.repositories.CustomerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerRespository customerRespository;

    @GetMapping
    public ResponseEntity<List<Customer>> getAll() {
        return  new ResponseEntity<>(customerRespository.finalAll(), HttpStatus.OK);
    }
}

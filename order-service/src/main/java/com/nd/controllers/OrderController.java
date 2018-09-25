package com.nd.controllers;

import com.nd.models.Order;
import com.nd.repositories.OrderRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRespository orderRespository;

    @GetMapping
    public ResponseEntity<List<Order>> getAll() {
        return  new ResponseEntity<>(orderRespository.finalAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        return  new ResponseEntity<>(orderRespository.addOrder(order), HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Order> deleteOrder(@PathVariable("order") int order) {
        orderRespository.deleteOrder(order);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
}

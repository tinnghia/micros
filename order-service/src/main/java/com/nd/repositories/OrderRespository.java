package com.nd.repositories;

import com.nd.models.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrderRespository {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderRespository.class);

    Map<Integer, Order> orders = new HashMap<>();

    public List<Order> finalAll() {
        LOGGER.info("find all");
        return orders.values().stream().collect(Collectors.toList());
    }

    public Order addOrder(Order order) {
        LOGGER.info("add order {}", order);
        return orders.putIfAbsent(order.getId(),order);
    }

    public void deleteOrder(int order) {
        LOGGER.info("remove order {}" , order);
        orders.remove(order);
    }

    public Optional<Order> findOrder(int id) {
        LOGGER.info("find order {}", id);
        if(orders.containsKey(id))
            return Optional.of(orders.get(id));

        return Optional.empty();
    }
}
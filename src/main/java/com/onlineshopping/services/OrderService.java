package com.onlineshopping.services;

import com.onlineshopping.model.Orders;
import com.onlineshopping.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository){
        this.orderRepository=orderRepository;
    }
    public  void makeOrder(Orders orders){
        orderRepository.save(orders);
    }

    public List<Orders> findOrders(){
        return orderRepository.findAll();
    }



}

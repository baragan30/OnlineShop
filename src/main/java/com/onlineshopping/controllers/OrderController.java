package com.onlineshopping.controllers;

import com.onlineshopping.model.OrderText;
import com.onlineshopping.model.Orders;
import com.onlineshopping.services.MyUserDetailsService;
import com.onlineshopping.services.OrderService;
import com.onlineshopping.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller

public class OrderController {
    private final OrderService orderService;
    private final MyUserDetailsService userService;
    private final ProductService productService;


    @Autowired
    public  OrderController(OrderService orderService,MyUserDetailsService userService,ProductService productService){
        this.orderService=orderService;
        this.userService = userService;
        this.productService = productService;
    }

    @RequestMapping("/orders")
    public String show(final Model model){
        ArrayList<Orders> orders=new ArrayList(orderService.findOrders());
        ArrayList<OrderText> ot=new ArrayList<>();
        System.out.println(orders.get(0).getIdUser());
        if(!orders.isEmpty()) {
            for (Orders order : orders) {
                ot.add(new OrderText(order.getId(),
                        userService.findUserById(order.getIdUser()).getUsername(),
                        productService.findProductById(order.getIdProduct()).getName(),order.getIdProduct(),order.getCantity()));
            }
        }
        model.addAttribute("orders",ot);
        return "orders";
    }
}

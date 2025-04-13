package com.mystore.orders.controller;

import com.mystore.orders.dto.OrderRequest;
import com.mystore.orders.dto.OrderResponse;
import com.mystore.orders.dto.Product;
import com.mystore.orders.service.OrderService;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {


    @Autowired
    private OrderService orderService;
    
    

    @PostMapping("/placeOrder")
    public ResponseEntity<Object> placeOrder(@RequestBody OrderRequest orderRequest){
    	OrderResponse response = orderService.placeOrder(orderRequest);
        return ResponseEntity.ok(response);

    }

}
package com.example.ShoppingCart.Exception;

import com.example.ShoppingCart.Services.OrderService;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(String message){
        super(message);
    }
}

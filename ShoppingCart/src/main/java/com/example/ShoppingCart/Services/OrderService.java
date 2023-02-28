package com.example.ShoppingCart.Services;

import com.example.ShoppingCart.Exception.OrderNotFoundException;
import com.example.ShoppingCart.Model.OrderedPhone;

import java.util.List;

public interface OrderService {

    OrderedPhone addPhone(OrderedPhone orderedPhone);

    OrderedPhone getPhoneById(Integer id)throws OrderNotFoundException;

    List<OrderedPhone> getPhone();

    OrderedPhone updatePhone(Integer id,OrderedPhone orderedPhone)throws OrderNotFoundException;

    void deletePhone(Integer id)throws OrderNotFoundException;
}

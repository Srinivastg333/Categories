package com.example.ShoppingCart.Services;

import com.example.ShoppingCart.Exception.OrderNotFoundException;
import com.example.ShoppingCart.Model.OrderedPhone;
import com.example.ShoppingCart.Repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServicelmpl implements OrderService{

    @Autowired
    OrderRepo orderRepo;
    @Override
    public OrderedPhone addPhone(OrderedPhone orderedPhone)
    {
        return orderRepo.save(orderedPhone);
    }

    @Override
    public OrderedPhone getPhoneById(Integer id) throws OrderNotFoundException {
        return orderRepo.findById(id).orElseThrow(
                ()->new OrderNotFoundException("No Such Order ("+id+") Placed")
        );
    }

    @Override
    public List<OrderedPhone> getPhone() {
        return orderRepo.findAll();
    }

    @Override
    public OrderedPhone updatePhone(Integer id, OrderedPhone orderedPhone) throws OrderNotFoundException {
        OrderedPhone P1= orderRepo.findById(id).orElseThrow(
                ()->new OrderNotFoundException("No Such Order ("+id+") Placed"));
        P1.setOrderNo(orderedPhone.getOrderNo());
        P1.setName(orderedPhone.getName());
        P1.setPrice(orderedPhone.getPrice());
        P1.setCamera(orderedPhone.getCamera());
        P1.setDisplayType(orderedPhone.getDisplayType());
        P1.setPhoneType(orderedPhone.getPhoneType());
        P1.setStorage(orderedPhone.getStorage());
        return orderRepo.save(P1);
    }

    @Override
    public void deletePhone(Integer id) {
        OrderedPhone it = orderRepo.findById(id).orElseThrow(
                () -> new OrderNotFoundException("No such item found by id = "+id)
        );
        orderRepo.delete(it);
    }
}

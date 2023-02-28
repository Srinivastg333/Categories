package com.example.ShoppingCart.Controller;

import com.example.ShoppingCart.Model.OrderedPhone;
import com.example.ShoppingCart.Repository.OrderRepo;
import com.example.ShoppingCart.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v3")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/orders")
    public ResponseEntity<OrderedPhone> addPhone(@RequestBody OrderedPhone orderedPhone){
        return new ResponseEntity<OrderedPhone>(orderService.addPhone(orderedPhone), HttpStatus.CREATED);
    }
    @GetMapping("/orders/{id}")
    public ResponseEntity<OrderedPhone> getPhone(@PathVariable("id") Integer id)
    {
        return ResponseEntity.ok().body(orderService.getPhoneById(id));
    }
    @GetMapping("/orders")
    public List<OrderedPhone> getPhone(){
        return orderService.getPhone();
    }

    @PutMapping("/orders/{id}")
    public ResponseEntity<OrderedPhone> updatePhone(@PathVariable("id") Integer id, @RequestBody OrderedPhone orderedPhone){
        return ResponseEntity.ok((orderService.updatePhone(id,orderedPhone)));
    }
    @DeleteMapping("orders/{id}")
    public ResponseEntity<Object> deletePhone(@PathVariable("id") int id){
        orderService.deletePhone(id);
        return new ResponseEntity<>("",HttpStatus.NO_CONTENT);
    }
}

package com.example.ShoppingCart.Repository;

import com.example.ShoppingCart.Model.OrderedPhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<OrderedPhone,Integer> {

}

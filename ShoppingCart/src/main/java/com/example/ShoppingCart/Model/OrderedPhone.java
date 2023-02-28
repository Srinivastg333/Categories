package com.example.ShoppingCart.Model;

import lombok.*;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class OrderedPhone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String OrderNo;

    String Name;

    double Price;

    String Camera;

    String DisplayType;

    String PhoneType;
    String Storage;
}

package com.jmrk.app.ShoppingCart.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Shipping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private String shippingMethod; // Modify
    private String shippingStatus; // Modify


}

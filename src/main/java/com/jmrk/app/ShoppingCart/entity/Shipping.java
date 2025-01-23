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

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String zipCode;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String shippingMethod; // Modify

    @Column(nullable = false)
    private String shippingStatus; // Modify


}

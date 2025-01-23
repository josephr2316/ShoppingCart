package com.jmrk.app.ShoppingCart.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.id.IncrementGenerator;

import java.math.BigDecimal;

@Data
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private BigDecimal tPrice;
}

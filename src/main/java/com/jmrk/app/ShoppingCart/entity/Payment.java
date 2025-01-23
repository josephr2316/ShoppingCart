package com.jmrk.app.ShoppingCart.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private String paymentMethod; // Modify
    private LocalDate paymentDate;
    private BigDecimal amount;
    private String paymentStatus; // Modify
}

package com.jmrk.app.ShoppingCart.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @Column(nullable = false)
    private String invoiceNumber; // number for accountability, legal complain, and customer communication

    @Column(nullable = false)
    private LocalDate invoiceDate; // issueDate

    @Column(nullable = false)
    private BigDecimal totalAmount;

    @Column(nullable = false)
    private String billingAddress;

}

package com.jmrk.app.ShoppingCart.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.apachecommons.CommonsLog;
import org.hibernate.id.IncrementGenerator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private LocalDateTime orderDate;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private String trackingNumber;

    @Column(nullable = false)
    private BigDecimal totalPrice;

    @OneToMany(mappedBy = "Order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;
}

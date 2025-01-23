package com.jmrk.app.ShoppingCart.entity;

public enum OrderStatus {
    PENDING,       // Order created but awaiting confirmation/payment
    CONFIRMED,     // Payment confirmed or order approved
    PROCESSING,    // Order being prepared for shipment
    SHIPPED,       // Order shipped to the customer
    OUT_FOR_DELIVERY, // Order is out for delivery
    DELIVERED,     // Order delivered to the customer
    COMPLETED,     // Fully resolved and no further actions
    CANCELED,      // Order canceled before fulfillment
    RETURNED,      // Order returned by the customer
    REFUNDED,      // Payment refunded to the customer
    FAILED,        // Order failed (e.g., payment or system issue)
    ON_HOLD,       // Order paused for some reason
    DISPUTED       // Order under dispute between buyer and seller
}

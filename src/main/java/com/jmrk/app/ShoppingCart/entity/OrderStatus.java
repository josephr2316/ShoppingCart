package com.jmrk.app.ShoppingCart.entity;

import lombok.Getter;

@Getter
public enum OrderStatus {
    PENDING ("Pending"),       // Order created but awaiting confirmation/payment
    CONFIRMED("Confirmed"),     // Payment confirmed or order approved
    PROCESSING("Processing"),    // Order being prepared for shipment
    SHIPPED("Shipped"),       // Order shipped to the customer
    OUT_FOR_DELIVERY("Out of delivery"), // Order is out for delivery
    DELIVERED("Delivered"),     // Order delivered to the customer
    COMPLETED("Completed"),     // Fully resolved and no further actions
    CANCELED("Canceled"),      // Order canceled before fulfillment
    RETURNED("Returned"),      // Order returned by the customer
    REFUNDED("Refunded"),      // Payment refunded to the customer
    FAILED("Failed"),        // Order failed (e.g., payment or system issue)
    ON_HOLD("On hold"),       // Order paused for some reason
    DISPUTED("Disputed")       // Order under dispute between buyer and seller

    private final String displayName;

    OrderStatus(String displayName) {
        this.displayName = displayName;
    }

}

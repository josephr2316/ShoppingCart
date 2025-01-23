package com.jmrk.app.ShoppingCart.entity;

import lombok.Getter;

@Getter
public enum OrderStatus {
    PENDING ("PENDING"),       // Order created but awaiting confirmation/payment
    CONFIRMED("CONFIRMED"),     // Payment confirmed or order approved
    PROCESSING("PROCESSING"),    // Order being prepared for shipment
    SHIPPED("SHIPPED"),       // Order shipped to the customer
    OUT_FOR_DELIVERY("OUT OF DELIVERY"), // Order is out for delivery
    DELIVERED("DELIVERED"),     // Order delivered to the customer
    COMPLETED("COMPLETED"),     // Fully resolved and no further actions
    CANCELED("CANCELED"),      // Order canceled before fulfillment
    RETURNED("RETURNED"),      // Order returned by the customer
    REFUNDED("REFUNDED"),      // Payment refunded to the customer
    FAILED("FAILED"),        // Order failed (e.g., payment or system issue)
    ON_HOLD("ON HOLD"),       // Order paused for some reason
    DISPUTED("DISPUTED")       // Order under dispute between buyer and seller

    private final String displayName;

    OrderStatus(String displayName) {
        this.displayName = displayName;
    }

}

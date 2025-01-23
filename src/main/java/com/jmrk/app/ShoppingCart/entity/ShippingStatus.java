package com.jmrk.app.ShoppingCart.entity;

import lombok.Getter;

@Getter
public enum ShippingStatus {
    PENDING("Pending"),          // Shipping has not started yet
    PROCESSING("Precessing"),       // Order is being prepared for shipment
    SHIPPED("Shipped"),          // Order has been shipped out for delivery
    OUT_FOR_DELIVERY("Out of delivery"), // Order is on its way to the customer
    DELIVERED("Delivered"),        // Order has been delivered successfully
    RETURNED("Returned"),         // Customer returned the shipment
    CANCELLED("Cancelled"),        // Shipping was cancelled
    LOST("Lost");              // Shipment is lost in transit

    private final String displayName;

    ShippingStatus(String displayName) {
        this.displayName = displayName;
    }
}

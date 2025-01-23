package com.jmrk.app.ShoppingCart.entity;

import lombok.Getter;

@Getter
public enum PaymentStatus {
    PENDING("Pending"),
    COMPLETED("Completed"),
    FAILED("Failed"),
    REFUNDED("Refunded"),
    CANCELED("Canceled"),
    AUTHORIZED("Authorized"),
    PARTIALLY_REFUNDED("Partially Refunded");

    private final String displayName;

    PaymentStatus(String displayName) {
        this.displayName = displayName;
    }

}
